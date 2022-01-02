package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckoutPage {
	public CheckoutPage()
	{
		PageFactory.initElements(Base.driver,this);
	}
	@FindBy(id="button-payment-address")
	public static WebElement continuebuttonofBillingdetailssection;
	
	@FindBy(id="button-shipping-address")
	public static WebElement continuebuttonofDeliverydetailssection;
	
	@FindBy(id="button-shipping-method")
	public static WebElement continuebuttonofDeliverymethodsection;
	
	@FindBy(name="agree")
	public static WebElement termsadconditionscheckbox;
	
	@FindBy(id="button-payment-method")
	public static WebElement continuebuttonofpaymentsmethodsection;
	
	@FindBy(id="button-confirm")
	public static WebElement confirmorderbutton;
	
	public static void placeanorder()
	{
		Elements.click(CheckoutPage.continuebuttonofBillingdetailssection);
		   Elements.click(continuebuttonofDeliverydetailssection);
		   Elements.click(continuebuttonofDeliverymethodsection);
		   Elements.click(termsadconditionscheckbox);
		   Elements.click(continuebuttonofpaymentsmethodsection);
		   Elements.click(confirmorderbutton);
	}
}
