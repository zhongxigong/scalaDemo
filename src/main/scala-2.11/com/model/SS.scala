package com.model

import slick.lifted.TableQuery
import slick.driver.MySQLDriver.api._

import scala.concurrent.Await
import collection.JavaConversions._
import scala.concurrent.duration.Duration
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
/**
  * Created by 耀源 on 2016/12/22.
  */
object SS{
  def pp():Seq[String]={
    val ss = new SS
    ss.all()
  }
}

class SS {

  val students = TableQuery[Student]

  def all():Seq[String] = {
    val db = Database.forConfig("mysql")
    var list = scala.collection.mutable.Seq("a")
    val q = students.filter(_.id > 0)
    //  db.stream(q.result).foreach(println)
    val result = db.run(q.result)
    val f = result.flatMap{_ =>
      result.map(println)
      result.map(
        item => {
          item.map(
            i => {
              list = list :+ i._2
              println("mapping.....")
            }
          )
          println("第一层map执行")
        }
      )
    }
    println("map结束")
    Await.result(f,Duration.Inf)
    db.close()
    list
  }

}
