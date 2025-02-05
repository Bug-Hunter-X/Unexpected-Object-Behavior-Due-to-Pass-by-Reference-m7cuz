# Scala Pass-by-Reference Bug

This repository demonstrates a common Scala gotcha related to pass-by-reference semantics.

In Scala, objects are passed by reference. This means that when you assign an object to a new variable, both variables point to the same underlying object in memory.  Any modifications made through one variable will be reflected when accessing the object through the other variable.

The included code shows an example where this behavior can lead to unexpected results. The solution demonstrates how to create a defensive copy to avoid this.

## How to reproduce

1. Clone this repository.
2. Run `bug.scala`. Note the unexpected output (20).
3. Run `bugSolution.scala` to see the correct, expected behavior.
