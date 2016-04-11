import scala.collection.mutable.ArrayBuffer

/**
  * Created by user on 11.04.16.
  */
class DataContainer {

  var records = ArrayBuffer.empty[Record]
  var id: Int = 0

  def add(name: String, salary: Int, department: String): Unit = {
    id += 1
    records += new Record(id, name, salary, department)
  }

  def showAll(): Unit = {
    records.foreach(r => println(r.toString()))
  }

  def totalSum(): Int = records.map(_.salary).sum

  def totalSum(department: String): Int =
    records.filter(_.department == department).map(_.salary).sum

  def averageSum(department: String): Float = {
    val items = records.filter(r => r.department == department).map(_.salary)
    items.sum / items.length
  }

  def findUser(name: String): String =
    records.find(_.name == name).toString
}
