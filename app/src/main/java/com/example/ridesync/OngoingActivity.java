package com.example.ridesync;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OngoingActivity extends AppCompatActivity {
ProgressBar progressBar;
        Button btnGetStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ongoing);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        progressBar = findViewById(R.id.progress_loader);
        btnGetStarted = findViewById(R.id.btn_get_started);

        // Simulate loading for 3 seconds
        new Handler().postDelayed(() -> {
            progressBar.setVisibility(View.GONE);
            btnGetStarted.setVisibility(View.VISIBLE);
        }, 3000);

        btnGetStarted.setOnClickListener(view -> {
            Intent intent = new Intent(OngoingActivity.this, LoginScreen.class);
            startActivity(intent);
            finish();
        });
    }
}