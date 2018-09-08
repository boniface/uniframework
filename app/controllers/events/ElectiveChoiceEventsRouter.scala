

package controllers.events

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

/**
  *Creater Omega
  *Reviewer Natasha
  *
  */

class ElectiveChoiceEventsRouter @Inject()
 (ElectiveChoiceEventsCreationRouter: ElectiveChoiceEventsController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
