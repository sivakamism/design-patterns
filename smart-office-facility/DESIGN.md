# 🚀 Smart Office Facility (Console Application)

## 🌟 Overview
This project is a **console-based Java application** that simulates a smart office facility.  
It allows configuration of meeting rooms, booking/cancellation, occupancy detection, and automatic control of devices like AC and Lights.  

The project was built to **demonstrate clean coding practices and design patterns (Singleton, Observer, Command)** while handling **real-world scenarios** like authentication, notifications, and usage statistics.

---

## ✨ Key Features
- 🏢 **Room Management**: Configure number of rooms and their capacity.
- 📅 **Booking System**: Book and cancel conference room reservations.
- 👥 **Occupancy Detection**: Detects if at least 2 people are in a room to mark it occupied.
- ❌ **Auto-Release Bookings**: Bookings released if room stays empty (manual check via `room status`).
- ❄️💡 **Smart Devices**: AC and Lights automatically turn on/off based on occupancy.
- 📊 **Usage Statistics**: Track how many times a room was booked and total occupied time.
- 🔒 **Authentication**: Secure access — only logged-in users can configure or book.
- 📢 **Notifications**: Simulated alerts when bookings are released.

---

## 🛠️ Design Patterns Implemented
1. **Singleton** → `Office.java`  
   - One central office configuration across the entire app.

2. **Observer** → `Room` notifies `AC` and `Lights`  
   - Devices respond automatically to occupancy changes.

3. **Command** → `BookRoomCommand`, `CancelRoomCommand`, etc.  
   - Encapsulates user actions for flexibility and maintainability.

