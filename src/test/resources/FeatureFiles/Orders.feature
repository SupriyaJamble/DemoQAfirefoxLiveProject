Feature: End to End Scenarios for palcing orders

@Orders @One
	Scenario: Verify wheteher user is able to place orders
		Given I login to the application
		When I add a product to bag and check
		And I place an order
		Then I should see that the order is successfully placed
		