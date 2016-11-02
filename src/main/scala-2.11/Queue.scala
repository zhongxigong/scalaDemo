/**
  * Created by 耀源 on 2016/10/29.
  */
class Queue private(val name: String,prop: Array[String],private var age: Int = 18) {

  println(prop.length)

  def description = name + "is" + age + "years with " + prop.toBuffer
}

object Queue{
  def main(args: Array[String]): Unit = {
    val q = new Queue("hatano", Array("蜡烛", "皮鞭"), 20)
    val str = q.description
    println(str)
  }
}
