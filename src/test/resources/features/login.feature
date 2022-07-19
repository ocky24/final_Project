Feature: As admin I want to login, so I can register patient

  Scenario: As admin I want to login with valid data
    Given  admin on login page
    When admin input valid id
    And admin input valid password
    And admin click on masuk button
    Then admin on homepage

  Scenario: As admin I want to login with invalid id
    Given  admin on login page
    When admin input invalid id
    And admin input valid password
    And admin click on masuk button
    Then error notification appears

  Scenario: As admin I want to login with invalid password
    Given  admin on login page
    When admin input valid id
    And admin input invalid password
    And admin click on masuk button
    Then error password notification appears

  Scenario: As admin I want to login with invalid id and invalid password
    Given  admin on login page
    When admin input invalid id
    And admin input invalid password
    And admin click on masuk button
    Then error notification appears

