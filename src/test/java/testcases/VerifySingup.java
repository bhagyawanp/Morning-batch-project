package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjectModel.SignUpPagePOM;
import Resources.BaseClass;
import Resources.constants;

public class VerifySingup extends BaseClass {

	
	
	@Test
	public void signup() throws InterruptedException {
		SignUpPagePOM obj=new SignUpPagePOM(driver);
		obj.clicksignup().click();
	
		Thread.sleep(7000);
		obj.EnterfirstName().sendKeys(constants.firstname);  //hardcoded
		obj.EnterlastName().sendKeys(constants.lastname);
		obj.Enteremail().sendKeys(constants.email);
		Thread.sleep(3000);
				
	}
}
