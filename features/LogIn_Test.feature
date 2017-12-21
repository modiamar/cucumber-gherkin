Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
	Given User is at Home Page
	When User Navigates to LogIn page
	And User enters <username> and <password>
	Then Message displayed LogIn Successfully
	
Examples:
| username | password |
	
Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully
	
	
