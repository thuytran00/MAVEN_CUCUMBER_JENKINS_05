Feature: ACCOUNT
  As a PO
  I want to login to application
  So that verify login function work well

  Scenario Outline: Create New Customer
    Given I open New Customer page
    When Input to New Customer form with data
      | Name   | Gender | DateOfBirth   | Address   | City   | State   | Pin   | Phone   | Email   | Password   |
      | <Name> | m      | <DateOfBirth> | <Address> | <City> | <State> | <Pin> | <Phone> | <Email> | <Password> |
    And I click to Submit button at New Customer page
    Then Verify message displayed with data "<Message>"
    And I verify all above infomation created success
      | Name   | Gender | DateOfBirth   | Address   | City   | State   | Pin   | Phone   | Email   |
      | <Name> | male   | <DateOfBirth> | <Address> | <City> | <State> | <Pin> | <Phone> | <Email> |
    When I get Customer ID at New Customer page

    Examples: New Customer info
      | Name      | DateOfBirth | Address    | City        | State   | Pin    | Phone      | Email    | Password | Message                             |
      | Auto Test | 1999-01-01  | 123 Le Loi | Ho Chi Minh | Thu Duc | 123456 | 0987654321 | autotest | 123123   | Customer Registered Successfully!!! |

  Scenario Outline: Edit Customer
    Given I open application
    When I input to Username textbox
    And I input to Password textbox
    And I click to Login button at Login page
    Then Verify Home page displayed with message "Welcome To Manager's Page of Guru99 Bank"
    When I open Edit Customer page
    And Input Customer ID to textbox
    And I click to Submit button at Edit Customer page
    And Input to Edit Customer form with data
      | Address   | City   | State   | Pin   | Phone   | Email   |
      | <Address> | <City> | <State> | <Pin> | <Phone> | <Email> |
    And I click to Submit button at Edit Customer page
    Then Verify message displayed with data "Customer details updated Successfully!!!"
    And I verify all above infomation edited success
      | Address   | City   | State   | Pin   | Phone   | Email   |
      | <Address> | <City> | <State> | <Pin> | <Phone> | <Email> |
    And I close browser

    Examples: Edit Customer info
      | Address         | City             | State        | Pin    | Phone      | Email        |
      | 123 Edit Le Loi | Edit Ho Chi Minh | Edit Thu Duc | 123456 | 0987654321 | editautotest |