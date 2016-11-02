import akka.actor.{ActorSystem, Props}

/**
  * Created by 耀源 on 2016/9/19.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val mySystem = ActorSystem.create("mySystem")
    val hello = mySystem.actorOf(Props[MyActor1],name = "myActor")
    hello!"药耀源"

    Thread.sleep(5000)
    mySystem.shutdown()
  }
}
