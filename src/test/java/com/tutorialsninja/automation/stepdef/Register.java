package com.tutorialsninja.automation.stepdef;

import java.util.Map;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;



public class Register {
	HeaderSection headersection =new HeaderSection();
	RegisterPage registerpage=new RegisterPage();
	AccountSuccessPage accountsuccess=new AccountSuccessPage();

	@Given("^I launch the application$")
	public void i_launch_the_application()  {
		Base.driver.get(Base.reader.getUrl());

	}

	@And("^I navigate to Account Registartion page$")
	public void i_navigate_to_Account_Registartion_page() {
		Elements.click(HeaderSection.myAccountLink);
		Elements.click(HeaderSection.register);
	}

	@When("^I fill all the below valid details$")
	public void i_fill_all_the_below_valid_details(DataTable dataTable)  {
		RegisterPage.EnterAllDetails(dataTable,"unique");



	}

	@And("^I click on select the privacy policy$")
	public void i_click_on_select_the_privacy_policy() {
		Elements.click(RegisterPage.privacypolicycheckbox);
	}

	@And("^I click on Continue Button$")
	public void i_click_on_Continue_Button() {
		Elements.click(RegisterPage.button_continue);

	}

	@Then("^I should see that the user account has successfully created\\.$")
	public void i_should_see_that_the_user_account_has_successfully_created() {
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.accountSuccessBreadCrumb));

	}


	@Then("^I should see that the user account is not created$")
	public void i_should_see_that_the_user_account_is_not_created()  {

		Assert.assertTrue(Elements.isDisplayed(RegisterPage.registerBreadCrum));

	}

	@And("^I should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields() {
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstnamewarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.lastnamewarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.Emailwarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephonewarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.passwordwarning));
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.mainwarning));


	}

	@And("^I subcribe to newsletter$")
	public void i_subcribe_to_newsletter(){
		Elements.click(RegisterPage.yestonewsletter);
	}
	@When("^I fill the below duplicate details$")
	public void i_fill_the_below_duplicate_details(DataTable dataTable) 
	{
	   RegisterPage.EnterAllDetails(dataTable,"duplicate");
	}

	@Then("^I should see that the user is restricted from creating duplicate account\\.$")
	public void i_should_see_that_the_user_is_restricted_from_creating_duplicate_account() 
	{
	   Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.mainwarning	, "Warning: E-mail Address is already registered!")); 
	}



}
