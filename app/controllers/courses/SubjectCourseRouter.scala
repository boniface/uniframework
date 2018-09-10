
package controllers.courses

/**
  *Creater omega
  *Reviewer walied
  *
  */

import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter

/**
  * Created by hashcode on 2017/03/04.
  */
class SubjectCourseRouter @Inject()
 (subjectCourseCreationRouter: SubjectCourseController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
