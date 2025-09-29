Observers Module:

Purpose
     This module applies the Observer Pattern to automatically trigger device actions when room state changes.  

Key Files
    - Observer.java→ Interface for all observers.  
    - AC.java → Turns AC on/off when occupancy changes.  
    - Lights.java → Turns lights on/off when occupancy changes.  

Responsibilities
    - Subscribe to `Room` state changes.  
    - React automatically (turn on/off devices).  
    - Keep device logic independent from room logic.  

Why It Matters
    This design ensures "loose coupling":  
    Rooms don’t need to know how devices work, they only notify observers.  
    It’s easy to extend by adding new observers (e.g., Projector, Heater).
