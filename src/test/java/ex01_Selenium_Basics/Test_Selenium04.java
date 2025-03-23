package ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test_Selenium04 {
    @Description("Verify the page source,title")
    @Test
  public void test_Selenium04(){

      WebDriver driver=new EdgeDriver();
      driver.get("https://app.vwo.com");
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());
      System.out.println(driver.getPageSource());

      //To maximize
      driver.manage().window().maximize();

      //to minimize
        driver.manage().window().minimize();

      driver.quit();
  }


}
