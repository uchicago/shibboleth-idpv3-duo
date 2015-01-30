shibboleth-idpv3-duo
====================

This is an authentication module for the Shibboleth Identity Provider Version 3.x.  It provides Duo Security authentication.

*Note* This is a work-in-progress, it doesn't even work yet and most likely won't compile.

# Installation
duo.vm goes to views

Duo-Web-v1-bundled.js goes to the war

duo-authn-flow.xml goes to conf/flows

edit `conf/idp.properties` and add to the values of the `idp.additionalProperties` property the value `conf/duo.properties`

To be continued...