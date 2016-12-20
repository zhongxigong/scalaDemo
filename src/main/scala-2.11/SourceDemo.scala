import scala.io.Source

/**
  * Created by 耀源 on 2016/11/2.
  */
object SourceDemo {
  def main(args: Array[String]): Unit = {
    val str = Source.fromFile("c://a.txt").mkString//读取小文件
    println(str)
  }
}

object SourceBigFile {
  def main(args: Array[String]): Unit = {
    val iterator = Source.fromFile("c://a.txt").toIterator
    while(iterator.hasNext){
      println(iterator.next())
    }
  }
}
