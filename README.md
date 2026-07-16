# Conference Room Scheduler

This project now includes a Java GUI-based conference room scheduler inspired by the UML design and D1/D2 requirements, with:
- core domain classes for rooms, reservations, users, and booking requests
- the six requested design patterns implemented directly in the codebase:
  - Factory Method for user creation
  - Singleton for the chief event coordinator
  - Strategy for payment handling
  - State for booking lifecycle transitions
  - Observer for room sensor notifications
  - Command for booking operations

## Why these six?

These patterns align closely with the assignment requirements and are practical to implement in a Java GUI application. They avoid unnecessary complexity while demonstrating good object-oriented design:

- Factory Method handles extensible user creation.
- Singleton enforces the single chief event coordinator.
- Strategy cleanly supports multiple payment methods.
- State models the booking lifecycle without large conditional blocks.
- Observer naturally integrates room sensors with the scheduling system.
- Command encapsulates booking and room-management operations, making the GUI easier to extend.

# Run the GUI with:

In Eclipse: Right-click on src/main/java and run as java application

```bash
javac $(find src/main/java -name "*.java") -d out
java -cp out com.conferenceroomscheduler.Main
```