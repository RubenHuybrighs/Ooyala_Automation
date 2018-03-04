# Ooyala_Automation
OOYALA - TECHNICAL TAKE HOME EXERCISE

GETTING STARTED
Pre-requisites:
I have used the following software in my framework:
- Google chrome Version 64.0
- Java JDK 1.8.0_161
- Java JRE 8 161
- Chromedriver (.exe file is located in C:\Automation)
- Maven dependency management (Selenium 2.53.1, JUnit 4.12, Cucumber 1.2.4, Cucumber JUnit 1.2.4) can be found in the pom.xml file

Running:
After importing the project, the tests can be run by running the TestRunner class as a JUnit test.

Structure of the project:
- Base class in the base package is where I create the webdriver.
- LoginPage class in the pages package contains all the methods and fields related to the login page.
- TestRunner class in the runner package is the class that I run to execute my test cases. This class can be run as a JUnit test.
- LoginSteps class in the steps package has all the Cucumber step definitions related to the login page.
- In the directory src/test/resources > features > Login.feature you can find the scenarios written in the Gherkin language.
  This is also where I've written the acceptance criteria.
