Feature: As admin I want to register a patient so that she/he can get treatment

  Background:
    Given  admin on login page
    When admin input valid id
    And admin input valid password
    And admin click on masuk button
    Then admin on homepage
    And admin click old patient registration button

  Scenario: As admin I want to register a patient
    Given admin on patient registration page
    When admin input valid id patient
    And patient's data autofilled
    And admin choose poli
    And admin choose doctor
    And admin choose time
    And admin input keluhan
    Then Admin click confirmation button
    And new patient registered succesfully

  Scenario: As admin I want to input invalid id patient
    Given admin on patient registration page
    When admin input invalid id patient
    Then patient's data still empty
