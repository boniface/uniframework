package controllers.courses

/**
  *Creater Wailed
  *Reviewer Thomas
  *
  */

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

/**
  * Created by hashcode on 2017/03/04.
  */
class SubjectGradeRouterRouter @Inject()
 (subjectGradeRouterCreationRouter: SubjectGradeController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
