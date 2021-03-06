package repositories.department.tables

/*
 * By Yandisa Katiya
 * Reviewed by Dorcas
 */
 
import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.department.Department
import scala.concurrent.Future

abstract class DepartmentTable extends Table[DepartmentTable, Department]
{
  object deptId extends StringColumn wiht PartitionKey

  object deptName extends StringColumn with PrimaryKey with ClusteringOrder with Ascending
  
  object faculty extends StringColumn
  
  object deptHead extends StringColumn
  
}

abstract class DepartmentTableImpl extends DepartmentTable with RootConnector
{
  override lazy val tableName = "department"
  
  def save(dept:Department): Future[ResultSet] =
  { 
    insert
      .value(_.deptId, dept.deptId)
      .value(_.deptName,dept.deptName)
      .value(_.faculty, dept.faculty)
      .value(_.deptHead, dept.deptHead)
      .future()
   }
   
  def getDepartment(deptId:String, deptName:String): Future[Seq[Exam]] =
  {
    select
      .where(_.deptId eqs deptId)
      .and(_.deptName eqs deptName)
      .fetchEnumerator() run Iteratee.collect()
   }
  
  def deleteDepartment(deptId:String, deptName:String):Future[ResultSet] =
  {
    delete
      .where(_.deptId eqs deptId)
      .and(_.deptName eqs deptName)
      .future()
  }
  
}
