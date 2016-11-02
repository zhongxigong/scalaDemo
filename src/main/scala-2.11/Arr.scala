import org.junit.Test
import Array._
/**
  * Created by 耀源 on 2016/10/5.
  */
object Arr {
  def main(args: Array[String]): Unit = {
    rangeDemo()
  }

  def rangeDemo():Unit={
    val myList1 = range(10, 20, 2)
    val myList2 = range(10,20)
    for(x <- myList1){
      println(x)
    }
    println("-----------------------------------")
    for(x <- myList2){
      println(x)
    }
  }


  /**
    * 多维数组练习
    */
  def multiArr():Unit={
    var myMatrix = ofDim[Int](3,3)

    // 创建矩阵
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        myMatrix(i)(j) = j;
      }
    }

    // 打印二维阵列
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }

  }



  /**
    * 一维数组联系
    */
  def arr():Unit={
    val z = new Array[String](3);
    z(0)="a"
    z(1)="b"
    z(2)="d"
    for(x <- z){
      println(x)
    }

    val myList = Array(2.3,4,5.6,19,10068,23)
    var total = 0.0
    for(y <- myList){
      total += y
      println(y)
    }
    for ( i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }
    println("计算的总和为"+total/2)

    var max = myList(0)
    for(y <- myList){
      if(y>max)
        max = y
    }
    println("最大值为"+max)
  }
}
