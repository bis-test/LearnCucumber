About The Project
This is a demo project to demonstrate how cucumber is used with selenium

Type of files
*.java
*.feature
*.exe
*.xml
*.txt

Dependency
Cucumber is a BDD framework and we need to set the dependency in pom.xml
<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-junit</artifactId>
			<version>2.3.1</version>
		</dependency>
<dependency>
			<groupId>io.cucumber</groupId>
			<artifactId>cucumber-java8</artifactId>
			<version>2.3.1</version>
</dependency>

How it works
You will see there are three packages - features, runner, steps
features - Contains feature files
runner - Contains runner files
steps - Contains steps or actual class files.


The feature file will contain the Gherkin language statements. The Given, When, Then etc.
The steps file will contain code blocks mapped to the feature file statements.
The runner file will contain which feature file to run and gluing with which step file.


How to run
Open the runner file, right click, run as-> J unit test


Tested OK
Bis<07/16/2018>