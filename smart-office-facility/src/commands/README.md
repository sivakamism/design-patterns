Commands Module:

Purpose
    This module applies the "Command Pattern" to encapsulate actions as independent objects.  
    It keeps the `SmartOfficeApp` (main controller) "clean and decoupled".

Key Files
   - Command.java→ Base interface for all commands.  
   - BookRoomCommand.java→ Handles room booking.  
   - CancelRoomCommand.java → Handles booking cancellations.  
   - ConfigCapacityCommand.java → Sets room capacity.  
   - AddOccupantCommand.java → Adds occupants to a room.

Responsibilities
     - Encapsulate user actions.  
     - Provide a uniform `execute()` interface.  
     - Allow easy extension with new commands.  

Why It Matters
     Adding new operations doesn’t require changing existing logic.  
     This demonstrates the "Open/Closed Principle" from SOLID.
