package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationPageElements {
	@FindBy(css = "img[title='Create Organization...']")
	private WebElement createOrganization;
	
	public WebElement getcreateOrganization()
	{
		return createOrganization;
	}
}
