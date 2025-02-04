import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp () {
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app/search");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }


    @Test
    public void findElementsByTagName () {
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1);
        System.out.println("Текст элемента: " + h1.getText()); //получение теста элемента на сайте

        System.out.println("----------------------");

        WebElement a = driver.findElement(By.tagName("a"));
        System.out.println(a);
        System.out.println("Size: " + a.getSize()); //получение размера элемента на сайте

        System.out.println("----------------------");

        List<WebElement> elements_a = driver.findElements(By.tagName("a"));
        System.out.println("Размер массива: " + elements_a.size());
        System.out.println("Текст элемента №3: " + elements_a.get(2).getText());

        System.out.println("----------------------");

        System.out.println("Массив тут начинается: ");
        for (WebElement element : elements_a) {
            System.out.println(element.getAttribute("href"));
            System.out.println(element.getText());
        }


    }


    @AfterMethod (enabled = true)
    public void tearDown () {
        driver.quit();
    }

}
