package MyTestField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HW_Scc {
    WebDriver driver;

    @BeforeMethod
    public void setUp () {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app/search");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void FindSccBy () {
       //a[ng-reflect-router-link='login']
        WebElement scc1 = driver.findElement(By.cssSelector("[ng-reflect-router-link='login']"));
        System.out.println("Первый: " + scc1.getText() + "\n");

        WebElement scc2 = driver.findElement(By.cssSelector("a[ng-reflect-router-link='search']"));
        System.out.println("Второй: " + scc2.getText() + "\n");

        WebElement scc3 = driver.findElement(By.cssSelector(".login-btn"));
        System.out.println("Третий: " + scc3.getText() + "\n");

        WebElement scc4 = driver.findElement(By.cssSelector("a.login-btn"));
        System.out.println("Четвертый: " + scc4.getText() + "\n");

        WebElement scc5 = driver.findElement(By.cssSelector("a[ng-reflect-router-link='registration']"));
        System.out.println("Пятый: " + scc5.getText() + "\n");

        WebElement scc6 = driver.findElement(By.cssSelector(".footer-container"));
        System.out.println("Шестой: " + scc6.getText() + "\n");

        WebElement scc7 = driver.findElement(By.cssSelector(".feedback-container"));
        System.out.println("Седьмой: " + scc7.getText() + "\n");

        WebElement scc8 = driver.findElement(By.cssSelector(".search-container"));
        System.out.println("Восьмой: " + scc8.getText() + "\n");

        WebElement scc9 = driver.findElement(By.cssSelector("h2.subtitle"));
        System.out.println("Девятый: " + scc9.getText() + "\n");

        WebElement scc10 = driver.findElement(By.cssSelector(".special-offers-container"));
        System.out.println("Десятый: " + scc10.getText() + "\n");

    }


    @AfterMethod(enabled = true)
    public void tearDown () {
        driver.quit();
    }



}
