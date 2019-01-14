Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Common step
  
  # ----------------ACTION ----------------#
  #Textbox
  And I input to "name" textbox with data "Automation Test"
  And I input to "city" textbox with random data "HCM"
  And I input to "state" textbox with random data "Thu Duc"
  And I input to "emailid" textbox with random data "autotest"
  And I input to "city" textbox with random data "HCM" 
  # 0 =fix data | 1= random data
  And I input to "" textbox with "0" data "Ha Noi"
  And I input to "" textbox with "1" data "Ha Noi"
  
  And I input to "email" textbox with "2" data "autotest"
  # autotest12423@gmail.com
  #Text Area
  And I input to "addr" textarea with data "123 Address"
  
  #Dropdown
  And I select item in "selectaccount" dropdown with data "Current"
  
  # Radio Button
  And I select "m" radio button 
  And I select "f" radio button
  
  #Button
  And I click to "" button
  # Link
  And I open "New Customer" page
  And I open "Edit Customer" page
  #Regex
  And I input first Account ID
  And I input second Account ID
  # --------------- VERIFY ------------------#
  
  And Verify message "Customer Registered Successfully!!!" displayed success
  And Verify message "Customer details updated Successfully!!!" displayed success
  And Verify message "Account Generated Successfully!!!" displayed success
  
  # --------------- WAIT ------------------#
  And I sleep with "30" times
  And I sleep with "5" times
  And I sleep with "10" times