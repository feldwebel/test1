/**
  * Created by user on 08.04.16.
  */
class Record (val id: Int, val name:String, val salary: Int, val department: String) {

  override def toString(): String = {
    id + ": " + name + " " + salary + " " + department + "\n"
  }
}
