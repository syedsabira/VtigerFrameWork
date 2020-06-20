package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageElements {
	@FindBy(css = "img[alt='Create Product...']")
	private WebElement CreateProduct;
	
	public WebElement getCreateProduct()
	{
		return CreateProduct;
	}
}
