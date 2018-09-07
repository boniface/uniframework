/**
  *Creater Kessel
  *Reviewer Reece
  *
  */
package controllers.people

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter


class StudentRouter @Inject()
 (studentCreationRouter: StudentController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
