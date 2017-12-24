
Feature: Part 3

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page3
	When User Navigate to LogIn Page3
	And User enters Credentials to LogIn3
	| username   | password |
  | testuser_1 | Test@153 |
  | testuser_2 | Test@154 |
  | test234 | bbomg |
	Then Message displayed Login Successfully3