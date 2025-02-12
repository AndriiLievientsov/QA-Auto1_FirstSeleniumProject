package MyTestField;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW1 {
    WebDriver driver;

    @BeforeMethod
    public void setUp () {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
    }


    @Test
    public void findElementsBy () {

    }


    @Test
    public void findElementsByXpath () {

    }


    @AfterMethod (enabled = true)
    public void tearDown () {

    }

}
