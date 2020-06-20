package com.vtiger.TestScripts;
import java.io.IOException;
import java.util.Random;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectrepository.CreateOrganizationPageElements;
import com.vtiger.objectrepository.HomePageElements;
import com.vtiger.objectrepository.OrganizationInfoPageElements;
import com.vtiger.objectrepository.OrganizationPageElements;

public class CreateOrganisationTest extends BaseClass {
  @Test
  public void CreateOrganisation() throws EncryptedDocumentException, IOException
  {
	 HomePageElements hp = PageFactory.initElements(driver, HomePageElements.class);
	 OrganizationPageElements op = PageFactory.initElements(driver, OrganizationPageElements.class);
	 CreateOrganizationPageElements cop = PageFactory.initElements(driver, CreateOrganizationPageElements.class);
	 OrganizationInfoPageElements oip = PageFactory.initElements(driver, OrganizationInfoPageElements.class);
	     
	 hp.getOrganizations().click();
    op.getcreateOrganization().click();
    Random r = new Random();
    int num =r.nextInt(999);
     String x =data.getDataFromExcel("OrganisationData", 2, 1);
     String data1 = x+num;
     cop.getOrganizationNameTb().sendKeys(data1);
     cop.getSaveBtn().click();
     String actOrganisationMsg = oip.getSuccessMsg().getText();
    Assert.assertTrue(actOrganisationMsg.contains(data.getDataFromExcel("OrganisationData", 2, 2)));
	  
}
}