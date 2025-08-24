Problem Statement:
Below is the programme which would calculate the total cost in a shopping basket. Could you write the test cases for this programme

Items are presented one at a time, in a list, identified by name - for example, "Apple" or "Banana".

Multiple items are present multiple times in the list, so for example ["Apple", "Apple", "Banana"] is a basket with two apples and one banana.
 
Items are priced as follows:

 - Apples are 35p each
 - Bananas are 20p each
 - Melons are 50p each, but are available as ‘buy one get one free’
 - Limes are 15p each, but are available in a ‘three for the price of two’ offer

Given a list of shopping, calculate the total cost of those items.




Solution Summary:
  I have used Java and Maven to create this automation. "ShoppingApplicationLogic" java file contains Shopping Basket  application logic which acts as an application created as per the problem statement,
  and is tested over various taste cases. Deliberately didn't handle 2 issues to demonstrate failed test cases.
  
  Approach 1 - Devevloped JUnit Test cases and integrated it with Extent report for detail log reporting and HTML report. Contains 15 test cases in total, 13 pass and 2 fail (open bug in application to demonsrate testcase failure). 
  Test cases can be executed by running "JUnitTests.java" or "pom.xml" as Junit Test run.
  
  Approach 2 - Developed TestNG + Cucumber Test cases to demonstrate BDD approach. It has inbuilt TestNG/Cucumber report (did not customize). Contains same 15 test cases and 13 pass and 2 fail (open bug in application to demonsrate testcase failure). 
  Test cases can be executed by running "TestsCucumberTestNGRunner.java" or "testng.xml" as TestNG Test run.
  
  I have create testdata JSON file which has all the test data used in this framework, and it provides test data to all the testcases.

  All the reports will be stored in target and test-output folders. "JUnitTests-extent-report.html" is customized report to provide detailed representation of the tests executed in JUnitTests.java. Other reports are bydefault generated but can be customized in future.
  



Solution Highlights:
  1) Developed Maven Project
  2) Used Java + JUnit, TestNG, Cucumber(BDD), Data-driven Framework 
  3) Extent Report (for JUnit) for detail reporting



Details of Tools and Technologies used for this Framework:
  1) Java - Coding Language
  2) Maven tool - for automation
  3) Data Driven approach - Test Data is stored in JSON file and used dynamically
  4) JUnit - Test cases using JUnit (approach 1)
  5) Extent Report (surefire) - To generate a detailed HTML report of JUnit Tests results
  6) TestNG + Cucumber - Test cases using TestNG and Cucumber (BDD - approach 2), inbilt TestNG/Cucumber report


