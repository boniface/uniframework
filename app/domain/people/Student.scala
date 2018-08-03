package domain.people

import play.api.libs.json.Json
import java.time.LocalDate

/**
  * created by Yandisa
  * part1 : reviewer Kessel
  * @param studentId
  * @param deptId
  * @param firstName
  * @param lastName
  * @param initial
  * @param dateofbirth
  * @param address
  * @param telephoneNo
  * @param Level
  * @param StudentType
  *
  * StudentType describe Full time and Part time student
  */



case class Student(studentId: String, deptId: String, firstName:String, lastName: String, initial: String, dateofbirth: LocalDate, address: String, telephoneNo: Int, Level: String, StudentType: String)

  object Student
  {
    implicit val studentJson = Json.format[Student]
    def identity: Student = Student("","","","","",LocalDate.of(),"",0,"","")
}
