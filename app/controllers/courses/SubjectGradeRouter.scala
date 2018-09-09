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
class SubjectGradeRouter @Inject()
 (subjectGradeCreationRouter: SubjectGradeController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
