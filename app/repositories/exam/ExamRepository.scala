package repositories.assessments

import com.outworkers.phantom.dsl._
import conf.connections.DataConnection
import repositories.exam.tables._

class ExamDatabase(override val connector: KeySpaceDef) extends Database[ExamDatabase](connector) {

  object examTable extends examTableImpl with connector.Connector

  object siteExamTable extends ExamOrgTableImpl with connector.Connector


}

object ExamDatabase extends ExamDatabase(DataConnection.connector)

trait ExamRepository {
  def database = ExamDatabase
}
