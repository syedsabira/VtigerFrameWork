package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignPageElements {
	@FindBy(xpath = "//img[@title='Create Campaign...']")
	private WebElement CreateCampaign;
	
	public WebElement getCreateCampaign()
	{
		return CreateCampaign;
	}
}
