# Pen LLD (Low-Level Design)

This project demonstrates the implementation of the **Strategy Design Pattern** in Java through a Pen system. The design allows for flexible pen configurations with different writing behaviors and opening mechanisms.

## Design Pattern Used

**Strategy Pattern**: This pattern defines a family of algorithms (strategies), encapsulates each one, and makes them interchangeable. In this example:
- Writing behaviors (Ball, Fountain, Gel) are strategies
- Opening mechanisms (Cap, Click) are strategies

## Project Structure

```
pen/
├── src/
│   └── com/
│       └── penlld/
│           ├── Main.java                 # Demonstration of the pen system
│           ├── model/
│           │   ├── Ink.java              # Ink model with color and level management
│           │   └── Pen.java              # Main Pen class using strategy pattern
│           └── strategy/
│               ├── open/
│               │   ├── CapMechanism.java     # Cap-based opening strategy
│               │   ├── ClickMechanism.java   # Click-based opening strategy
│               │   └── OpeningMechanism.java # Interface for opening strategies
│               └── write/
│                   ├── BallWritingBehavior.java    # Ball pen writing strategy
│                   ├── FountainWritingBehavior.java # Fountain pen writing strategy
│                   ├── GelWritingBehavior.java     # Gel pen writing strategy
│                   └── WritingBehavior.java        # Interface for writing strategies
```

## Features

- **Multiple Writing Types**: Ball, Fountain, and Gel pens with different writing behaviors
- **Opening Mechanisms**: Cap-based and Click-based opening strategies
- **Ink Management**: Pens can run out of ink and be refilled
- **State Management**: Pens track whether they are open or closed
- **Extensible Design**: Easy to add new writing behaviors or opening mechanisms


## Example Output

The program demonstrates:
1. Creating a Blue Ball Pen with Click Mechanism
2. Creating a Black Fountain Pen with Cap Mechanism
3. Creating a Red Gel Pen with Cap Mechanism that runs out of ink and gets refilled

## Key Classes

- **Pen**: Main class that uses composition with strategy interfaces
- **Ink**: Manages ink color and level
- **WritingBehavior**: Interface for different writing strategies
- **OpeningMechanism**: Interface for different opening strategies

## Benefits of This Design

1. **Open/Closed Principle**: New behaviors can be added without modifying existing code
2. **Single Responsibility**: Each class has a single, well-defined responsibility
3. **Composition over Inheritance**: Behaviors are composed rather than inherited
4. **Testability**: Strategies can be easily mocked and tested independently
5. **Flexibility**: Pens can be configured with any combination of behaviors at runtime</content>
<parameter name="filePath">/Users/ramneeksingh/Desktop/LLD_byRamneek/SST28-LLD101/SST28-LLD101/pen/README.md