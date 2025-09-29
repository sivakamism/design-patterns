 Use Case 1: Observer Pattern

Problem Statement
     We have a Stock system that maintains the stock price. Multiple investors subscribe to updates.  
     When the stock price changes, all subscribed investors (`ConcreteInvestor`) should be notified automatically.

Design Pattern Applied
     Observer Pattern – defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified automatically.

Files
    - `Stock.java` → Subject interface  
    - `Investor.java` → Observer interface  
    - `ConcreteInvestor.java` → Concrete observer  
    - `ObserverDemo.java` → Main demo  

