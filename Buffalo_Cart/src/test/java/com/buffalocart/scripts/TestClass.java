package com.buffalocart.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.buffalocart.constants.AutomationConstants;
import com.buffalocart.pages.Home;
import com.buffalocart.pages.Login;
import com.buffalocart.utilities.ExcelUtilities;

public class TestClass extends TestBase {
	 Login objLogin;
	    Home objHome;
	    
	    @Test(priority =0)
	    public void verifyTitle() {
	    Assert.assertEquals(driver.getTitle(), AutomationConstants.EXPECTEDTITLE);
	    }
	    @Test(priority =1)
	    public void verifyUrl() {
	    Assert.assertEquals(driver.getCurrentUrl(), AutomationConstants.EXPECTEDURL);
	    }
	    
	    @Test(priority=2)
 	    public void verifySignInRequirements() throws IOException {
 	    	objLogin = new Login(driver);
 	    	objLogin.clickLogin();
 	    	Assert.assertEquals(objLogin.getEmailAlertMsg(), AutomationConstants.EXPECTEDEMAILALERT2);
 	    	Assert.assertEquals(objLogin.getPasswordAlertMsg(), AutomationConstants.EXPECTEDPASSWORDALERT);
 	    	
	    }
	    
	    @Test(priority=3)
 	    public void verifyUserNameFormat() throws IOException {
 	    	objLogin = new Login(driver);
 	    	String username=ExcelUtilities.getStringCellData(3,0);
 	    	objLogin.setUserName(username);
 	    	objLogin.clickLogin();
 	    	Assert.assertEquals(objLogin.getEmailAlertMsg(), AutomationConstants.EXPECTEDEMAILALERT);
 	    	
	    }
	     @Test(priority=4)
	 	    public void verifyUserName() throws IOException {
	 	    	objLogin = new Login(driver);
	 	    	String username=ExcelUtilities.getStringCellData(2, 0);
	 	    	
	 	    	String password=String.valueOf(ExcelUtilities.getNumericCellData(1, 1));
	 	    	objLogin.setUserName(username);
	 	    	objLogin.setUserPassword(password);
	 	    	objLogin.clickLogin();
	 	    	Assert.assertEquals(objLogin.getAlertMsg(), AutomationConstants.EXPECTEDALERTMSG);
	 	    	
	    }
	     @Test(priority=5)
	 	    public void verifyPassword() throws IOException {
	 	    	objLogin = new Login(driver);
	 	    	String username=ExcelUtilities.getStringCellData(1, 0);
	 	    	
	 	    	String password=String.valueOf(ExcelUtilities.getNumericCellData(2, 1));
	 	    	objLogin.setUserName(username);
			System.out.println("username");    
	 	    	objLogin.setUserPassword(password);
	 	    	System.out.println("password");
	 	    	objLogin.clickLogin();
	 	    	Assert.assertEquals(objLogin.getAlertMsg(), AutomationConstants.EXPECTEDALERTMSG);
	 	    	
	    }
	     @Test(priority=6)
		    public void verifyLogin() throws IOException {
		    	objLogin = new Login(driver);
		    	String username=ExcelUtilities.getStringCellData(1, 0);
		    	
		    	String password=String.valueOf(ExcelUtilities.getNumericCellData(1, 1));
		    	objLogin.setUserName(username);
		    	objLogin.setUserPassword(password);
		    	objLogin.clickLogin();
		    }
	   @Test(priority = 7)
	    public void verifyHome() {
	    	objHome= new Home(driver);
	    	Assert.assertEquals(objHome.getDashBoardMessage(), AutomationConstants.EXPECTEDDASHBOARDMSG);
	    }
	    
}
