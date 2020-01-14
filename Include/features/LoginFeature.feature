@tag
Feature: Login Feature

  @tag1
  Scenario Outline: Login successfully with valid information
    Given Go to login page successfully
    When I enter the correct "<username>" username and "<password>" password
    Then Show the correct expect "<message>" message

    Examples: 
      | userame            | password                 | message  |
      | chungkh@stengg.com | Kr4d/vgDUkIxPYyzw6Q/3g== | Sign Out |
