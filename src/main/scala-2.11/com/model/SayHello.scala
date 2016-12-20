package com.model

/**
  * Created by 耀源 on 2016/12/20.
  */
object SayHello {
  /**
    * 由java调用scala代码
    * @param name
    * @return
    */
  def sayHello(name : String): String = {
    return "Hello" + name;
  }
}
