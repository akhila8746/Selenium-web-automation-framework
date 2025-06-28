package com.testacademy.vwo.logintest;

import com.testacademy.basetest.Basetest;
import com.testacademy.pages.POM.Dashboardpage;
import com.testacademy.pages.POM.Loginpage_POM;
import com.testacademy.utils.PropertyReader;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class LoginTests extends Basetest
{


    @Test(priority =1)
    public void testLoginNegative() throws Exception {
        Loginpage_POM loginpagePom= new Loginpage_POM();
        loginpagePom.openURL(PropertyReader.readKey("url"));
        String error_message=loginpagePom.LoginToNegative();
        Assertions.assertThat(error_message)
                .isNotNull()
                .isNotBlank()
                .contains(PropertyReader.readKey("error_message"));

    }

    @Test(priority = 2)
    public void testLoginPositive() throws Exception {
        Loginpage_POM loginpagePom= new Loginpage_POM();
        loginpagePom.openURL(PropertyReader.readKey("url"));
        loginpagePom.loginToVwoPositive();
        Dashboardpage dashboardpage = loginpagePom.afterLogin();
        String expected_username = dashboardpage.loggedInUsername();
        Assertions.assertThat(expected_username)
                .isNotNull()
                .isNotBlank()
                .contains(PropertyReader.readKey("expected_username"));

    }


}
