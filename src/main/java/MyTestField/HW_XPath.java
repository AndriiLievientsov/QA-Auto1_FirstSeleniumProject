package MyTestField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HW_XPath {

    WebDriver driver;

    @BeforeMethod
    public void setUp () {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app/search");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void FindXPathBy () {
        WebElement element1 = driver.findElement(By.xpath("//a[@ng-reflect-router-link='login']"));
        WebElement element2 = driver.findElement(By.xpath("//span[normalize-space(text())='Affordable prices']"));
        WebElement element3 = driver.findElement(By.xpath("//span[normalize-space(text())='Sara Miles']"));
        WebElement element4 = driver.findElement(By.xpath("//a[normalize-space(text())='866-720-5721']"));
        WebElement element5 = driver.findElement(By.xpath("//a[normalize-space(text())='Join now!']"));
        WebElement element6 = driver.findElement(By.xpath("//h1[normalize-space(text())='Find your car now!']"));
        WebElement element7 = driver.findElement(By.xpath("//a[@ng-reflect-router-link='registration']"));
        WebElement element8 = driver.findElement(By.xpath("//a[@ng-reflect-router-link='terms-of-use']"));
        WebElement element9 = driver.findElement(By.xpath("//h2[normalize-space(text())='Type your data and hit Yalla!']"));
        WebElement element10 = driver.findElement(By.xpath("//span[normalize-space(text())='Latest feedback from our customers']"));

        System.out.println(element1.getText());
        System.out.println(element2.getText());
        System.out.println(element3.getText());
        System.out.println(element4.getText());
        System.out.println(element5.getText());
        System.out.println(element6.getText());
        System.out.println(element7.getText());
        System.out.println(element8.getText());
        System.out.println(element9.getText());
        System.out.println(element10.getText());


    }

    @AfterMethod (enabled = true)
    public void tearDown () {
        driver.quit();
    }
}
