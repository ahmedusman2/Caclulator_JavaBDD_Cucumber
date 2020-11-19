Feature: Calculator Division Negative Operations Test 
	As a user I want to use a calculator to 
	1. Divide Number by zero
	2. Divide two negative numbers
	3. Divide one positive one negative number

Scenario: Divide Number by zero (6 / 0) 
	Given Initialize the browser with chrome 
	And Navigate to "https://www.online-calculator.com/full-screen-calculator/" Site 
	And Divide number by zero

Scenario: I want to divide two negative numbers (-6  /  -3) 
	Given Initialize the browser with chrome 
	And Navigate to "https://www.online-calculator.com/full-screen-calculator/" Site 
	And Divide two negative numbers 
	
Scenario: I want to divide one positive one negative number (-6 / 3) 
	Given Initialize the browser with chrome 
	And Navigate to "https://www.online-calculator.com/full-screen-calculator/" Site 
	And Divide one positive by one negative number