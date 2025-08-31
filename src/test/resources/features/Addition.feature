Feature: Addition of two given numbers
 
  Background:
    Given Addition scenario
 
  @ValidValues
  Scenario: Add values
 
    When User enters n1 as "5.0" and n2 as "4.0"
    Then Addition should be calculated successfully.