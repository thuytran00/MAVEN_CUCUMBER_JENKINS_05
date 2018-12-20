
@login
Feature: Login
  As a PO
  I want to login to application
  So that verify login function work well
  

  Scenario: Login to system with param
   Given I open application
   When I input to Username "mngr47659"
   And I input to Password "12345@"
   And I click to Login button
   Then Verify Homepage displayed with message "Welcome To Manager's Page of GTPL Bank"
	And I close browser
	
   Scenario Outline: Login to system with example datatable
   Given I open application
   When I input to Username "<Username>"
   And I input to Password "<Password>"
   And I input with all data to New Customer
   | Name  			 | DateOfBirth | Address       | City | Phone        | Email               | State   | 
   | Auto Test   | 01-01-2011  | 123 Address   | HCM  | 0123456789   | autotesst@gmail.com | Vn      |
   And I click to Login button
   Then Verify Home page displayed with message "Welcome To Manager's Page of GTPL Bank"
	 And I close browser
	 
	 Examples: Username and Password Datatable
	 | Username   | Password |
	 | mngr47659  | 12345@   |
	 | mngr47659  | 12345@   |
	 | mngr47659  | 12345@   |


