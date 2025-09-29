Main Module:

Purpose
    This module contains the "entry point" of the application and handles all console interactions.  
    It acts as the "controller" between user commands and the system logic.

Key File
-SmartOfficeApp.java
  - Reads and parses user input.
  - Delegates execution to command classes or core services.
  - Enforces authentication before restricted operations.
  - Provides clear console outputs for both success and errors.

Responsibilities
    - Input parsing  
    - Command dispatch  
    - Authentication enforcement  
    - User feedback (console output)

Why It Matters
   By isolating input/output here, the core logic remains "clean and testable"