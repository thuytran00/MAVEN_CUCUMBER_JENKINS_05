
Feature: Login
  As a PO
  I want to login to application
  So that verify login function work well
  

  Scenario: Login to system
   Given Iopen application
   When I input to Username "mngr47659"
   And I input to Password "12345@"
   And I click to Login button
   Then Verify Homepage displayed with message "Welcome To Manager's Page of GTPL Bank"
	And I close browser
	
    

