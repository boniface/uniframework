package repositories.courses.tables

/**
  * created by Natasha
  * 
  */

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.courses.SubjectType

import scala.concurrent.Future


abstract class SubjectTyesTable extends Table[SubjectTypesTable, SubjectTypes] {

  object subjectId extends StringColumn with PartitionKey

  object type extends StringColumn with PrimaryKey with ClusteringOrder with Ascending

}

abstract class SubjectTypesTableImpl extends SubjectTypesTable with RootConnector {

  override lazy val tableName = "subjecttypes"

  def save(role: SubjectTypes): Future[ResultSet] = {
    insert
      .value(_.subjetId, types.subjectId)
      .value(_.type, types.emailId)
      .future()
  }

  def getSubjectTypes(SubjectId:String, type: String): Future[Seq[SubjectTypes]] = {
    select
      .where(_.subjectId eqs subjectId)
      .and(_.type eqs type)
      .fetchEnumerator() run Iteratee.collect()
  }

  def deleteSubjectTypes(subjectId:String,type:String):Future[ResultSet] ={
    delete
      .where(_.subjectId eqs subjectId)
      .and(_.type eqs type)
      .future()
  }
}
