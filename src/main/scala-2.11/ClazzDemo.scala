/**
  * Created by 耀源 on 2016/10/29.
  */
object ClazzDemo {
  def main(args: Array[String]): Unit = {
    val h = new Human
    println(h.flight())
  }
}

trait Flyable{
  def fly(): Unit = {
    println("I can fly")
  }

  def flight(): String
}

abstract class Animal{
  def run(): Int
  val name: String
}

class Human extends Animal with Flyable{
  val name = "abc"

  val t1,t2,(a,b,c)={
    println("ABC")
    (1,2,3)
  }

  println(a)

  println(t1._1)

  override def flight(): String = {
    "flight with 棒子"
  }

  override def run(): Int = {
    1
  }
}




