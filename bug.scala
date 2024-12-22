```scala
class MyClass(val value: Int) {
  def this() = this(0) // Auxiliary constructor
  def myMethod(): Unit = {
    println(s"Value: $value")
  }
}

object Main extends App{
  val obj1 = new MyClass(5)
  obj1.myMethod()
  val obj2 = new MyClass()
  obj2.myMethod()
}
```