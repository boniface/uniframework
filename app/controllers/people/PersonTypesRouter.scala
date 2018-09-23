package controllers.people

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

class StaffRouter @Inject()
 (peopleTypesCreationRouter: PeopleTypesController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
