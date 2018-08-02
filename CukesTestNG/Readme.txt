About The Project
------------------
This is a demo project to demonstrate how cucumber is used with selenium & testNG

Type of files
*.java
*.feature
*.exe
*.xml
*.txt

Dependency
-----------------
You need to have two dependency in pom.xml

-one for testNG
-another for cucumber+testNG

<!-- https://mvnrepository.com/artifact/info.cukes/cucumber-testng -->
<dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-testng</artifactId>
    <version>1.1.5</version>
</dependency>

<!--for TestNG -->
<dependency>
  <groupId>org.testng</groupId>
  <artifactId>testng</artifactId>
  <version>6.8</version>
</dependency>


How it works
-------------
We need to extend the runner class file to AbstractTestNGCucumberTests class.

@Test
public class CreateLeadRunner2 extends AbstractTestNGCucumberTests


How to run
---------------
The CreateLeadRunner1 is a Junit runner so right click -> Run as JUnit

The CreateLeadRunner2 is a testNG runner file, so right click -> Run as TestNG

both the files are same, we have two files to demonstrate how it works in Junit & then testNG

Third way, go to testsuite and run the XML file.


Tested - Pending
When we try to run in testNG, its throwing error.

Bis<08/02/2018>