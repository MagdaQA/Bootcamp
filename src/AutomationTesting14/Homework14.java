package AutomationTesting14;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Homework14 extends BaseTest {

    @Test
    public void taskOneWebTitle() {

        driver.get("https://testuj.pl/");
        System.out.println(driver.getTitle());

       }
    @Test
    public void taskTwoTagsNumber() {

        driver.get("https://www.bbc.com/");
        List<WebElement> numberOfLinks = driver.findElements(By.tagName("a"));
        List<WebElement> numberOfImages = driver.findElements(By.tagName("img"));
        System.out.println(numberOfLinks.size());
        System.out.println(numberOfImages.size());

    }

    @Test
    public void taskThreeLogin() {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement usernameInput = driver.findElement(By.id("txtUsername"));
        usernameInput.sendKeys("Admin");

        WebElement passwordInput = driver.findElement(By.id("txtPassword"));
        passwordInput.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement userLoggedIn = driver.findElement(By.className("panelTrigger"));
        String textAfterLogin = userLoggedIn.getText();

        Assert.assertTrue(textAfterLogin.contains("Welcome"));

    }
    @Test
    public void taskFourInvalidCredentials() {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement usernameInput = driver.findElement(By.id("txtUsername"));
        usernameInput.sendKeys("WrongUsername");

        WebElement passwordInput = driver.findElement(By.id("txtPassword"));
        passwordInput.sendKeys("WrongPassword");

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement userNotLoggedIn = driver.findElement(By.id("spanMessage"));
        String textAfterInvalidLogin = userNotLoggedIn.getText();

        Assert.assertTrue(textAfterInvalidLogin.contains("Invalid"));

    }
    @Test
    public void taskFiveCalculatePrice() {
        driver.get("https://demo.guru99.com/payment-gateway/index.php");

        //znalezienie miejsca, gdzie jest grupa dropdownów
        //nie znajduje:
        //WebElement selectList = driver.findElement(By.className("1u 12u$(small) select-wrapper"));
        //WebElement selectList2 = driver.findElement(By.name("quantity"));
        //znajduje:
        //WebElement selectList3 = driver.findElement(By.cssSelector("#three > div > form > div > div.\\31 u.\\31 2u\\$\\(small\\).select-wrapper > select"));
        WebElement selectList4 = driver.findElement(By.xpath("//*[@id=\"three\"]/div/form/div/div[4]/select"));

        //stworzenie obiektu, który wybiera listę
        Select selectDFromDropdown = new Select(selectList4);

        //wybór konkretnej opcji z listy
        selectDFromDropdown.selectByValue("5");

         /*
       szukanie przycisku Buy Now i klik
        WebElement selectBuyNow = driver.findElement(By.tagName("input"));
       */
        WebElement selectBuyNow2 = driver.findElement(By.cssSelector("#three > div > form > div > div.\\33 u.\\31 2u\\$\\(small\\) > ul > li > input"));
        selectBuyNow2.click();

        //Sprawdzić czy jest na stonie, która ładuje się po kliknięciu
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/payment-gateway/process_purchasetoy.php");

        //szukanie elementu, który zawiera zsumowaną kwotę
        WebElement basketValue = driver.findElement(By.cssSelector("#three > div > form > div.row > div > font:nth-child(2)"));

        Assert.assertEquals(basketValue.getText(), "$100.00");

    }
    @Test
    public void taskSixDragAndDrop() {

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        WebElement dragPoint = driver.findElement(By.id("fourth"));
        WebElement dropPoint = driver.findElement(By.id("amt7"));

        Actions move = new Actions(driver);
        move.dragAndDrop(dragPoint, dropPoint).build().perform();

        // WebElement elementDropped = driver.findElement(By.cssSelector("#amt7")); // wystarczy "#amt7" bez >li
        WebElement elementDropped = driver.findElement(By.id("t7"));

        String textWhereDropped = elementDropped.getText();

        Assert.assertEquals(textWhereDropped, "5000");

    }

}


