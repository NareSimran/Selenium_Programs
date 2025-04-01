package ex05_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Test_Selenium_Alerts {
    public static void main(String[] args) {

        EdgeDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

      /*  WebElement element = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        element.click();*/
/*

        WebElement elementConfirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        elementConfirm.click();
*/

        WebElement elementPrompt= driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        elementPrompt.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
     //alert.accept();
        alert.sendKeys("PRAMOD");
        alert.accept();
        String result = driver.findElement(By.id("result")).getText();
     // Assert.assertEquals(result,"You successfully clicked an alert");

     //   Assert.assertEquals(result,"You clicked: Ok");
//        Assert.assertEquals(result,"You clicked: Cancel");
        Assert.assertEquals(result,"You entered: PRAMOD");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
