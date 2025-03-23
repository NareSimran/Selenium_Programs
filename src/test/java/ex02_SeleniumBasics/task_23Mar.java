package ex02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class task_23Mar {

    @Test
    @Description("Verify Katalon URl")
    public void test_VerifyKatalon() throws InterruptedException {

        // Write the code which will execute the perform the ui interactions
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement buttonMakeAppointment=driver.findElement(By.id("btn-make-appointment"));
        buttonMakeAppointment.click();

        WebElement usernameInputBox=driver.findElement(By.id("txt-username"));
        usernameInputBox.sendKeys("John Doe");

        WebElement pwdInputBox=driver.findElement(By.id("txt-password"));
        pwdInputBox.sendKeys("ThisIsNotAPassword");

        WebElement buttonLogin=driver.findElement(By.id("btn-login"));
        buttonLogin.click();
        Thread.sleep(3000);

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        //AssertJ validation

        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://katalon-demo-cura.herokuapp.com/#appointment");
        driver.quit();

    }
}

