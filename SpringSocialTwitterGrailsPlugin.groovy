class SpringsocialTwitterGrailsPlugin {
  // the plugin version
  def version = "0.2.0-SNAPSHOT"
  // the version or versions of Grails the plugin is designed for
  String grailsVersion = "2.3.9 > *"
  // the other plugins this plugin depends on
  Map dependsOn = ['springSocialCore': '0.1.31 > *']
  // resources that are excluded from plugin packaging
  List pluginExcludes = [
      "grails-app/views/error.gsp"
  ]

  String author = "Domingo Suarez Torres"
  String authorEmail = "domingo.suarez@gmail.com"
  String title = "Spring Social Twitter"
  String description = 'Spring Social Twitter plugin.'

  String documentation = "http://grails.org/plugin/spring-social-twitter"

  def doWithSpring = {
    xmlns context: "http://www.springframework.org/schema/context"
    context.'component-scan'('base-package': "grails.plugins.springsocial.config.twitter")
  }

}
