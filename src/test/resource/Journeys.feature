Feature: simple journey

  @journey1 @all
  Scenario: Create a Quotation with delivery mechanism of SMS and Email
    Given User navigate to client portal
    And Client is thinking to create a quotation with name "Quotation where delivery mechanism is sms and email"
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

  @journey2 @all
  Scenario: Create a Quotation with delivery mechanism of Extract
    Given User navigate to client portal
    And Client is thinking to create a quotation with name "Quotation with delivery mechanism is extract"
    And Client chooses to create a new quotation where delivery mechanism is extract
    Then User navigates to staff portal
    And Staff creates a quotation for client
    Then User navigate to client portal
    And Staff accepts quotation for client and places order
    Then User navigate to client portal
    And Client upload invoice and payments details
    Then User navigates to staff portal
    And Staff approves payment and places order in core pass
    And Staff distributes orders through Inventory

  Scenario: temp
    Given User navigate to client portal
    And Client is thinking to create a quotation with name "Quotation where delivery mechanism is sms and email1"
    Then User navigates to staff portal
    And Staff creates a quotation for client