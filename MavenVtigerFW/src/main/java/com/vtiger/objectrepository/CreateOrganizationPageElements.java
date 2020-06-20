package com.vtiger.objectrepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CreateOrganizationPageElements {
	@FindBy(name = "accountname")
	private WebElement OrganizationNameTb;
	@FindBy(xpath = "//input[@value='  Save  ']")
	private WebElement SaveBtn;
    public WebElement getOrganizationNameTb()
    {
    	return OrganizationNameTb;
    }
    public WebElement getSaveBtn()
    {
    	return SaveBtn;
    }
}
