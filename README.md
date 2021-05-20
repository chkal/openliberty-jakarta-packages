# OpenLiberty vs. jakarta packages

Reproducer application with shows that OpenLiberty seems to ignore certain application classes
if the package name starts with `jakarta.*`.

Steps to reproduce:

  * Build this app and deploy to OpenLiberty 21.0.0.6-beta
  * Open http://localhost:8080/liberty-test/ in your browser
  * The first link results in a 404 error (JAX-RS application + resource in package `jakarta.foobar`)
  * Clicking the second link will work fine (JAX-RS application + resource in package `other.foobar`)

The app works fine with:

  * Glassfish 6.1.0-RC1
  * Wildfly Preview 23.0.2.Final
