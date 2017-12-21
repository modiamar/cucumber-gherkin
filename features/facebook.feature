Feature: Logging into Facebook

Scenario Outline: the user can login to Facebook
Given user is on facebook page
When user enters facebook email <facebookid>
And user enters facebook password <facebookpass>
And user clicks facebook login screen
Then user gets facebook confirmation

Examples:
| facebookid | facebookpass |
| test@gmail.com| potaoes|