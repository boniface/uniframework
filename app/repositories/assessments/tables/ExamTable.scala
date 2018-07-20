package repositories.assessments.tables

import java.time.LocalDateTime

import com.outworkers.phantom.dsl._
import com.outworkers.phantom.jdk8._
import com.outworkers.phantom.streams._
import domain.exam

import scala.concurrent.Future


abstract class ExamTable {

  object subject_name extends StringColumn

  object venue_no extends StringColumn

  object exam_time extends StringColumn

  object controller extends  StringColumn

  object exam_date extends Col[LocalDateTime]  with PrimaryKey with ClusteringOrder with Ascending



}

abstract class ExamTableImpl extends ExamTable with RootConnector {

  override lazy val tableName = "exam"


  def getExamDetails(subject_name:String, venue_no:String, exam_time:String, exam_controller:String, exam_date:String): Future[Seq[Exam]] = {
    select
      .where(_.exam_time eqs exam_time)
      .and(_.venue_no eqs venue_no)
      .fetchEnumerator() run Iteratee.collect()
  }


}
