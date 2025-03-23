package ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test_Selenium06 {

    @Description("Open thE URL")
    @Test
    public void test_Selenium06(){
        WebDriver driver=new EdgeDriver();

        driver.get("https://katalon-demo-cura-herokuapp.com/");
        driver.manage().window().maximize();

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("HealthCare is visible");
        }
    }

}
