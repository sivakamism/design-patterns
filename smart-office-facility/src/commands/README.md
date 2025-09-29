
---

# 📂 `src/commands/README.md`
```markdown
# ⚡ Commands Module

This folder implements the **Command Pattern**, encapsulating user actions as objects.

## 📌 Files
- **Command.java**
  - Interface with a single method: `execute()`.

- **BookRoomCommand.java**
  - Encapsulates the action of booking a room.

- **CancelRoomCommand.java**
  - Encapsulates the action of cancelling a booking.

- **ConfigCapacityCommand.java**
  - Encapsulates setting maximum room capacity.

- **AddOccupantCommand.java**
  - Encapsulates adding occupants to a room.

## ✨ Why It Matters
- Decouples `SmartOfficeApp` from the actual logic.
- Each action is self-contained and reusable.
- Makes the system **flexible and extensible**:
  - Adding a new feature = just create a new command.
  - No need to modify existing logic.

## 💡 Example
```java
Command cmd = new BookRoomCommand(room, "09:00", 60);
cmd.execute();
