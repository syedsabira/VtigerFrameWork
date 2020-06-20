package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vtiger.genericLib.BaseClass;

public class HomePageElements extends BaseClass{
	@FindBy(linkText = "Leads")
	private WebElement Leads;
	@FindBy(linkText = "Organizations")
	private WebElement Organizations;
	@FindBy(linkText = "Products")
	private WebElement Products;
	@FindBy(linkText = "More")
	private WebElement More;
	@FindBy(name = "Campaigns")
	private WebElement MoreDD;
	@FindBy(xpath = "//span[text()=' Administrator']/../following-sibling::td[1]/img")
	private WebElement Administrator;
	@FindBy(linkText = "Sign Out")
	private WebElement SignOut;
	public WebElement getLeads()
	{
		return Leads;
	}
   public WebElement getOrganizations()
   {
	   return Organizations;
   }
   public WebElement getProducts()
   {
	   return Products;
   }
   public WebElement getMore()
   {
	   return More;
   }
   public WebElement getMoreDD()
   {
	   return MoreDD;
   }
   public WebElement getAdministrator()
   {
	   return Administrator;
   }
   public WebElement getSignOut()
   {
	   return SignOut;
   }
   public void LogoutFromApp()
   {
	   wlib.keepMouseElement(Administrator);
	   SignOut.click();
   }
}


