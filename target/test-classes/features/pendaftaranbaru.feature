Feature: As admin I want to register a new patient so that he/she can get treatment

Background:
  Given  admin on login page
  When admin input valid id
  And admin input valid password
  And admin click on masuk button
  Then admin on homepage
  And admin click new patient registration button

  Scenario: As admin I want to register a new patient with valid data
    Given admin on new patient registration page
    When admin input valid NIK
    And admin input valid fullname
    And admin input valid no hp
    And admin choose gender
    And admin choose poli
    And admin choose doctor
    And admin choose time
    And admin input keluhan
    Then Admin click confirmation button
    And new patient registered succesfully


