name := "scalaDemo"

version := "1.0"

mainClass := Some("com.txsk.App")

scalaVersion := "2.11.8"

//resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"
//
resolvers += "OSChina Maven Repository" at "http://maven.aliyun.com/nexus/content/groups/public/"
//
//externalResolvers := Resolver.withDefaultResolvers(resolvers.value, mavenCentral = false)

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.11
libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.4.10"
// https://mvnrepository.com/artifact/junit/junit-dep
libraryDependencies += "junit" % "junit-dep" % "4.11" % "provided"

// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter
//libraryDependencies += "org.springframework.boot" % "spring-boot-starter" % "1.4.2.RELEASE"

// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web
libraryDependencies += "org.springframework.boot" % "spring-boot-starter-web" % "1.4.2.RELEASE"

// https://mvnrepository.com/artifact/com.google.code.gson/gson
libraryDependencies += "com.google.code.gson" % "gson" % "2.7"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "org.slf4j" % "slf4j-nop" % "1.6.4"
)

// https://mvnrepository.com/artifact/mysql/mysql-connector-java
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.40"



