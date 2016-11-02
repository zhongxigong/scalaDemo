/**
  * Created by 耀源 on 2016/10/28.
  */
object HelloScala {//object代表这是一个单例对象或者伴生对象

  val func = (x : Int,y : Int) => x+y

  def method1(f: (Int,Int) => Int) : Int = {
    f(2,6)
  }

  //放置静态方法，静态变量,不需要new
  def main(args: Array[String]): Unit = {
    println(method1(func))
  }
}
