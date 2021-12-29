package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgotPassPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import cucumber.api.java.en.*;


public class Login {
	HeaderSection headersection=new HeaderSection();
	LoginPage loginpage=new LoginPage();
	MyAccountPage myaccountpage=new MyAccountPage();
	ForgotPassPage forgotpasspage=new ForgotPassPage();

	@And("^I navigate to Account Login page$")
	public void i_navigate_to_Account_Login_page()  {
		Elements.click(HeaderSection.myAccountLink);
		Elements.click(HeaderSection.Login);

	}

	@When("^I login to the application using Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void i_login_to_the_application_using_Username_and_Password(String email, String password)  {
		LoginPage.dologin(email, password);
	}

	@Then("^I should see the user is able to login successfully$")
	public void i_should_see_the_user_is_able_to_login_successfully()  {

		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.registeraffliateaccount));
	}
	@Then("^I should see an error message that the credentials are invalid$")
	public void i_should_see_an_error_message_that_the_credentials_are_invalid() {
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.Warningmsg," Warning: No match for E-Mail Address and/or Password."));
	}

	@When("^I reset the forgotton password for email \"([^\"]*)\"$")
	public void i_reset_the_forgotton_password_for_email(String email) {
		Elements.click(LoginPage.forgotpass);
		Elements.TypeText(ForgotPassPage.emailfield, email);
		Elements.click(ForgotPassPage.continueButton);
	}

	@Then("^I should see a message informing the user that information related to resetting password have been sent to email address$")
	public void i_should_see_a_message_informing_the_user_that_information_related_to_resetting_password_have_been_sent_to_email_address()  {
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.Warningmsg,"An email with a confirmation link has been sent your email address."));
	}
}
