/**
  *Creater Dorcas
  *Reviewer Kessel
  *
  */
package controllers.assessments

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter


class ExamRouter @Inject()
 (ExamCreationRouter: ExamController)
  extends SimpleRouter {
  override def routes: Routes = ???
}

