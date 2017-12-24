
Feature: Test Hooks
 
Scenario: This scenario is to test hooks functionality
	Given this is the first step
	When this is the second step
	Then this is the third step
	

Scenario Outline: This scenario is to test hooks functionality2
	Given this is the first user <name>
	When this is the second step
	Then this is the third step

Examples:
	|name|
	|Scenario|
	|berbi|
	|resdfr|
	 
	