package controllers

import play.api._
import play.api.mvc._

object Sub2Application extends Controller {
  
  def index = Action {
    Ok("This is sub2")
  }
  
}