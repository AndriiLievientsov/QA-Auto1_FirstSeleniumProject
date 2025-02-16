package MyTestField;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HW1 {
    WebDriver driver;

    @BeforeMethod
    public void setUp () {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
    }


    @Test
    public void findElementsBy () {
        System.out.println("\n");

        System.out.println("Вывод по Классу:");
        WebElement a1 = driver.findElement(By.className("action"));
        WebElement a2 = driver.findElement(By.className("login-btn"));
        WebElement a3 = driver.findElement(By.className("title"));
        System.out.println("1 " + a1.getText());
        System.out.println("2 " + a2.getText());
        System.out.println("3 " + a3.getText());


    }

     @Test
     public void findcssSelecorBy () {
         System.out.println("\n");

         System.out.println("Вывод по CssSelector:");
         driver.findElement(By.cssSelector("[ng-reflect-name='city']"));
         driver.findElement(By.cssSelector("[type='submit']"));
         System.out.println("Успешный CSS Selector ");
     }

     @Test
     public void findIdBy () {
         driver.get("https://ilcarro.web.app/let-car-work");
         System.out.println("\n");

         System.out.println("Вывод по ID:");
         WebElement b1 = driver.findElement(By.id("fuel"));
         System.out.println(b1.getText());

     }

     @Test
     public void findXPathBy () {
        System.out.println("\n");

         System.out.println("Вывод по ЛинкТекст:");
         WebElement c1 = driver.findElement(By.xpath("//a[@ng-reflect-router-link='login']"));
         System.out.println(c1.getText());
         WebElement c2 = driver.findElement(By.xpath("//span[normalize-space(text())='Affordable prices']"));
         System.out.println(c2.getText());
     }


    @AfterMethod (enabled = true)
    public void tearDown () {
        driver.quit();
    }

}
