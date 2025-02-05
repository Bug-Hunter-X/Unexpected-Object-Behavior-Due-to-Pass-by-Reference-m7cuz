```scala
class MyClass {
  private var internalValue: Int = 0

  def setValue(newValue: Int): Unit = {
    internalValue = newValue
  }

  def getValue(): Int = {
    internalValue
  }
}

object Main extends App {
  val myObj = new MyClass
  myObj.setValue(10)
  println(myObj.getValue()) // This will print 10

  val anotherObj = myObj //anotherObj is a reference to myObj
  anotherObj.setValue(20) 
  println(myObj.getValue()) //This will print 20, unexpected behavior if you thought they were distinct objects
}
```