package com.example.ridesync;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.bumptech.glide.Glide;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.AutocompleteActivity;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import java.util.Map;
import java.util.Random;

public class RideRequestActivity extends AppCompatActivity  {
//    private EditText etPickup, etDropoff;
//    private Spinner spinnerRideCategory;
//    private TextView tvEstimatedFare;
//    private Button btnRequestRide;
//    private DatabaseReference rideRequestRef;
//    private FirebaseAuth auth;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_ride_request);
//
//        // Initialize Firebase
//        auth = FirebaseAuth.getInstance();
//        rideRequestRef = FirebaseDatabase.getInstance().getReference("RideRequests");
//
//        // Initialize UI components
//        etPickup = findViewById(R.id.etPickup);
//        etDropoff = findViewById(R.id.etDropoff);
//        spinnerRideCategory = findViewById(R.id.spinnerRideCategory);
//        tvEstimatedFare = findViewById(R.id.tvEstimatedFare);
//        btnRequestRide = findViewById(R.id.btnRequestRide);
//
//// Load array from strings.xml
//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
//                this, R.array.ride_categories, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//// Set adapter to spinner
//        spinnerRideCategory.setAdapter(adapter);
//        // Request Ride Button Click Listener
//        btnRequestRide.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                requestRide();
//            }
//        });
//    }
//
//    private void requestRide() {
//        String pickup = etPickup.getText().toString().trim();
//        String dropoff = etDropoff.getText().toString().trim();
//        String rideCategory = spinnerRideCategory.getSelectedItem().toString();
//
//        if (pickup.isEmpty() || dropoff.isEmpty()) {
//            Toast.makeText(this, "Please enter pickup and drop-off locations", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
//        // Generate Ride Request Data
//        String requestId = rideRequestRef.push().getKey();
//        Map<String, Object> rideData = new HashMap<>();
//        rideData.put("userId", auth.getCurrentUser().getUid());
//        rideData.put("pickup", pickup);
//        rideData.put("dropoff", dropoff);
//        rideData.put("rideCategory", rideCategory);
//        rideData.put("status", "Pending");
//
//        // Store Ride Request in Firebase
//        rideRequestRef.child(requestId).setValue(rideData)
//                .addOnSuccessListener(aVoid -> {
//                    Toast.makeText(RideRequestActivity.this, "Ride Requested!", Toast.LENGTH_SHORT).show();
//                    startActivity(new Intent(RideRequestActivity.this, MapScreen.class));
//                })
//                .addOnFailureListener(e -> Toast.makeText(RideRequestActivity.this, "Failed to request ride", Toast.LENGTH_SHORT).show());
//    }
//}

    private AutoCompleteTextView etPickup, etDropoff;
    private Spinner spinnerRideCategory;
    private TextView tvEstimatedFare;
    private Button btnRequestRide;
    private DatabaseReference rideRequestRef, countRef;
    private FirebaseAuth auth;

    private static final int AUTOCOMPLETE_REQUEST_CODE_PICKUP = 1;
    private static final int AUTOCOMPLETE_REQUEST_CODE_DROPOFF = 2;


    // Extra
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private TextView tvProfileName, tvProfileEmail;
    private ImageView imgProfile, btnMenu;
//Extre end

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride_request);

        // Initialize Firebase
        auth = FirebaseAuth.getInstance();
        rideRequestRef = FirebaseDatabase.getInstance().getReference("RideRequests");
        countRef = FirebaseDatabase.getInstance().getReference("RideRequestCount");

        // Initialize Places API
        if (!Places.isInitialized()) {
            Places.initialize(getApplicationContext(), "GOOGLE_API_KEY");
        }

        // Initialize UI components
        etPickup = findViewById(R.id.etPickup);
        etDropoff = findViewById(R.id.etDropoff);
        spinnerRideCategory = findViewById(R.id.spinnerRideCategory);
        tvEstimatedFare = findViewById(R.id.tvEstimatedFare);
        btnRequestRide = findViewById(R.id.btnRequestRide);
