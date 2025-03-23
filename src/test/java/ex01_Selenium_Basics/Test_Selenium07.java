package ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test_Selenium07 {

    @Description("Open thE URL")
    @Test
    public void test_Selenium07() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https:google.com/");

        //Navigation commands
        driver.navigate().to("https:bing.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        //Static wait
        Thread.sleep(5000);


        driver.quit();

    }
}
