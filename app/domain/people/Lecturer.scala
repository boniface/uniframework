package domain.people;

import play.api.libs.json.Json;

/** 
 * created by Reece Waldeck
 * Part 1 - reviewed by Yandisa
 * @param lect_id primary key to identify Lecturer
 * @param name
 * @param surname
 * @param telephone number 
 * @param EMail Address 
 * @param Address 
 * @param subjects the list of subjects the Lecturer lectures
 */

case class Lecturer(
    lectId: String, 
    nme: String, 
    srnme: String, 
    telNo: String, 
    emailAddr: String,
    Addr: String,
    subjects: List[Subject]
)

object Lecturer
{
  implicit val lectFmt = Json.format[Lecturer];

  def identity: Lecturer = Lecturer("", "", "", "", "", "", null);

}
