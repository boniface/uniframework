package controllers.department

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

class DepartmentRouter @Inject()
(departmentController: DepartmentController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
