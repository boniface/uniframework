package services.places.Impl

/**
 * creater Reece
 * reviewer Thomas
 *
 */

import com.datastax.driver.core.ResultSet
import domain.places.Campus
import repositories.places.CampusRepository
import services.places.CampusServices

import scala.concurrent.Future

class CampusServicesImpl extends CampusRoleRepository with CampusServices{
  def save(campus: Campus): Future[ResultSet] = {
    database.campusRoleTable.save(campus)

  }

  def getCampuses(campusId: String): Future[Seq[Campus]] = {
    database.campusTable.getCampuses(campusId)

  }

  def getCampus(campusId: String): Future[Campus] = {
    database.campusTable.getCampuses(campusId).map(campus => campus.head)
  }

  def deleteCampuses(campusId:String):Future[ResultSet] ={
    database.campusTable.deleteCampuses(campusId)
  }

}

object CampusServicesImpl extends CampusServicesImpl with CampusRepository


}
