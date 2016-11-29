Angular SPA Demo
========

This project is a demonstration of how you can build an Angular, Single-Page-Application in CQ or Adobe Experience Manager (CQ5, AEM).

Based on an 2014 AdaptTo presentation.

This repostitory may be found here, https://github.com/dfparker2002/spademo.git

Setup
-----

!!!! 
This project uses the NEBA framework (http://neba.io/). 
>>> Make sure that you have installed NEBA onto your CQ instance, before you start to play with this project.  <<<
Download and install this all-in-one artifact, https://mvnrepository.com/artifact/io.neba/io.neba.neba-delivery-aem/3.11.0
!!!! 

CQ 5.6.x - AEM 6.x: Goto http://neba.io/download.html, download the AEM package for NEBA 3.11.0 and install it with Package Manager.
For AEM 6.x+: use Neba.IO 4.10 or better and SpringFramework 4.1x. 

After this you can use the following guide to install the demo project.

Also, check https://github.com/andon/aem-spa-demo/wiki/Project-Setup-with-NEBA

Building
--------

This project uses Maven for building. Common commands:

From the root directory, run `mvn -PautoInstallPackage clean install` to build the bundle and content package and install to a CQ instance.

From the bundle directory, run `mvn -PautoInstallBundle clean install` to build *just* the bundle and install to a CQ instance.

Using with VLT
--------------

To use vlt with this project, first build and install the package to your local CQ instance as described above. Then cd to `content/src/main/content/jcr_root` and run

    vlt --credentials admin:admin checkout -f ../META-INF/vault/filter.xml --force http://localhost:4502/crx

Once the working copy is created, you can use the normal ``vlt up`` and ``vlt ci`` commands.

Specifying CRX Host/Port
------------------------

The CRX host and port can be specified on the command line with:
mvn -Dcrx.host=otherhost -Dcrx.port=5502 <goals>


References
------------------------
Source presentation: http://www.slideshare.net/netceteragroup/dynamic-components-using-singlepageapplication-concepts-in-aemcq-39532610

Project repo code, https://github.com/dfparker2002/aemspademo.git

http://neba.io/index.html
http://neba.io/2016/09/19/neba-release-3.11.0.html

Compatible with CQ 5.6.x:
https://mvnrepository.com/artifact/io.neba/io.neba.neba-delivery-aem/3.11.0
http://central.maven.org/maven2/io/neba/io.neba.neba-delivery-aem/3.11.0/io.neba.neba-delivery-aem-3.11.0.content-package


TO DO 
Reverse map java classes using plugin,
https://libraries.io/github/markusmo3/uml-reverse-mapper
https://libraries.io/maven/com.iluwatar:urm-core
https://libraries.io/github/iluwatar/uml-reverse-mapper
