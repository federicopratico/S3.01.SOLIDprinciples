### What was wrong?
The class violates the **Dependency Inversion Principle (DIP)**, which states that high-level modules should not depend on low-level modules; both should depend on abstractions. In general, software entities should rely on abstractions rather than specific implementations. Adhering to this principle ensures significantly greater flexibility within the system.

### Why did it violate the principle?
The design flaw in this exercise was making the `ServicePerson` class directly dependent on the specific implementation of the `MySql` class. This creates **tight coupling**, which reduces the extensibility of the class. Furthermore, if the data storage method needs to change, the `ServicePerson` class would require modification, subsequently violating the **Open/Closed Principle**.

### What solution did you apply and why?
The solution was to introduce an **interface** that provides an abstract representation of the behavior required by `ServicePerson`. By depending on this abstraction, we can now inject any concrete implementation (e.g., PostgreSQL, MongoDB, or a Mock service) to handle the persistence of `Person` data without ever modifying the high-level logic.
