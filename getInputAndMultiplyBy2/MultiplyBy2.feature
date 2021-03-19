Feature: Multiply the input by 2
Scenario Outline: 
Given  The user enters the "<number>"
When  The user multiplies the number by two
Then  "<twice the number>" should be displayed

Examples:

|number|twice the number|
|5     |10              |
|-12   |-24       		|