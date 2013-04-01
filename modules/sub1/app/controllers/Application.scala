package controllers

import play.api._
import play.api.mvc._

object Sub1Application extends Controller {
  
  def index = Action {
    Ok("This is sub1")
  }
  
}