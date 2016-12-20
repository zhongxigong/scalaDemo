import com.txsk.Hello

/**
  * Created by 耀源 on 2016/10/5.
  */
object 闭包 {
  def main(args: Array[String]): Unit = {
    println( "muliplier(1) value = " +  multiplier(1) )
    //factor = 5
    println( "muliplier(2) value = " +  multiplier(2) )
    println(new Hello().sayHello("hai"))
  }

  var factor=3
  var multiplier = (i:Int) => i*factor
}
