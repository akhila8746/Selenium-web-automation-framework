package com.testacademy.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Objects;

public class DriverManagerTL
{
    //TL-THREAD LOCAL

    public static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static void setdriver(WebDriver drref)
    {
      dr.set(drref);
    }

    public static WebDriver getDriver()
    {
        return dr.get();

    }

    //close the thread local
    public static void unload()
    {
        dr.remove(); //kill the driver
    }

    public static void init()
    {
        if(Objects.isNull(DriverManagerTL.getDriver()))
        {
            WebDriver driver =new ChromeDriver();
            setdriver(driver);


        }
    }

    //close the session
    public static void down()
    {
      if(Objects.nonNull(DriverManagerTL.getDriver()))
      {
          getDriver().quit();

      }
    }

    //start the session

}
