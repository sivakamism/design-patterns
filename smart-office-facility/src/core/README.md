Core Module:

Purpose
   This module contains the "business logic" and core classes of the Smart Office Facility.  
   It implements state management, authentication, and notifications.

Key Classes
    - Office.java → Singleton, manages global office configuration and rooms.  
    - Room.java → Represents a conference room, handles bookings, occupancy, statistics.  
    - User.java → Defines system users.  
    - AuthManager.java → Manages login sessions and authentication rules.  
    - Notifier.java → Simulates notifications (console-based).

Responsibilities
    - Manage rooms and bookings  
    - Enforce occupancy rules  
    - Track usage statistics  
    - Authenticate users  
    - Send notifications when bookings are released  

Why It Matters
     This is the "domain layer" of the application.  
     It encapsulates all business rules, making the system consistent and extensible.
