Feature: To do online Shopping

  As a User
  I want to login
  So I can do shopping
  
@Login
  Scenario: User can Login
    Given User is on Tesco Direct Home Page
    When User tries to login with Username "rohithboora@gmail.com" and Password "1234567890"
    Then User can see the profile page with sign out option
 
 