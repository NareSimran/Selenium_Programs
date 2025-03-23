package ex01_Selenium_Basics;


import io.qameta.allure.Description;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test_Selenium02 {
    @Test
    @Description("Verify the title for app.vwo.com")
    public void test02(){
        //Open the URL
        EdgeDriver driver=new EdgeDriver();
        //Navigate to URL
        driver.get("https://app.vwo.com");
        //Assert the Title
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");


        driver.quit();
    }


}

