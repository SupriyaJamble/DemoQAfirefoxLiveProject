Feature: Login functionality scenarios

@Login @one
	Scenario: Verify whether the user is able to register 
		Given I launch the application
		And I navigate to Account Login page
		When I login to the application using Username "ravi.kiran1@gmail.com" and Password "rkiran"
		Then I should see the user is able to login successfully
	@Login @Two	
	Scenario: Verify whether the user is not able to login using invalid credentials
		Given I launch the application
		And I navigate to Account Login page
		When I login to the application using Username "ravi.kiran99@gmail.com" and Password "rkiran99"
		Then I should see an error message that the credentials are invalid
	@Login @Three	
	Scenario: Verify whether user is not able to login without providing credentials
		Given I launch the application
		And I navigate to Account Login page
		When I login to the application using Username "" and Password ""
		Then I should see an error message that the credentials are invalid
	@Login @Four
	Scenario: Verify whether the user is bale to reset the forgotton password
		Given I launch the application
		And I navigate to Account Login page
		When I reset the forgotton password for email "ravikiran@gmail.com"
		Then I should see a message informing the user that information related to resetting password have been sent to email address
		
		
		
	
 
