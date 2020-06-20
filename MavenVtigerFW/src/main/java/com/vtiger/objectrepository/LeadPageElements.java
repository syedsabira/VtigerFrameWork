package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadPageElements {
	@FindBy(css = "img[alt='Create Lead...']")
	private WebElement CreateLead;
	
	public WebElement getCreateLead()
	{
		return CreateLead;
	}
}
