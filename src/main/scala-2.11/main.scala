/**
  * Created by user on 08.04.16.
  */
import scala.io.StdIn.readLine

object main extends App {

  var records = Array[Record]()

  main()

  def main(): Unit =
  {
    println("fio:")
    val fio = readLine()
    val salary : Int = readLine().toInt
    val department = readLine()
    //val rec = new Record(fio, salary, department)
    records :+ new Record(fio, salary, department)
    println(records.lastOption.toString())
  }
}
