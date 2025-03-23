package ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import static org.assertj.core.api.Assertions.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium05 {

    @Test
    @Description("Open the URL")
    public void test_Selenium05() {

        // Write the code which will execute the perform the ui interactions
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com");
        //AssertJ validation

        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");
        driver.quit();
    }
}
