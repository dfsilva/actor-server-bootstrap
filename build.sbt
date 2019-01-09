import sbt.Keys._
import sbt.dsl._

scalaVersion := "2.11.11"

resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies += "im.actor.server" % "actor-server-sdk" % "3.0.79-SNAPSHOT"
libraryDependencies += "io.netty" % "netty-tcnative-boringssl-static" % "2.0.0.Final"

enablePlugins(JavaServerAppPackaging)

name := "actor-server"
defaultLinuxInstallLocation in Docker := "/var/lib/actor"

NativePackagerKeys.bashScriptExtraDefines += """addJava "-Dlogback.configurationFile=${LOGBACK_CONFIG_FILE}""""

    
