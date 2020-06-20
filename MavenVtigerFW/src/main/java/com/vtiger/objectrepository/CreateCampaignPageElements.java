package com.vtiger.objectrepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CreateCampaignPageElements {
	@FindBy(name = "campaignname")
	private WebElement CampaignNameTb;
    @FindBy(xpath = "//input[@value='  Save  ']")
	private WebElement SaveBtn;
    @FindBy(xpath = "(//img[@align='absmiddle'])[3]")
    private WebElement ProductSelectBtn;
    @FindBy(linkText = "Tablets")
    private WebElement Product;
    
    public WebElement getCampaignNameTb()
    {
    	return CampaignNameTb;
    }
    public WebElement getSaveBtn()
    {
    	return SaveBtn;
    }
    public WebElement getProductSelectBtn()
    {
    	return ProductSelectBtn;
    }
    public WebElement getProduct()
    {
    	return Product;
    }
}
