# **RIDE-SHARING APP PROTOTYPE**
**Company** : CODTECH IT SOLUTIONS

**Name** : Khambhayta Nikhil Pravinbhai

**Intern ID** : CT08VDB

**Domain** : ANDROID DEVELOPMENT

**Duration** : 4 WEEKS

**Mentor** : NEELA SANTOSH

### **Project Overview**
As part of my **Android Development Internship** at **CodTech IT Solutions**, I am developing a  **Ride-Sharing App Prototype**. This app is designed to allow users to **request rides, track their location, and view driver details**.
The app is being developed using **Java** and integrates the **Google Maps SDK** for real-time **location tracking**. The backend is powered by **Firebase**, which handles **user authentication, ride requests, and driver data storage**.

The primary goal is to create a **functional ride-sharing system** that enables **seamless communication** between riders and drivers, ensuring an efficient transportation experience.

## **Key Features**
### **1. User Authentication**
 Users can **sign up and log in** using **Firebase Authentication**.
  
### **2. Location Tracking (Google Maps SDK)**

 The app fetches the **user’s current location** using the **Fused Location API**.
### **3. Ride Request Functionality**
  Users can **request a ride**, and the request is stored in **Firebase Firestore**.
  
  Nearby drivers receive ride requests **in real time**.
### **4. Driver Details Display**
  Once a ride is confirmed, users can **view the driver’s name, phone number, and vehicle details**.
### **5. Live Ride Tracking**
  Users can **track their ride** on the map in **real time**.
### **6. Ride History Storage**
  Past rides are stored in **Firebase Firestore** for reference.
## **Technologies and Tools Used**

**Android Studio** - Development Environment

**Java** -	Primary programming language

**Google Maps SDK** -	Real-time location tracking

**Fused Location API** - Fetches user and driver locations

**Firebase Authentication** -	User login and registration

**Firebase Firestore** -	Stores ride requests and driver details

**Firebase Realtime Database** -	Updates ride status dynamically

## **Step-by-Step Implementation**
### **1. Project Setup & Dependencies**
  Created a new **Android Studio project**.
  
  Integrated **Google Maps SDK** and **Firebase Authentication**.
### **2. UI Design**
  Designed a **simple and interactive UI with**:
  
  **Login & Registration Screens**
  
  **Ride Request Button**
  
  **Map View for Live Tracking**
### **3. Fetching User’s Location**
  Implemented **Fused Location API** to retrieve the **user’s real-time GPS location**.

  *Displayed the location on **Google Maps** using **Marker and Polyline**.
### **4. Implementing Ride Request Feature**

  Users tap the **“Request Ride”** button to send a ride request.
  
  The request is **stored in Firebase Firestore**, including:
  
  **User’s pickup location**
  
  **Destination**
  
  **Ride status (Pending, Accepted, Completed)**

### **5. Assigning a Driver**

  When a driver accepts a ride request:
  
  The user sees the **driver’s details**.
  
  The driver’s location is tracked in  **real-time** on Google Maps.
### **6. Live Ride Tracking**
  Used **Firebase Realtime Database** to update ride status dynamically.
  
  Displayed the **driver’s movement** using **Google Maps SDK**.
### **7. Storing Ride History**
  Implemented **Firebase Firestore** to store **past rides** for future reference.

## **Challenges & Solutions**
 
**Fetching Real-Time Location**  --  Used **Fused Location API** for accurate GPS tracking.

**Ride Request Not Updating in Real Time** --	Used **Firebase Realtime Database** to update ride status dynamically.

**Handling Google Maps API Key Restrictions** --	Secured API keys using **Google Cloud Console** settings.

## **Unique Features & Enhancements**
✔ **Google Maps Integration** – Provides **real-time location tracking**.

✔ **Ride History Management** – Users can view **past rides**.

✔ **Firebase-Powered Backend** – Ensures **secure data storage and real-time updates**.

## **Learning Outcomes**
Through this project, I have gained hands-on experience in:

✅ **Google Maps SDK** for location tracking.

✅ **Firebase Authentication & Firestore** for user authentication and data storage.

✅ **Real-time database updates** using **Firebase Realtime Database**.

✅ **Handling Google API restrictions** for improved security.

✅ **Android UI/UX design principles** for **seamless user experience**.

Additionally, I have improved my **problem-solving skills** by implementing **real-time ride tracking** and **ride request management**.

# **Screen**
![Image](https://github.com/user-attachments/assets/00e99501-827a-439b-8dba-a560ff1aa2b6)
![Image](https://github.com/user-attachments/assets/c646a30b-fa3e-4cce-a2eb-7b5f75b7914e)
![Image](https://github.com/user-attachments/assets/9e74eb32-9e8b-4267-9002-2e8e203fb242)
![Image](https://github.com/user-attachments/assets/5877cf05-f542-410c-9c5c-e34718d43339)
![Image](https://github.com/user-attachments/assets/0b28909f-53fc-4ffa-8131-2da23a755c05)
![Image](https://github.com/user-attachments/assets/8572dc34-b23a-40b0-9b0c-b606e6cecf5e)
![Image](https://github.com/user-attachments/assets/f0cae6ec-d4c6-4950-b63d-739fcb6941d9)
![Image](https://github.com/user-attachments/assets/695fd455-0808-4b58-8bbd-f72d65c36fd2)
![Image](https://github.com/user-attachments/assets/bed2a74e-1baf-4330-b25d-a842fcf321c5)
![Image](https://github.com/user-attachments/assets/f37939f6-fd70-493c-a7cf-1c3a768bc13e) 
