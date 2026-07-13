# Conference Room Scheduler

This project now includes a richer Java starter implementation inspired by the UML design, with:
- domain classes for rooms, reservations, users, booking requests, and admin/attendee roles
- several design patterns implemented in the codebase:
  - Factory Method
  - Observer
  - Singleton
  - Repository
  - Strategy
  - Proxy

Run it with:

```bash
javac $(find src/main/java -name "*.java") -d out
java -cp out com.conferenceroomscheduler.Main
```


javac $(find src/main/java -name "*.java") -d out
java -cp out com.conferenceroomscheduler.Main

to run the GUI