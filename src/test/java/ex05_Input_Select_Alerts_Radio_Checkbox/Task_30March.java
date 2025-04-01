package ex05_Input_Select_Alerts_Radio_Checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task_30March {
    @Test
    @Description("Verify Katalon full flow")
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

        WebElement element_select = driver.findElement(By.id("combo_facility"));
        Select select = new Select(element_select);
        select.selectByValue("Seoul CURA Healthcare Center");

       driver.findElement(By.id("chk_hospotal_readmission")).click();

      driver.findElement(By.id("radio_program_none")).click();
        WebElement visitDate=driver.findElement(By.cssSelector("input[placeholder='dd/mm/yyyy']"));
        visitDate.sendKeys("01/04/2025");

       /* WebElement cal=driver.findElement(By.id("txt_visit_date"));
        cal.click();

        WebElement date=driver.findElement(By.xpath("//table[@class='table-condensed']/tbody/tr[2]/td[7]"));
        date.click();*/

        WebElement comment_Box=driver.findElement(By.id("txt_comment"));
        comment_Box.sendKeys("ABC");

    driver.findElement(By.id("btn-book-appointment")).click();


        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/appointment.php#summary");
        //AssertJ validation

        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://katalon-demo-cura.herokuapp.com/appointment.php#summary");


        WebElement commentTxt=driver.findElement(By.xpath("//div[@class='col-xs-8' ]/p [@id='comment']"));
        String Text=commentTxt.getText();
        System.out.println(Text);
        if(Text.contains("ABC")){
            System.out.println("Validated comments for appointment");
        }

      driver.findElement(By.id("menu-toggle")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();






        driver.quit();




    }
}
