import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp () {
         driver = new ChromeDriver(); // Запускаем браузер Chrome
         driver.get("https://www.google.com");
//         driver.navigate().to("https://www.google.com");
//         driver.navigate().back(); // возврат назад на сайте
//         driver.navigate().forward(); // вперед по сайту
//         driver.navigate().refresh(); // обновить страницу
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Не явное ожидание локатора/селектора
         driver.manage().window().maximize();
    }


    @Test
    public void firstTest () {
        System.out.println("Google hi!!");
    }


    @AfterMethod (enabled = false) // enabled = true не обязательно. но если false то метод не выполнится
    public void tearDown () {
        driver.quit(); //закрываем браузер
        //driver.close(); //закрывает лишь Одну вкладку

    }


}
