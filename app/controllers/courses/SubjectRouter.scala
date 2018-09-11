
/**
  *Creater Dorcas
  *Reviewer Omega
  *
  */
package controllers.courses

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter


class SubjectRouter @Inject()
 (ExamCreationRouter: SubjectController)
  extends SimpleRouter {
  override def routes: Routes = ???
}

