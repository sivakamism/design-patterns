# 🎯 Main Module

This folder contains the **entry point** of the Smart Office Facility application.

## 📌 File: `SmartOfficeApp.java`
- Acts as the **controller** of the entire system.
- Reads user commands from the **console** and delegates them.
- Enforces **authentication** before sensitive operations (config, booking, cancellation).
- Keeps the UI (console input/output) separate from the business logic.

## ✨ Why It Matters
- Demonstrates **Single Responsibility Principle** → handles only input parsing and routing.
- Clear separation of concerns makes the code **maintainable**.
- New commands can be added easily without modifying the controller logic.

## 💡 Example Flow
User Input → SmartOfficeApp → Command Object → Core Logic → Console Output