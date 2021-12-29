package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

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
	
	

}
