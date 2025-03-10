import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePageTests extends FindElementTests{

    @Test
    public void isComponentPresentTest () {
        System.out.println("--------" + "\n");

        driver.get("https://telranedu.web.app/home");
        driver.findElement(By.xpath("//html/body/div/div/div/div/h1"));
        driver.findElement(By.cssSelector("div:nth-child(2)>div>div>h1"));
    }

}
