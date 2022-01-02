package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class SearchResultPage {
	
	public SearchResultPage()
	{
		PageFactory.initElements(Base.driver,this);
	}
	@FindBy(linkText="Samsung SyncMaster 941BW")
	public static WebElement SamsungSyncMasterProduct;
    
	@FindBy(css="input[type='button'][value='Search']+h2+p")
	public static WebElement ProductNotMacth_msg;
	
	@FindBy(xpath="//span[text()='Add to Cart'][1]")
	public static WebElement fisrtAddtocartoption;
	
	public static void addFirstProductInTheSearchResultsToCart()
	{
		 Elements.click(fisrtAddtocartoption);
	}
}
