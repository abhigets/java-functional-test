Feature: simple journey

  Scenario: Test Quotation creation journey
    Given User is on home page
    When User chooses to create a new quotation
    And User enter quotation title as "New Sodexo quote"
    And User enter following voucher set details:
    |Name|Quantity|Denomination|DenominationQuantity|
    |emp1|100     |10          |10                  |

  Scenario: Create a Quotation with delivery mechanism of SMS and Email
    Given User navigate to client portal
    And Client chooses to create a new quotation where delivery mechanism is SMS & EMAIL
    Then User navigates to staff portal
    And Staff creates a quotation for client
    Then User navigate to client portal
    And Client rejects a quotation
    Then User navigates to staff portal
    And Staff recreates a quotation for client
    And Staff accepts quotation for client and places order
    Then User navigate to client portal
    And Client upload invoice and payments details
    Then User navigates to staff portal
    And Staff approves payment and places order in core pass
    And Staff distributes orders through Inventory
