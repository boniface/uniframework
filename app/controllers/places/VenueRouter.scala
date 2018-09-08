package controllers.places

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

/**
  *Created by Yandisa Katiya
  *Reviewer Kessel
  *
  */

class VenueRouter @Inject()(venueCreationRouter: VenueController) extends SimpleRouter
{
  override def routes: Routes = ???
}
