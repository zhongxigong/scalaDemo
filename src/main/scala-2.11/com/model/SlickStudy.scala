package com.model

import slick.driver.MySQLDriver.api._
import slick.lifted.ProvenShape

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

/**
  * Created by 耀源 on 2016/12/20.
  */
object SlickStudy extends App{

  val students = TableQuery[Student]
  val db = Database.forConfig("mysql")
//
//  val deleteSql = sql"drop table student".as[String]
//  db.run(deleteSql)
//  val setupAction: DBIO[Unit] = DBIO.seq(
//    students.schema.create,
//    students += (1,"xiaoming"),
//    students += (2,"xiaohua"),
//    students += (3,"yaoyuan"),
//    students += (4,"xiaohuahua")
//  )
//
//  Await.result(db.run(setupAction),Duration.Inf)
//
//  Thread.sleep(1000)

//  val studentNames: Future[Seq[String]] = db.run(students.map(_.name).result)
//  studentNames.map(_.toList).foreach(a => println(a+"aaaa"))
var list = List("a")
try{
  val q = students.filter(_.id > 0)
  //  db.stream(q.result).foreach(println)
  val result = db.run(q.result)

  val tmpResult = result.flatMap{_ =>
    val q1 = students.filter(_.id > 1).result
    val tmp = db.run(q1).map(item => item.map(_._1))
    tmp.map(println)

    result.map(_.map(item => list =  item._2::list  ) )
    val a = students += (10,"dadadada")
    db.run(a)
    val delete = students.filter(_.id > 8).delete
    db.run(delete).map(numDeleteRows => println(s"delete $numDeleteRows rows"))
    val update = students.map(_.name).update("xxxx")
    db.run(update).map(numUpdateRows => println(s"update $numUpdateRows rows"))
  }
  Await.result(tmpResult,Duration.Inf)

  println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
  ====
  list.map(println)
  ====
}finally db.close


////  Await.result(db.run(q.result.map(_.toList.foreach(println))),Duration.Inf)
//  val a = q.result
//  var f = db.run(a)
//  f.onSuccess{
////    case name => println("result is " + name(0)._2)
//    case name => p(name.map(a => a._2))
//  }
//
//
//  def p(result: Seq[String]): Unit = {
//    println(result)
//  }

//  Await.result(db.run(students.result).map(_.foreach {
//    case (id,name) =>
//      ====
//      println("  " + name + "\t" + "id")
//  }), Duration.Inf)

//  Thread.sleep(1000)


  def ====(): Unit = {
    println("======================华丽的分割线=============================")
  }


}

/**
  * 定义映射类
  * @param tag
  */
class Student(tag: Tag)
  extends Table[(Int,String)](tag,"Student"){
  def id: Rep[Int] = column[Int]("student_ID",O.PrimaryKey)
  def name : Rep[String] = column[String]("student_name",O.SqlType("varchar(20)"))
  def * : ProvenShape[(Int, String)] = (id,name)
}
