@tag
Feature: validate the hotel login functions

Background:
Given Launch the browser
And open application

Scenario Outline:

When Enter the "<username>" and valid "<password>"
And Enter the "<location>" and hotel"<hotel>" and room"<roomtype>"
And Enter the first"<firstname>" and lastname"<lastname>" and "<address>"
And Enter the cardno"<cardno>" and cardtype"<cardtype>" and month "<exp_month>" and year"<exp_year>" and cvv "<cvv>" 
Then I validate the outcomes 
Then close the browser

Examples:
|username|password|location|hotel|roomtype|firstname|lastname|address|cardnum|cardtype|exp_month|exp_year|cvv|
|faizulrahuman|faizulrahuman008|Melbourne|Hotel sunshine|Double|selvaraj|pandey|Edappadi|9845697845235469|VISA|7|2025|224|



  
 
  