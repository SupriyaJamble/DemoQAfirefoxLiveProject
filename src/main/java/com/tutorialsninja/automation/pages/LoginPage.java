package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {

	public LoginPage()
	{
		PageFactory.initElements(Base.driver,this);
	}

	@FindBy(id="input-email")
	public static WebElement email_filed;

	@FindBy(id="input-password")
	public static WebElement password_filed;

	@FindBy(css="input[type='submit'][value='login']")
	public static WebElement loginButton;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement Warningmsg;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement forgotpass;

	public static void dologin(String email,String password)
	{
		Elements.TypeText(LoginPage.email_filed,email);
		Elements.TypeText(LoginPage.password_filed, password);
		Elements.click(LoginPage.loginButton);
	}
}
