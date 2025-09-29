
---

# 📂 `src/core/README.md`
```markdown
# 🏢 Core Module

This folder contains the **business logic** of the Smart Office Facility.

## 📌 Key Classes
- **Office.java (Singleton)**
  - Manages all rooms in the facility.
  - Ensures only one office configuration exists globally.

- **Room.java**
  - Represents a conference room.
  - Handles booking, cancellation, occupancy, and usage statistics.
  - Notifies observers (AC, Lights) about occupancy changes.

- **User.java**
  - Represents a system user with credentials.

- **AuthManager.java**
  - Handles login and authentication checks.
  - Restricts configuration and booking features to authenticated users.

- **Notifier.java**
  - Simulates email/SMS notifications by printing to the console.
  - Demonstrates how external integrations can be plugged in.

## ✨ Why It Matters
- Centralized state management via **Singleton**.
- Real-world concerns: **authentication, booking, occupancy, notifications**.
- Clean OOP separation → easier to extend (e.g., add new notification channels).

