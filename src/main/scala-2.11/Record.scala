/**
  * Created by user on 08.04.16.
  */
class Record (name:String, salary: Int, department: String) {

  val id = java.util.UUID.randomUUID.toString

  override def toString(): String = (id + ": " + name + " " + salary + department)
}
