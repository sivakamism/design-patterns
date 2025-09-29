# 👀 Observers Module

This folder implements the **Observer Pattern** for smart device automation.

## 📌 Files
- **Observer.java**
  - Interface for all observers (devices).

- **AC.java**
  - Observer that simulates turning AC on/off based on occupancy.

- **Lights.java**
  - Observer that simulates turning lights on/off based on occupancy.

## ✨ Why It Matters
- Demonstrates real-world **event-driven programming**.
- Devices are **loosely coupled** to rooms:
  - Room doesn’t care *what* observers do.
  - Observers react automatically to room state changes.
- Easy to extend:
  - Add a `Projector.java` or `Heater.java` observer without touching existing logic.

## 💡 Example Flow
Room Occupancy Changes → Room notifies Observers → AC/Lights update state