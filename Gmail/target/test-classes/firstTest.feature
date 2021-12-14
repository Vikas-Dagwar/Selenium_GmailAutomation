Feature:Send Email
  Scenario: User should be able to Send email
    Given The user is on login page
    When The user enters credentials and perform gmail login
    Then User should send email