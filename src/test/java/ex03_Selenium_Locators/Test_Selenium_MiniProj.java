package ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Test_Selenium_MiniProj {
    //Invalild email gives error msg on SignUp
    @Owner("Simran")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify error msg comes with invalid email on Signup")
    @Test
    public void vwo_free_trail_error_verify() throws InterruptedException {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");

        WebElement tag_partial_match=driver.findElement(By.partialLinkText("Start"));
        tag_partial_match.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email=driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement checkbox =driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        List<WebElement> buttonList=driver.findElements(By.tagName("button"));
        buttonList.get(0).click();

        Thread.sleep(3000);

        WebElement error_msg=driver.findElement(By.className("invalid-reason"));
        //Assert.assertTrue(error_msg.isDisplayed());
        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");



     driver.quit();

    }

}
