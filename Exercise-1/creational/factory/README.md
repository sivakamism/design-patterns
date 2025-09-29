Use Case 1: Factory Pattern

Problem Statement
    We want to create different types of notifications (`EmailNotification`, `SMSNotification`, `PushNotification`) at runtime without exposing the creation logic to the client.

Design Pattern Applied
     Factory Pattern – provides an interface for creating objects but allows subclasses to decide which class to instantiate.

Files
     - `EmailNotification.java`, `SMSNotification.java`, `PushNotification.java` → Concrete classes  
     - `NotificationFactory.java` → Factory class  
     - `FactoryDemo.java` → Main demo  
