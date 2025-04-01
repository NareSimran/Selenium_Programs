package ex05_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium_Input_Checkbox_Radio {
    public static void main(String[] args) {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.findElement(By.name("firstname")).sendKeys("the testing academy");

        driver.findElement(By.id("sex-1")).click();



        // CheckBox
        driver.findElement(By.id("tool-1")).click();

    }

}
