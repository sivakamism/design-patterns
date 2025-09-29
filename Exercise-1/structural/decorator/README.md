Use Case 2: Decorator Pattern

Problem Statement
   We want to dynamically add new behaviors (Bold, Italic, Underline) to text at runtime  
   without modifying the existing `PlainText` class.

Design Pattern Applied
    Decorator Pattern – allows behavior to be added to individual objects dynamically without changing their class.

Files
    - `Text.java` → Component interface  
    - `PlainText.java` → Concrete component  
    - `TextDecorator.java` → Abstract decorator  
    - `BoldDecorator.java`, `ItalicDecorator.java`, `UnderlineDecorator.java` → Concrete decorators  
    - `DecoratorDemo.java` → Main demo  
