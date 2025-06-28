package com.testacademy.base;

import com.testacademy.driver.DriverManager;
import com.testacademy.driver.DriverManagerTL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.Duration.*;

public class BasePage
{
    public BasePage()
    {

    }

    //waits
    public void implicitWait()
    {
        DriverManager.getDriver().manage().timeouts().implicitlyWait(ofSeconds(10));
    }
    //driver call
    //common functions
    public void clickElements(By by)
    {
        DriverManagerTL.getDriver().findElement(by).click();
    }

    public WebElement presenceofElement(By elementlocation)
    {
        return new WebDriverWait(DriverManagerTL.getDriver(), ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(elementlocation));
    }

    public WebElement visibilityofElement(final By elementlocation)
    {
        return new WebDriverWait(DriverManagerTL.getDriver(), ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementlocation));
    }

    protected void enterInput(By by,String key)
    {
        DriverManagerTL.getDriver().findElement(by).sendKeys(key);
    }

    protected WebElement getElement(By key)
    {
        return DriverManagerTL.getDriver().findElement(key);
    }
}
