package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductInfoPageElements {
	@FindBy(className = "lvtHeaderText")
	private WebElement SuccessMsg;
	public WebElement getSuccessMsg()
	{
		return SuccessMsg;
	}

}
