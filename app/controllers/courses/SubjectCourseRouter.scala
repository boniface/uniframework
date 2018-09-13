package controllers.courses

/**
  *Creater omega
  *Reviewer walied
  *
  */
import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter
class SubjectCourseRouter @Inject()
 (subjectCourseCreationRouter: SubjectCourseController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
