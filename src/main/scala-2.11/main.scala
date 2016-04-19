/**
  * Created by user on 08.04.16.
  */
import scala.io.StdIn._

object main extends App {

  val workData = new DataContainer()
  var loop = true

  while (loop) {
    showMenu()

    readInt() match {
      case 0 => loop = false
      case 1 => addRecord()
      case 2 => showUsers()
      case 3 => totalSalary()
      case 4 => totalSalaryByDepartment()
      case 5 => averageSalaryByDepartment()
      case 6 => findUser()
      case _ =>
    }
  }

  private def addRecord(): Unit = {
    workData.add(
      name = readLine("name: "),
      salary = readLine("salary: ").toInt,
      department = readLine("department: ")
    )
  }

  private def showUsers(): Unit = {
    workData.showAll()
  }

  private def totalSalary(): Unit = {
    println(workData.totalSum())
  }

  private def totalSalaryByDepartment(): Unit = {
    println(workData.totalSum(readLine("Enter department: ")))
  }

  private def averageSalaryByDepartment(): Unit = {
    println(workData.averageSum(readLine("Enter department: ")))
  }

  private def findUser(): Unit = {
    println(workData.findUser(readLine("Enter name: ")))
  }

  private def showMenu() : Unit = {
    print("\u001b[H\u001b[2J")
    println("Choose command:")
    println("1 - add user")
    println("2 - show users")
    println("3 - total salary")
    println("4 - total salary by department")
    println("5 - average salary by department")
    println("6 - find user by name")
    println("0 - exit")
  }
}
