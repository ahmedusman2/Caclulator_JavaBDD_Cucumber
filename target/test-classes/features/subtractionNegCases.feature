Feature: Calculator Negative Operations Test 
	As a user I want to use a calculator to 
	1. Subrtact two nagative numbers
	2. Subtract one positive one negative number
	3. Subtract zero from a number

Scenario: I want to subtract two negative numbers (-6 sub -3) 
	Given Initialize the browser with chrome 
	And Navigate to "https://www.online-calculator.com/full-screen-calculator/" Site 
	And Subtract two negative numbers 
	
Scenario: I want to subtract one negative and one positive number (6 sub -3) 
	Given Initialize the browser with chrome 
	And Navigate to "https://www.online-calculator.com/full-screen-calculator/" Site 
	And Subtract one Negative and one Positive numbers 
	
Scenario: I want to subtract zero from a number (6 sub 0) 
	Given Initialize the browser with chrome 
	And Navigate to "https://www.online-calculator.com/full-screen-calculator/" Site 
	And Subtract zero from a number
	