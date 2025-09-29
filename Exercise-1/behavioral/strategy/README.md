Use Case 2: Strategy Pattern

Problem Statement
   We have a shipping system where customers can choose different shipping strategies:  
   - Standard Shipping  
   - Express Shipping  
   - Free Shipping  

The strategy should be interchangeable without modifying client code.

Design Pattern Applied
    Strategy Pattern – defines a family of algorithms, encapsulates each one, and makes them interchangeable at runtime.

Files
    - `ShippingStrategy.java` → Strategy interface  
    - `StandardShipping.java`, `ExpressShipping.java`, `FreeShipping.java` → Concrete strategies  
    - `ShippingContext.java` → Context class (executes the selected strategy)  
    - `StrategyDemo.java` → Main demo  
