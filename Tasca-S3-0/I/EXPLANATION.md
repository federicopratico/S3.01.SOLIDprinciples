### What was wrong?
The issue lies in the design of the `MachineActions` interface. It bundles too many unrelated functionalities into a single contract. Since any class implementing this interface is forced to provide an implementation for every method, it leads to a "polluted" design where classes are burdened with behaviors they do not actually use.

### Why did it violate the principle?
This violates the **Interface Segregation Principle (ISP)**—the "I" in SOLID. A client should never be forced to depend on methods it does not use.

### What solution did you apply and why?
The solution was to refactor the monolithic `MachineActions` interface into two specialized interfaces:
* **`AirConditionerActions`**
* **`WashingMachineActions`** By splitting the interface, classes now only implement the specific methods relevant to their actual behavior. This results in a cleaner, more modular, and more maintainable architecture that avoids "fat" interfaces.
