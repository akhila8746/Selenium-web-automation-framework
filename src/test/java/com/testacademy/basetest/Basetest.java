package com.testacademy.basetest;

import com.testacademy.driver.DriverManagerTL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest
{
    //to start the webdriver and close the wedriver

    @BeforeMethod
    public void setup()
    {
        DriverManagerTL.init();
    }

    @AfterMethod
    public void tearDown()
    {
        DriverManagerTL.down();
        DriverManagerTL.unload();
    }
}
