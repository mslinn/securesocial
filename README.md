# SecureSocial for Play 2 #

This fork modifies Play 2.1.4, originally released for Scala 2.10 and Play 2.2.x, for use with Play 2.3.x and Scala 2.11. The Scala sample works, but the Play sample has not been updated.

SecureSocial allows you to add an authentication UI to your app that works with services based on OAuth1, OAuth2 and OpenID protocols.  SecureSocial provides Scala and Java APIs so you can integrate it using your preferred language.

Check the project web site for more information: [http://www.securesocial.ws](http://www.securesocial.ws).

## SecureSocial for Play 2.3.8 and Scala 2.11 ##

Add two lines to `build.sbt`.

 * Add the `securesocial` dependency:
````
"com.micronautics" %% "securesocial" % "2.1.5" withSources()
````

 * Add this to the `resolvers`:
````
"micronautics/play on bintray" at "http://dl.bintray.com/micronautics/play"
````

This library has been built against Scala 2.10.5 / Play 2.2.6 and Scala 2.11.6 / Play 2.3.8.

To run:
````
$ activator -jvm-debug 9999 run
````

## SecureSocial for Play 1.x ##

The old version of SecureSocial is under the 1.x branch now.  The 'master' branch is for the Play 2 version only.

Written by Jorge Aliss ([@jaliss](http://www.twitter.com/jaliss))

## License ##

SecureSocial is distributed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html).
