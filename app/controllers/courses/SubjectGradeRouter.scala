package controllers.courses
/**
  *Creater Wailed
  *Reviewer Thomas
  *
  */
import javax.inject.Inject
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter
class SubjectGradeRouter @Inject()
 (subjectGradeCreationRouter: SubjectGradeController)
  extends SimpleRouter {
  override def routes: Routes = ???
}
