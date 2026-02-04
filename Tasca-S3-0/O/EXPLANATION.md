### What was wrong?
The code is rigid. Every time you want to add a new instrument (like a violin or a trumpet), you have to go back into the InstrumentPlayer class and modify the play method by adding another else if block.

### Why did it violate the principle?
This is a classic violation of the Open-Closed Principle.
* The Open-Closed Principle: Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.
* Closed for modification: You shouldn't have to change the source code of the InstrumentPlayer class just to add a new instrument.
* Open for extension: You should be able to add new behavior by adding new code (new classes), not by rewriting the old ones.

### What solution did you apply and why?
I refactored the code from a rigid if-else structure to a Polymorphic design using an Interface. 
By defining an Instrument contract, the InstrumentPlayer class no longer needs to know the specific details of each instrument;
it simply calls the universal `.play()` method.
