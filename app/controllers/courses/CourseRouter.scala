/**
  * Reviewed by Dorcas
  */

package controllers.course

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

class CourseRouter @Inject()
(courseCreationRouter: CourseController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
