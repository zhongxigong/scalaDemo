import scala.collection.mutable.ArrayBuffer

/**
  * Created by 耀源 on 2016/10/29.
  */
object SingleSessionDemo {
  def main(args: Array[String]): Unit = {
    val session = SessionFactory.getSession()
    println(session)
//    val arr = Array(5)
//    println(arr.toBuffer)
  }
}

object MyApp extends App{
  println("I love Scala")
}


object SessionFactory {
  var count = 5
  var session = new ArrayBuffer[Session]()
  while(count>0){
    session +=new Session
    count -= 1
  }

  def getSession(): Session = {
    session.remove(0)
  }
}

class Session{

}
