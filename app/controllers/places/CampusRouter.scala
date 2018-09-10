package controllers.places

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

/**
  *Creater Natasha
  */

class CampusRouter @Inject()
 (campusRouter: CampusController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
