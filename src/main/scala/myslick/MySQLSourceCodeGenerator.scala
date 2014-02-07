package myslick

/**
 * Created with IntelliJ IDEA.
 * Developer: pligor
 */
object MySQLSourceCodeGenerator {
  def apply(dbName: String, outputFolder: String, pkg: String) = {
    CustomSourceCodeGenerator(
      url = s"jdbc:mysql://127.0.0.1/$dbName?characterEncoding=UTF-8&useUnicode=true",
      slickDriver = "scala.slick.driver.MySQLDriver",
      jdbcDriver = "com.mysql.jdbc.Driver",
      outputFolder = outputFolder,
      pkg = pkg,
      user = "DB_USER_NAME__FOR_EXAMPLE_ROOT",  //REPLACE THAT ONCE
      password = "THE_DB_PASSWORD"  //REPLACE THAT ONCE
    )
  }
}
