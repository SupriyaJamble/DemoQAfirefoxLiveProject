Feature: Registration functionality scenarios

	Scenario: Verify whether user is able to register into the application by providing all the fileds
		Given I launch the application
		And I navigate to Account Registartion page
		When I fill all the below valid details
		  |FisrtName|Ravi								  |
		  |LastName	|Kiran								|
		  |Email		|ravi.kiran2@gmail.com|
		  |Telephone|9552239055						|
		  |Password	|rkiran								|
		  
		And I click on select the privacy policy
		And I click on continue button
		Then I should see that the user account has successfully created.
		
	Scenario: Verify whether the user is not allowed to register on skipping the mandatory fields
			Given I launch the application
			And I navigate to Account Registartion page
			And I click on continue button 
			Then I should see that the user account is not created
			And I should see the error messages informing the user to fill the mandatory fields
			
	Scenario: Verify whether the user is able to register into the application by opting for newsletter subscription
			Given I launch the application
			And I navigate to Account Registartion page
			When I fill all the below valid details
		  |FisrtName|Ravi								  |
		  |LastName	|Kiran								|
		  |Email		|ravi.kiran2@gmail.com|
		  |Telephone|9552239055						|
		  |Password	|rkiran								|
		  
			And I click on select the privacy policy
			And I subcribe to newsletter
			And I click on continue button
			Then I should see that the user account has successfully created.
			
	Scenario: Verify whether user is restricted from creating a duplicate account
			Given I launch the application
			And I navigate to Account Registartion page
			When I fill the below duplicate details
		  |FisrtName|Ravi								  |
		  |LastName	|Kiran								|
		  |Email		|ravi.kiran2@gmail.com|
		  |Telephone|9552239055						|
		  |Password	|rkiran								|
		  And I click on select the privacy policy
			And I click on continue button
			Then I should see that the user is restricted from creating duplicate account.
			
			