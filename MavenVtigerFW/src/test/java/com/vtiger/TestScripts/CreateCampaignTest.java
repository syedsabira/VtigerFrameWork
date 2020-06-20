package com.vtiger.TestScripts;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectrepository.CampaignInfoPageElements;
import com.vtiger.objectrepository.CampaignPageElements;
import com.vtiger.objectrepository.CreateCampaignPageElements;
import com.vtiger.objectrepository.HomePageElements;
public class CreateCampaignTest extends BaseClass{
	  @Test
	  public void CreateCampaign() throws EncryptedDocumentException, IOException {
	  HomePageElements hp = PageFactory.initElements(driver, HomePageElements.class);
	  CampaignPageElements cp = PageFactory.initElements(driver, CampaignPageElements.class);
	  CreateCampaignPageElements ccp = PageFactory.initElements(driver, CreateCampaignPageElements.class);
	  CampaignInfoPageElements cip = PageFactory.initElements(driver, CampaignInfoPageElements.class);
	  
	  WebElement more = hp.getMore();
	  wlib.keepMouseElement(more);
	  hp.getMoreDD().click();
	  cp.getCreateCampaign().click();
	  ccp.getCampaignNameTb().sendKeys(data.getDataFromExcel("CampaignData", 3, 1));
	  ccp.getProductSelectBtn().click();
	  wlib.switchToNewWindow();
	  ccp.getProduct().click();
	  wlib.switchToMainWindow();
	  ccp.getSaveBtn().click();
	  String actCampaignMsg = cip.getSuccessMsg().getText();
	  Assert.assertTrue(actCampaignMsg.contains(data.getDataFromExcel("CampaignData", 2, 3)));
	  }
}
