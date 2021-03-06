package lila.notification

import ornicar.scalalib.Random.nextString

import lila.user.User

case class Notification(
  id: String,
  user: String,
  html: String,
  from: Option[String])

object Notification {

  def apply(
  user: String,
  html: String,
  from: Option[String]): Notification = new Notification(
    id = nextString(8),
    user = user,
    html = html,
    from = from)
}
