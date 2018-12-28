@account
Feature: CUSTOMER
  As a PO
  I want to login to application
  So that verify login function work well
  
@register
Scenario: Register to application  
   Given I get login page Url
   And I click to here link
   And I input to email textbox with data "autorandom"
   And I click to Submit button at Register Page
   Then I get UserID infor
   And I get Password infor
	 When I open Login page again
	@login
  Scenario: Login to application
   Given I input to UserID textbox
   And I input to Password textbox
   And I click to Login button at Login page
   Then Verify Homepage displayed with message "Welcome To Manager's Page of Guru99 Bank"
	@new_customer
	Scenario Outline: Create New Customer
    Given I open New Customer page
    When Input to New Customer form with data
      | Name    | DateOfBirth   | Address   | City   | State   | Pin   | Phone   | Email   | Password   |
      | <Name>  | <DateOfBirth> | <Address> | <City> | <State> | <Pin> | <Phone> | <Email> | <Password> |
    And I sleep some times
    #And I click to Submit button at New Customer page
    #Then Verify message displayed with data "<Message>"
    #And I verify all above infomation created success
     | Name   | Gender | DateOfBirth   | Address   | City   | State   | Pin   | Phone   | Email   |
     | <Name> | male   | <DateOfBirth> | <Address> | <City> | <State> | <Pin> | <Phone> | <Email> |
    #When I get Customer ID at New Customer page

    Examples: New Customer info
      | Name      | DateOfBirth | Address    | City        | State   | Pin    | Phone      | Email    | Password | Message                             |
      | Auto Test | 1999-01-01  | 123 Le Loi | Ho Chi Minh | Thu Duc | 123456 | 0987654321 | autotest | 123123   | Customer Registered Successfully!!! |
	
	