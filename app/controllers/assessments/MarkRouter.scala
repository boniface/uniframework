/**
  *Creater Kessel
  *Reviewer Dorcas
  *
  */

package controllers.assessments

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

class MarkRouter @Inject()
 (markCreationRouter: MarkController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
