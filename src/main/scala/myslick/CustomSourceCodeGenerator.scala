package myslick

import scala.slick.model.codegen.SourceCodeGenerator
import scala.slick.driver.JdbcProfile
import scala.reflect.runtime.currentMirror

/**
 * Created with IntelliJ IDEA.
 * Developer: pligor
 *
 * https://gist.github.com/fdz5/8226038
 */
object CustomSourceCodeGenerator {

  def apply(url: String,
            jdbcDriver: String,
            user: String,
            password: String,
            slickDriver: String,
            outputFolder: String,
            pkg: String) = {
    val driver: JdbcProfile = currentMirror.reflectModule(
      currentMirror.staticModule(slickDriver)
    ).instance.asInstanceOf[JdbcProfile]

    driver.simple.Database.forURL(
      url,
      driver = jdbcDriver,
      user = user,
      password = password
    ).withSession {
      implicit session =>
        new SourceCodeGenerator(driver.createModel).writeToFile(slickDriver, outputFolder, pkg)
    }
  }
}
