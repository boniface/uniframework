package controllers.courses

/**
  *Creater Wailed
  *Reviewer Kessel
  *
  */

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

class StaffRouter @Inject()
 (staffCreationRouter: StaffController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
