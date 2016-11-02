import akka.actor.{Actor, UntypedActor}

/**
  * Created by 耀源 on 2016/9/18.
  */
class MyActor1 extends UntypedActor{
  @scala.throws[Throwable](classOf[Throwable])
  override
  def onReceive(message: Any): Unit = println(message)
}
