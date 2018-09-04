package controllers.places

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

/**
  *Creater Natasha
  *Reviewer Yandisa
  *
  */

class EntityRouter @Inject()
 (entityCreationRouter: EntityController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
