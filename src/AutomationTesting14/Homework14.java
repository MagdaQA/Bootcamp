package AutomationTesting14;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Homework14 extends BaseTest {

    @Test
    public void taskOne() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testuj.pl/");
        System.out.println(driver.getTitle());

       }
    @Test
    public void taskTwo() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");
        List<WebElement> numberOfLinks = driver.findElements(By.tagName("href"));
        List<WebElement> numberOfImages = driver.findElements(By.tagName("img"));
        System.out.println(numberOfLinks);
        System.out.println(numberOfImages);
        //lub:
        //System.out.println(driver.findElements(By.tagName("href")));
        //System.out.println(driver.findElements(By.tagName("img")));
        //
    }
}
