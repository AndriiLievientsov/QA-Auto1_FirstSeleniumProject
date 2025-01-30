import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumProject {
    WebDriver driver;

    @BeforeMethod
    public void setUp () {
         driver = new ChromeDriver();
         driver.get("https://www.google.com");
         driver.manage().window().maximize();
    }


    @Test
    public void firstTest () {
        System.out.println("Google hi!!");
    }


    @AfterMethod (enabled = false) // enabled = true не обязательно. но если false то метод не выполнится
    public void tearDown () {
        driver.quit();
    }


}
