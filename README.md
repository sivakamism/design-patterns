Exercise 1 – Design Pattern Use Cases

Observer (Stock & Investors) – Stock price changes → all subscribed investors auto-notified.

Strategy (Shipping) – Switch between Standard, Express, Free shipping at runtime.

Factory (Notifications) – Create Email, SMS, Push notifications via central factory.

Singleton (Logger) – One global Logger instance for consistent logging.

Adapter (Media Player) – Extend MP3 player to support MP4 via adapter.

Decorator (Text Formatting) – Dynamically add Bold/Italic/Underline to text.


Exercise 2 – Smart Office Facility (Console Application)

Overview

A Java console app simulating a smart office facility.
Supports room management, booking/cancellation, occupancy detection, and device automation (AC & Lights).
Built to apply Singleton, Observer, and Command patterns with features like authentication, notifications, and usage statistics.

Key Features

 Configure rooms and set capacity.
 Book/cancel conference rooms.
 Detect occupancy (≥2 people = occupied).
 Auto-release bookings (via `room status`).
 Devices (AC, Lights) auto on/off.
 Track usage stats (bookings, occupied time).
 Authentication for secure access.
 Console notifications on booking release.

Patterns Implemented

Singleton → `Office.java` ensures one central configuration.
Observer → `Room` notifies `AC` & `Lights`.
Command → Encapsulates actions like booking, cancel, config.