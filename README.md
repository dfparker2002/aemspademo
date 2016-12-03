AEM Single Page Application (SPA) using JQuery, Bootstrap Demo
========

This project is a demonstration of how you can build a Single-Page-Application in CQ or Adobe Experience Manager (CQ5, AEM) using Bootstrap and JQuery behaviors and content-generating templates.

Based on an 2014 AdaptTo presentation.

This repository may be found here, https://github.com/dfparker2002/aemspademo.git

Setup
-----

!!!! 

This project uses the NEBA framework (http://neba.io/). 
> Project installs an all-in-one artifact, https://mvnrepository.com/artifact/io.neba/io.neba.neba-delivery-aem/3.11.0
https://mvnrepository.com/artifact/io.neba/io.neba.neba-delivery-aem/3.11.0

!!!! 

For AEM 6.x+: replace 3.11.0 and use Neba.IO 4.10 or better and SpringFramework 4.1x. Recommend to use parent project properties to populate the build recipe.

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

Once the working copy is created, you can use the normal `vlt up` and `vlt ci` commands.

Usage
------------------------
1. Go to http://localhost:4502/content/aemspademo/en/schedule.html
![data on page](etc/2016-12-03 04_47_54-AEM-SPA Demo.png "data on page")

2. Edit the page:

2a. Delete current component.

2b. Using the sidekick, add "Training / Schedule" component. 
![open page](etc/2016-12-03 04_47_28-AEM-SPA Demo.png "open page")

2c. One may edit the column headers by right-clicking the compent | Edit,

![Edit column headers](etc/2016-12-03 05_32_44-AEM-SPA Demo.png "Edit column headers")3. Preview mode, test operation. Data page 5 triggers an error. This is intentional.

![Features on page](etc/2016-11-29 03_07_43-AEM-SPA Demo.png "Features on page")

3a. All data is stubbed, aemspademo\bundle\src\main\java\com\fcrllc\aem\spademo\impl\services\ScheduleService.java 

3b. JavaScript behaviors defined in "apps.spademo" clientlib and individual files found here, 
content/src/main/content/jcr_root/etc/designs/aemspademo/clientlibs/js/libs 

3c. Table template, content\src\main\content\jcr_root\apps\aemspademo\components\scheduletable\scheduletable.jsp

Class diagram
------------------------
![Class diagram](etc/class_diagram.png "Class diagram") 

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
=======
- Error page (/content/aemspademo/en/error404.html) should render correct when component is added to any page not at the level of "Training / Schedule". Currently defaults to Sling error page.
- UI unit-tests (hobbes.js)
- Class mocks and junit
- Maven integration automation of reverse map java classes using plugin (generates class diagram above),
https://libraries.io/github/markusmo3/uml-reverse-mapper
https://libraries.io/maven/com.iluwatar:urm-core
https://libraries.io/github/iluwatar/uml-reverse-mapper
