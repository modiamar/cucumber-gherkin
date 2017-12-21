#Each feature file contains one feature
Feature: Test the login functionality on sdet university

Scenario: the user should be able to login with correct username and password
Given user is on the login page
When user enters correct username and correct password
Then user gets confirmation

#Scenario Outline means that we will have parametrized data
#Remember to distinguish between what each statement states
Scenario Outline: the user should be able to login
Given user is on the login page
When user enters email <username>
And user enters password <password>
And user clicks login button
Then user gets confirmation

#Data Table
Examples:
| username | password |
| tim@testemail.com | trpass |
| rw@testemail.com | rwpass | 
| jv@testemail.com | jvpass |

