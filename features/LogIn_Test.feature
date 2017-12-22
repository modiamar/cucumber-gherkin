Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
	Given User is at Home Page
	When User Navigates to LogIn page
	And User enters <username1> and <password1>
	Then Message displayed LogIn Successfully
	
Examples:
| username1 | password1 |
| testuser_1 | Test@123 |

Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully
	
	
