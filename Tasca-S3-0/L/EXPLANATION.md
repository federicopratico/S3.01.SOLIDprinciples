### What was wrong?
In this exercise, the hierarchy composed of the `Character`, `Ghost`, and `Warrior` classes failed to respect the Liskov Substitution Principle (LSP).

### Why did it violate the principle?
The violation occurred within the `Ghost` class implementation.
The `takeDamage()` method threw an exception, leading to incorrect program behavior whenever an instance of `Character` was replaced by an instance of `Ghost`. 
A subclass should never break the expectations set by its parent class.

### What solution did you apply and why?
To fix this, I moved away from rigid inheritance and applied a more flexible approach:
* Behavioral Interface: I defined a `DamageBehaviour` interface to isolate the "receive damage" logic.
* Decoupled Implementations: I created two specific classes, `GhostDamage` and `WarriorDamage`, which implement `DamageBehaviour` to define how each entity handles damage independently.
* Abstract Foundation: I converted `Character` into an abstract class to prevent direct instantiation and ensure it serves strictly as a blueprint for specialized entities.
