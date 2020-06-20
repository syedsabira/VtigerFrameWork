package com.vtiger.objectrepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CreateLeadPageElements {
	@FindBy(name = "lastname")
	private WebElement lastNameTb;
	@FindBy(name = "company")
	private WebElement companyTb;
	@FindBy(xpath = "//input[@value='  Save  ']")
	private WebElement SaveBtn;
	
	public WebElement getLastNameTb()
	{
		return lastNameTb;
	}
	public WebElement getCompanyTb()
	{
		return companyTb;
	}
	public WebElement getSaveBtn()
	{
		return SaveBtn;
	}

}