//Extra start
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        View headerView = navigationView.getHeaderView(0);
        tvProfileName = headerView.findViewById(R.id.tvProfileName);
        tvProfileEmail = headerView.findViewById(R.id.tvProfileEmail);
        imgProfile = headerView.findViewById(R.id.imgProfile);


        FirebaseUser user = auth.getCurrentUser();
        if (user != null) {
            tvProfileName.setText(user.getDisplayName());
            tvProfileEmail.setText(user.getEmail());
            Glide.with(this).load(user.getPhotoUrl()).into(imgProfile);
        }

        navigationView.setNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.nav_logout) {
                auth.signOut();
                startActivity(new Intent(this, LoginScreen.class));
                finish();
            }
            return true;
        });
        //Extra End
        // Load array from strings.xml
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.ride_categories, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRideCategory.setAdapter(adapter);

        // Autocomplete for Pickup and Drop-off
        etPickup.setOnClickListener(v -> startAutocomplete(AUTOCOMPLETE_REQUEST_CODE_PICKUP));
        etDropoff.setOnClickListener(v -> startAutocomplete(AUTOCOMPLETE_REQUEST_CODE_DROPOFF));

        // Request Ride Button Click Listener
        btnRequestRide.setOnClickListener(v -> requestRide());
    }

    private void startAutocomplete(int requestCode) {
        List<Place.Field> fields = Arrays.asList(Place.Field.ID, Place.Field.NAME, Place.Field.ADDRESS);
        Intent intent = new Autocomplete.IntentBuilder(AutocompleteActivityMode.OVERLAY, fields)
                .build(this);
        startActivityForResult(intent, requestCode);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && data != null) {
            Place place = Autocomplete.getPlaceFromIntent(data);
            if (requestCode == AUTOCOMPLETE_REQUEST_CODE_PICKUP) {
                etPickup.setText(place.getAddress());
            } else if (requestCode == AUTOCOMPLETE_REQUEST_CODE_DROPOFF) {
                etDropoff.setText(place.getAddress());
            }
            int minFare = 50;
            int maxFare = 500;
            int estimatedFare = new Random().nextInt((maxFare - minFare) + 1) + minFare;

            // Display estimated fare
            tvEstimatedFare.setText("Estimated Fare: ₹" + estimatedFare);
        } else if (resultCode == AutocompleteActivity.RESULT_ERROR) {
            Status status = Autocomplete.getStatusFromIntent(data);

            Toast.makeText(this, "Error: " + status.getStatusMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void requestRide() {
        String pickup = etPickup.getText().toString().trim();
        String dropoff = etDropoff.getText().toString().trim();
        String rideCategory = spinnerRideCategory.getSelectedItem().toString();

        if (pickup.isEmpty() || dropoff.isEmpty()) {
            Toast.makeText(this, "Please enter pickup and drop-off locations", Toast.LENGTH_SHORT).show();
            return;
        }


        // Generate Ride Request Data
        String requestId = rideRequestRef.push().getKey();
        Map<String, Object> rideData = new HashMap<>();
        rideData.put("userId", auth.getCurrentUser().getUid());
        rideData.put("pickup", pickup);
        rideData.put("dropoff", dropoff);
        rideData.put("rideCategory", rideCategory);
        rideData.put("status", "Pending");

        rideRequestRef.child(requestId).setValue(rideData).addOnSuccessListener(aVoid -> updateRideCount( requestId));
    }

    private void updateRideCount(String reqId) {
        countRef.get().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                int currentCount = task.getResult().exists() ? task.getResult().getValue(Integer.class) : 0;
                startActivity(new Intent(RideRequestActivity.this, MapScreen.class));
                new Handler().postDelayed(()->{completeRide(reqId);},2000);
                countRef.setValue(currentCount + 1)
                        .addOnSuccessListener(aVoid -> Toast.makeText(this, "Ride Requested!", Toast.LENGTH_SHORT).show());
            }
        });

    }
    private void completeRide(String requestId) {
        rideRequestRef.child(requestId).child("status").setValue("Completed")
                .addOnSuccessListener(aVoid ->
                        Toast.makeText(this, "Ride Completed!", Toast.LENGTH_SHORT).show()
                )
                .addOnFailureListener(e ->
                        Toast.makeText(this, "Failed to update ride status", Toast.LENGTH_SHORT).show()
                );
    }

}
