Feature: Calculator Basic Operations Test
	As a user I want to use a calculator to 
	1. Subrtact  
	2. Divide numbers and 
	3. Clear Calculator Display

Scenario: I want to subtract two numbers 
	Given Initialize the browser with chrome 
	And Navigate to "https://www.online-calculator.com/full-screen-calculator/" Site 
	And Subtract two numbers <value1> and <value2> 
	
	
Scenario: I want to Clear 
	Given Initialize the browser with chrome 
	And Navigate to "https://www.online-calculator.com/full-screen-calculator/" Site 
	Given Clear Calculator display 
	
	
Scenario: I want to divide two numbers 
	Given Initialize the browser with chrome 
	And Navigate to "https://www.online-calculator.com/full-screen-calculator/" Site 
	Then Divide two numbers
	
	
	
