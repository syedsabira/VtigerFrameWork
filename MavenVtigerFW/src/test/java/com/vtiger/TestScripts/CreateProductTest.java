package com.vtiger.TestScripts;
import java.awt.AWTException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectrepository.CreateProductPageElements;
import com.vtiger.objectrepository.HomePageElements;
import com.vtiger.objectrepository.ProductInfoPageElements;
import com.vtiger.objectrepository.ProductPageElements;
@Listeners(com.vtiger.genericLib.ListenerFunctionality.class)
public class CreateProductTest extends BaseClass {
	@Test
public void CreateProduct() throws EncryptedDocumentException, IOException, AWTException, InterruptedException
 {
	HomePageElements hp = PageFactory.initElements(driver, HomePageElements.class);
	ProductPageElements pp = PageFactory.initElements(driver, ProductPageElements.class);
	CreateProductPageElements cpp = PageFactory.initElements(driver, CreateProductPageElements.class);
	ProductInfoPageElements pip = PageFactory.initElements(driver, ProductInfoPageElements.class);
	hp.getProducts().click();
	pp.getCreateProduct().click();
	cpp.getProductNameTb().sendKeys(data.getDataFromExcel("ProductData", 2, 1));
	WebElement cp = cpp.getProductCategory();
	cpp.getProductCategory().click();
	wlib.selectItemFromList(cp, data.getDataFromExcel("ProductData", 4, 3));
	cpp.getSaveBtn().click();
	 String actProductMsg = pip.getSuccessMsg().getText();
	 Assert.assertTrue(actProductMsg.contains(data.getDataFromExcel("ProductData", 2, 2)));

	}  
}
