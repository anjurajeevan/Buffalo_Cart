package com.buffalocart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
WebDriver driver;
    
    @FindBy(name="email")
    WebElement name;
    
    @FindBy(name="password")
    WebElement password;
    
    @FindBy(xpath=("//button[@class='w-100 btn btn-lg btn-primary']"))
    WebElement login;
    
    @FindBy(name="btnReset")
    WebElement reset;
    
    @FindBy(xpath=("//div[@class='alert alert-danger']"))
    WebElement alert;
    
    @FindBy(xpath=("//span[@id='email-error']"))
    WebElement email_error;
    
    @FindBy(xpath=("//span[@id='password-error']"))
    WebElement password_error;
  
    
    public Login(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
   //Set user name in textbox
    public void setUserName(String strUserName){
     name.sendKeys(strUserName);     
    }
    
    //Set password in textbox
    public void setUserPassword(String strUserPassword){
     password.sendKeys(strUserPassword);     
    }
    
    public void clickLogin() {
    	login.click();
    }
    
    public String getAlertMsg() {
    	return alert.getText();
    }
    
    public String getEmailAlertMsg() {
    	return email_error.getText();
    }
    
    public String getPasswordAlertMsg() {
    	return password_error.getText();
    }
    
    public void clickReset() {
    	reset.click();
    }
    

}
