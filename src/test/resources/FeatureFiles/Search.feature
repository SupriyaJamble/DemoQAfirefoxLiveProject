Feature: Search functionality sceanrios

	@Search @One
	Scenario: Verify whether the user is able to search for the products
		Given I launch the application
		When I search for a product "Samsung SynMaster 941BW"
		Then I should see the product in the search results
	@Search @Two	
	Scenario: Verify whether the user is informed when the product being searched is not available
		Given I launch the application
		When I search for a product "Apple iphone"
		Then I should see a message informing "Your shopping cart is empty!"
		