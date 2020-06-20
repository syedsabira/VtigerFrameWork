package com.vtiger.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProductPageElements {
	@FindBy(name = "productname")
	private WebElement ProductNameTb;
	@FindBy(xpath = "//input[@value='  Save  ']")
	private WebElement SaveBtn;
	@FindBy(xpath = "//select[@name='productcategory']")
	private WebElement ProductCategory;
	@FindBy(xpath = "//input[@type='file']")
	private WebElement Choosefile;
	
	public WebElement getProductNameTb()
	{
		return ProductNameTb;
	}
	public WebElement getSaveBtn()
	{
		return SaveBtn;
	}
	public WebElement getProductCategory()
	{
		return ProductCategory;
	}
	public WebElement getChoosefile()
	{
		return Choosefile;
	}
}
