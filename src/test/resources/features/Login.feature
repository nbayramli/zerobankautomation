Feature: Login
  As authorized user, I want to be able to login into zerobank
   with  valid username and password



 @positive_test
  Scenario: Login as authorized user
    Given user is on the login page
    Then user logs in with valid credentials
    And user verifies that "Account Summary" page subtitle is displayed


  @negative_test
  Scenario: Verify that users should not be able to login with invalid username or wrong password
    Given user is on the login page
    Then user enters "invalid" username and "wrong" password
    And user verifies that "Login and/or password are wrong." error message is displayed

  @negative_test
  Scenario: Verify that users should not be able to login with blank username or password
    Given user is on the login page
    Then user  does not enters username and password
    And user verifies that "Login and/or password are wrong." error message is displayed
