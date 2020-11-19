# Caclulator_JavaBDD_Cucumber
Caclulator_JavaBDD_Cucumber for calculator automation.

# About the suite: 
This automation Suite is based on following technology components: 

1. JAVA 
2. Cucumber BDD 
3. Maven 
5. TestNG 
6. Log4J 
6. Extent Reports 

Note: All specefic jars are mentioned in maven pom.
 
## Setting up the Automator: 
1. Download the Project from following Git repository: (public repo)
```python
https://github.com/ahmedusman2/Caclulator_JavaBDD_Cucumber.git
```
2.       Running from command prompt. Open the project folder from command prompt and hit following command:   mvn clean test -DsuiteXmlFile=testngCucumber.xml 

3.       Alternately the project could be executed from Eclipse IDE. Importing the project as Maven Project and then run “testngCucumber.xml” as Test 

Test File Details:

1. calulatorBasicOperations.feature: 
This file includes Testcase for basic Operations under test like Sub, multiple and clear button functionality. 

Scenarios:  
Subtract two whole numbers 
Hit clear 
Divide two whole numbers 
 

2. subtractionNegCases.feature: 
This file includes Negative Testcase for Operations under test like Sub, multiple and clear button functionality. 
Scenarios:  
1. Subtract two negative numbers 
2. Subtract one positive one negative number 
3. Subtract zero from a number 

3. divisionNegCases.feature 

This file includes Negative Testcase for Operations under test like Sub, multiple and clear button functionality. 
Scenarios:  
1. Divide two negative numbers 
2. Divide one positive one negative number 
3. Divide zero by zero 

 
