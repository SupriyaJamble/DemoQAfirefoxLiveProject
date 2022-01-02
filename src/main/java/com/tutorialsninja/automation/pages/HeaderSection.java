package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeaderSection {
	
	public HeaderSection()
	{
		PageFactory.initElements(Base.driver, this);
	}
	//POB has all the elements and reusable methods of that page
	@FindBy(xpath="//span[@class='c']")
	public static WebElement myAccountLink;
	@FindBy(linkText="Register")
	public static WebElement register;

	@FindBy(linkText="login")
	public static WebElement Login;
	
	@FindBy(css="input[class$='input-lg']")
	public static WebElement Searchbox;
	
	@FindBy(css="input[class$='btn-lg']")
	public static WebElement Button;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement viewshoppingcartoption;
	
	public static void NavigatetoLoginPage()
	{
		Elements.click(myAccountLink);
		Elements.click(Login);
	}
	public static void searchProduct()
	{
		 Elements.TypeText(Searchbox, Base.reader.getproduct());
		 Elements.click(Button);
	}
	public static void Navigatetoshoppingcartpage()
	{
		Elements.click(viewshoppingcartoption);
	}
	

}
