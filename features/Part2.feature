Feature: Login Action2

Scenario: Successful Login with Valid Credentials2
	Given User is on Home Page2
	When User Navigate to LogIn Page2
	And User enters Credentials to LogIn
    | testuser_1 | Test@153 |
  And User says Hello
  	| waffle | hello |
	Then Message displayed Login Successfully2

Scenario: Successful LogOut2
	When User LogOut from the Application2
	Then Message displayed LogOut Successfully2