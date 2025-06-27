package com.pojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage
{
    WebDriver driver;

    public LoginPage() {

        driver=new ChromeDriver();
    }

    private By username= By.id("login-username");

    private By password= By.id("login-password");

    private By sign_button =By.id("js-login-btn");


    public void loginToVwo(String email, String pwd)
    {
        driver.findElement(username).sendKeys(email);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(sign_button).click();
    }

}
