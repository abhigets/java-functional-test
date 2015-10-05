Feature: simple journey

  Background:
    Given User navigate to client app


  Scenario: Test a simple journey of home page navigation
    Given User is on home page
    Then User should see Dashboard


  Scenario: Test Quotation creation journey
    Given User is on home page
    When User click on create a new quotation
    And User enter quotation title as "My Sodexo"
    And User enter following set as :
    |Name|Quantity|Denomination|DenominationQuantity|
    |emp1|100     |10          |10                  |

