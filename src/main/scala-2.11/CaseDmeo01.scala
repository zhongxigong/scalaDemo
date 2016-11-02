import scala.util.Random

/**
  * Created by 耀源 on 2016/10/29.
  */

case class SubmitTask(id: String, name: String)
case class HeartBeat(time: Long)
case object CheckTimeOutTask

case class Person(name: String,age: Int)

object CaseDmeo01 extends App{


  val arr = Array(CheckTimeOutTask, HeartBeat(12333), SubmitTask("0001", "task-0001"),Person("a",2))

  arr(Random.nextInt(arr.length)) match {
    case SubmitTask(id, name) => {
      println(s"$id, $name")
    }
    case HeartBeat(time) => {
      println(time)
    }
    case CheckTimeOutTask => {
      println("check")
    }
    case Person(name,age) => {
      println(name+" "+age)
    }
  }


}
