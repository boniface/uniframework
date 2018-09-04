package controllers.events

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

/**
  *Creater Natasha
  *Reviewer Omega
  *
  */

class LoginEventsRouter @Inject()
 (loginEventsCreationRouter: LoginEventsController)
  extends SimpleRouter {
  override def routes: Routes = ???
}

