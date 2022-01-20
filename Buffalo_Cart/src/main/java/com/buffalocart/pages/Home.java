package com.buffalocart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
WebDriver driver;
    
    @FindBy(xpath="//div[@class='clearfix mb15 dashbaord-header-area']")
    WebElement homePageDashbaord;  
    
    public Home(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
    public String getDashBoardMessage() {
    	return homePageDashbaord.getText();
    }
   
}
