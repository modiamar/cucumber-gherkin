#Each feature file contains one feature
Feature: Test the login functionality on sdet university

Scenario: the user should be able to login with correct username and password
Given user is on the login page
When user enters correct username and correct password
Then user gets confirmation