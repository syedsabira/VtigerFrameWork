package com.vtiger.TestScripts;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectrepository.CreateLeadPageElements;
import com.vtiger.objectrepository.HomePageElements;
import com.vtiger.objectrepository.LeadInfoPageElements;
import com.vtiger.objectrepository.LeadPageElements;

public class CreateLeadTest extends BaseClass {  
	  @Test
	  public void CreateLead() throws EncryptedDocumentException, IOException
	{
	  HomePageElements hp = PageFactory.initElements(driver, HomePageElements.class);
	  LeadPageElements lp = PageFactory.initElements(driver, LeadPageElements.class);
	  CreateLeadPageElements clp = PageFactory.initElements(driver, CreateLeadPageElements.class);
	  LeadInfoPageElements lip = PageFactory.initElements(driver, LeadInfoPageElements.class);
	 
	  hp.getLeads().click();
	  lp.getCreateLead().click();
	  clp.getLastNameTb().sendKeys(data.getDataFromExcel("LeadData", 2, 1));
	  clp.getCompanyTb().sendKeys(data.getDataFromExcel("LeadData", 2, 2));
	  clp.getSaveBtn().click();
	 String actLeadMsg = lip.getSuccessMsg().getText();
	 Assert.assertTrue(actLeadMsg.contains(data.getDataFromExcel("LeadData", 2, 3)));
	}
}
