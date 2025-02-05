```scala
import scala.util.control.NonFatal

class MyClass {
  private var internalValue: Int = 0

  def setValue(newValue: Int): Unit = {
    internalValue = newValue
  }

  def getValue(): Int = {
    internalValue
  }

  // Defensive copy method
  def copy(): MyClass = {
    val newObj = new MyClass
    newObj.setValue(this.getValue())
    newObj
  }
}

object Main extends App {
  val myObj = new MyClass
  myObj.setValue(10)
  println(myObj.getValue()) // Prints 10

  val anotherObj = myObj.copy() // Create a copy to avoid shared state
  anotherObj.setValue(20)
  println(myObj.getValue()) // Prints 10 (correct behavior)
  println(anotherObj.getValue()) // Prints 20
}
```