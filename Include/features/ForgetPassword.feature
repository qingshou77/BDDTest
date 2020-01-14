@tag
Feature: Forget Password Feature

  @tag1
  Scenario Outline: Forget Password successfully with valid information
    Given I go to the forgot password page success
    When I enter my email address "<emailaddress>" and submit
    Then Display the message "<message>" to check an email

    Examples: 
      | emailaddress          | message                                                                          |
      | kingge77@yahoo.com.sg | An email has been sent to your email address that includes a password reset link |
