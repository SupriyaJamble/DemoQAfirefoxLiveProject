package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.CheckoutPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchResultPage;
import com.tutorialsninja.automation.pages.ShoppingCart;

import cucumber.api.java.en.*;


public class Orders {
	HeaderSection headersection=new HeaderSection();
	LoginPage loginpage = new LoginPage();
	SearchResultPage searchresult = new SearchResultPage();
	ShoppingCart shoppingcart = new ShoppingCart();
	CheckoutPage checkout=new CheckoutPage();
	OrderSuccessPage ordersuccesspage=new OrderSuccessPage();

	@Given("^I login to the application$")
	public void i_login_to_the_application() {

		Browser.openApplicationURL();
		HeaderSection.NavigatetoLoginPage();
		LoginPage.doLogin();
	}

	@When("^I add a product to bag and check$")
	public void i_add_a_product_to_bag_and_check() {
		HeaderSection.searchProduct();
		SearchResultPage.addFirstProductInTheSearchResultsToCart();
		HeaderSection.Navigatetoshoppingcartpage();
		ShoppingCart.navigatetocheckoutpage();
	}

	@And("^I place an order$")
	public void i_place_an_order()  {
		CheckoutPage.placeanorder();
	}

	@Then("^I should see that the order is successfully placed$")
	public void i_should_see_that_the_order_is_successfully_placed()  {
		Waits.waitUntilElementLocated(10, OrderSuccessPage.successBreadCrumb);
		Assert.assertTrue(Elements.isDisplayed(OrderSuccessPage.successBreadCrumb));

	}

}
