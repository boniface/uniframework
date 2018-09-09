
package controllers.courses

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

class FacultyRouter @Inject()
(facultyCreationRouter: FacultyController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
