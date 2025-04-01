package ex03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Test_Selenium {

    public void test_vwologin(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");
        //LINK TEXT

        WebElement tag_full_match=driver.findElement(By.linkText("Start a free trial"));
        tag_full_match.click();

       /* //Partial match IS SAME AS CONTAINS
        WebElement tag_partial_match=driver.findElement(By.linkText("Start"));
        tag_full_match.click();*/

        try{
           Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
