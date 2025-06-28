package com.testacademy.pages.POM;

import com.testacademy.base.BasePage;
import org.openqa.selenium.By;

public class Dashboardpage extends BasePage {
    public Dashboardpage() {

    }

    By userNameonDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");

    public String loggedInUsername() {
        presenceofElement(userNameonDashboard);
        return getElement(userNameonDashboard).getText();
    }
}


