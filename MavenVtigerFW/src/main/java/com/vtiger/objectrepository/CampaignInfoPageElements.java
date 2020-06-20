package com.vtiger.objectrepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CampaignInfoPageElements {
	@FindBy(className = "dvHeaderText")
	private WebElement successMsg;
	
	public WebElement getSuccessMsg()
	{
		return successMsg;
	}
}
