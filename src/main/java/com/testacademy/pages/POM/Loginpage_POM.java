package com.testacademy.pages.POM;

import com.testacademy.base.BasePage;
import com.testacademy.driver.DriverManagerTL;
import com.testacademy.utils.PropertyReader;
import org.openqa.selenium.By;

public class Loginpage_POM extends BasePage
{
  public Loginpage_POM()
  {
      super();
  }



     By username= By.id("login-username");

     By password= By.id("login-password");

     By sign_button =By.id("js-login-btn");

     By error_message = By.id("js-notification-box-msg");


     public Loginpage_POM loginToVwoPositive() throws Exception
     {
         enterInput(username,PropertyReader.readKey("username"));
         enterInput(password,PropertyReader.readKey("password"));
         clickElements(sign_button);

         //to pass control to dashboard page
         return this;
     }

     public String LoginToNegative() throws Exception
     {
         enterInput(username,"admin");
         enterInput(password,PropertyReader.readKey("password"));
         clickElements(sign_button);
         visibilityofElement(error_message);
         return getElement(error_message).getText();
     }

     public void openURL(String url)
     {
         DriverManagerTL.getDriver().get(url);
     }

     public Dashboardpage afterLogin()
     {
         return new Dashboardpage();
     }
}
