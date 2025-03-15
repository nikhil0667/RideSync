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
![Image](https://github.com/user-attachments/assets/cb6270a8-e8aa-4e88-9971-440834df4290)
![Image](https://github.com/user-attachments/assets/cfa33b07-f260-4691-a946-882f8fda27ee)
![Image](https://github.com/user-attachments/assets/928a570b-5eaf-428e-bf99-2c7c9d484d72)
![Image](https://github.com/user-attachments/assets/16d303f7-b0f6-4eae-9c09-828b6a902bf8)
![Image](https://github.com/user-attachments/assets/6a24f3d4-2dd9-452f-8b67-623403a33b34)
![Image](https://github.com/user-attachments/assets/3fa381ba-da62-4fa1-a061-0bcf30f758b8)
![Image](https://github.com/user-attachments/assets/ff359e31-058d-49be-85bf-9732b9711bef)
![Image](https://github.com/user-attachments/assets/c8b5409c-d6bb-4589-8646-8fcaf6c8c0f7)
![Image](https://github.com/user-attachments/assets/045d2d30-6dc0-47d3-a810-91fb6ae5e4b2)
![Image](https://github.com/user-attachments/assets/105847b7-6e4c-47e0-87aa-a002b557f662)
![Image](https://github.com/user-attachments/assets/5b14bd53-cd1a-4839-806c-e169d8f00ec5)
