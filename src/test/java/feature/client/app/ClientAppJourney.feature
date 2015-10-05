Feature: simple journey

  Background:
    Given User navigate to client app


  Scenario: Test a simple journey of home page navigation
    Given User is on home page
    Then User should see Dashboard


  Scenario: Test Quotation creation journey
    Given User is on home page
    When User chooses to create a new quotation
    And User enter quotation title as "New Sodexo quote"
    And User enter following voucher set details:
    |Name|Quantity|Denomination|DenominationQuantity|
    |emp1|100     |10          |10                  |

