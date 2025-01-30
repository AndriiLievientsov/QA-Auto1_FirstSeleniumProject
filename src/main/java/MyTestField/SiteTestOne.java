package MyTestField;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SiteTestOne {
    WebDriver driver;

    @BeforeMethod
    public void setUp () {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/books");
    }

    @Test
    public void firstTest () {
        System.out.println("Первое Тестовое ДЗ");
    }

    @AfterMethod (enabled = false)
    public void tearDown () {
        driver.quit();
    }

}
