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

    @Test
    public void testFindElementsByLocation () {
        //By.id
        driver.findElement(By.id("dates"));
        driver.findElement(By.cssSelector("#dates"));

        //By.cssSelector
        //ng-reflect-name="city" ==> [ng-reflect-name='city']
        driver.findElement(By.cssSelector("[ng-reflect-name='city']"));

        //By.className
        //class="telephone" ==> .telephone
        driver.findElement(By.className("telephone"));
        WebElement telephone = driver.findElement(By.cssSelector(".telephone"));
        System.out.println(telephone.getText());

        //By.linkText
        //a[ng-reflect-router-link='let-car-work']
        WebElement letCarWork = driver.findElement(By.linkText("Let the car work"));
        System.out.println(letCarWork.getText());

        WebElement search = driver.findElement(By.linkText("Search"));
        System.out.println(search.getText());

        //By.partialLinkText
        WebElement partialLinkText = driver.findElement(By.partialLinkText("work"));
        System.out.println("Найдено по кусочку: "+ partialLinkText.getText());


        //By.id
        //#city
        driver.findElement(By.cssSelector("input[id='city'"));
        driver.findElement(By.cssSelector("input[id^='ci'"));
        driver.findElement(By.cssSelector("input[id$='ty'"));
        WebElement city = driver.findElement(By.id("city"));

        System.out.println(city.getAttribute("type"));
        System.out.println(city.getAttribute("id"));
        System.out.println(city.getAttribute("ng-reflect-label"));


        System.out.println("\nПока что все ХОРОШО!");
    }

    @Test
    public void siblingTest () {
        driver.findElement(By.xpath("//a[text()=' Let the car work ']/preceding::*"));
        driver.findElement(By.xpath("//a[text()=' Let the car work ']/preceding::link[2]"));
        driver.findElement(By.xpath("//a[text()=' Let the car work ']/following::*"));
        driver.findElement(By.xpath("//a[text()=' Let the car work ']/preceding-sibling::*[1]"));
        System.out.println("Тест вроде успешно завершен");
    }

    @Test
    public void siblingTest2 () {
        System.out.println("------------" + "\n" +
                "Старт Теста" + "\n"); // в ide был ворнинг из за не совместимости версий. пофиксить не смог. по этому разрграничил

        driver.get("https://ilcarro.web.app/search");
        driver.findElement(By.xpath("//*[@class='action' and text()='Affordable prices']"));
        driver.findElement(By.xpath("//span[@class='action' and text()='Affordable prices']")); //строе соответствие
        driver.findElement(By.xpath("//span[contains (@class,'action') and contains (text(),'Affordable prices'])")); // содержит что то из элемента

        System.out.println("Тест вроде успешно завершен");
    }




    @AfterMethod (enabled = true)
    public void tearDown () {
        driver.quit();
    }

}