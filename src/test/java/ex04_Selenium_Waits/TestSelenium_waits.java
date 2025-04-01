package ex04_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium_waits {
    @Description("")
    @Test
    public void test_verify_print_imac_price(){

        EdgeDriver driver =new EdgeDriver();
        driver.get("https://app.vwo.com");
        try{
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
