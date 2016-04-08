/**
  * Created by user on 08.04.16.
  */
import scala.io.StdIn.readLine
import scala.collection.mutable.ArrayBuffer

object main extends App {

  var records = ArrayBuffer.empty[Record]

  main()

  def main(): Unit =
  {
    println("fio:")
    val fio = readLine()
    val salary : Int = readLine().toInt
    val department = readLine()

    records += new Record(fio, salary, department)
    println(records.lastOption.toString())
  }
}
