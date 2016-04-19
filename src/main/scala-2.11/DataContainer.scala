import scala.collection.immutable.List

/**
  * Created by user on 11.04.16.
  */
class DataContainer {

  var records = List.empty[Record]

  def add(name: String, salary: Int, department: String): Unit = {
    records = new Record(name, salary, department) :: records
  }

  def showAll(): Unit = records.foreach(println)

  def totalSum(): Int = records.map(_.salary).sum

  def totalSum(department: String): Int =
    records.filter(r => r.department == department).map(_.salary).sum

  def averageSum(department: String): Float = {
    val items = records.filter(r => r.department == department).map(_.salary)
    items.sum / items.length
  }

  def findUser(name: String): String =
    records.find(r => r.name == name).toString
}
