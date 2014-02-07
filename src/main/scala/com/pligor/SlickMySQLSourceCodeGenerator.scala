package com.pligor

import myslick.MySQLSourceCodeGenerator

/**
 * if you want to make it more automatic see these links:
 *
 * https://gist.github.com/fdz5/8226163
 *
 * https://github.com/slick/slick-codegen-example/blob/master/project/Build.scala#L18
 *
 * http://stackoverflow.com/questions/21349807/how-to-setup-username-and-password-with-slicks-source-code-generator
 */
object SlickMySQLSourceCodeGenerator extends App {

  val outputFolder = "/home/pligor/an/output/folder/of/your/choice"

  MySQLSourceCodeGenerator(
    dbName = "the_name_of_the_database", //REPLACE THAT FOR EACH PROJECT
    outputFolder = outputFolder, //REPLACE THAT FOR EACH PROJECT
    pkg = "a.package.of.your.choice" ////REPLACE THAT FOR EACH PROJECT
  )

  println(s"slick source code generator has finished")
}
