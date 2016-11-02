/**
  * Created by 耀源 on 2016/10/5.
  */
object add {
  /**
    * 有参数和返回值的
    * @param a
    * @param b
    * @return
    */
  def addInt(a:Int,b:Int):Int={
    return a+b;
  }

  /**
    * 没有返回值的
    */
  def printMe():Unit={
    println("Hello World");
  }

  def main(args: Array[String]): Unit = {
    println("5+7的结果是"+addInt(5,7))
  }
}
