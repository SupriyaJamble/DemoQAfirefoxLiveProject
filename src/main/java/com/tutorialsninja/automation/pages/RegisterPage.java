package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage {
	
	public RegisterPage()
	{
		PageFactory.initElements(Base.driver,this);
	}
	
	@FindBy(id="input-firstname")
	public static WebElement FirstName;
	
	@FindBy(id="input-lastname")
	public static WebElement LastName;
	
	@FindBy(id="input-email")
	public static WebElement Email;
	
	@FindBy(id="input-telephone")
	public static WebElement Telephone;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(id="input-confirm")
	public static WebElement confirmpassword;
	
	@FindBy(name="agree")
	public static WebElement privacypolicycheckbox;
	
	@FindBy(css="input[type='submit'][value='Continue']")
	public static WebElement button_continue;
	
	@FindBy(linkText="Register")
	public static WebElement registerBreadCrum;
	
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement firstnamewarning;
	
	@FindBy(css="input[id='input-lastname']+div")
	public static WebElement lastnamewarning;
	
	@FindBy(css="input[id='input-email']+div")
	public static WebElement Emailwarning;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement telephonewarning;
	
	@FindBy(css="input[id='input-password']+div")
	public static WebElement passwordwarning;
	
	@FindBy(css="div[class$='alert-dismissible']")//class$---this is css selector which means class ends with
	public static WebElement mainwarning;
	
	@FindBy(css="input[name='newsletter'][value='1']")
	public static WebElement yestonewsletter;
	
	
	public static void EnterAllDetails(DataTable dataTable,String detailsType)
	{
		Map<String, String> map=dataTable.asMap(String.class, String.class);
		  Elements.TypeText(RegisterPage.FirstName, map.get("FisrtName"));
		  Elements.TypeText(RegisterPage.LastName, map.get("LastName"));
		 
		  Elements.TypeText(RegisterPage.Telephone, map.get("Telephone"));
		  Elements.TypeText(RegisterPage.password,map.get("Password"));
		  Elements.TypeText(RegisterPage.confirmpassword,map.get("password"));
		  
		  if(detailsType.equalsIgnoreCase("duplicate"))
			  Elements.TypeText(RegisterPage.Email,map.get("Email"));
		  else
			  Elements.TypeText(RegisterPage.Email,System.currentTimeMillis()+map.get("Email"));  
			  
	}
	
}
