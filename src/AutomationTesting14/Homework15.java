package AutomationTesting14;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Zadanie domowe
 * 1. wchodzimy na stronę http://sampleshop.inqa.pl/
 * 2. klikamy "Kontakt z nami" - nie korzystamy z By.linkText()
 *
 * Uzupełniamy formularz:
 * 1. Temat = webmaster
 * 2. podajemy e-mail
 * 3. wpisujemy treść
 *
 * Klikamy wyślij
 * Sprawdzamy czy wiadomość została wysłana
 */
public class Homework15 extends BaseTest {
    @Test
    public void sendWebMessage() {
        driver.get("http://sampleshop.inqa.pl/");

        WebElement contactWithShop = driver.findElement(By.cssSelector("#link-static-page-contact-2"));
        //WebElement contactWithShop2 = driver.findElement(By.id("link-static-page-contact-2"));
        //WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement selectSubject = driver.findElement(By.cssSelector("#content > section > form > section > div:nth-child(2) > div > select"));
        Select selectDFromDropdown = new Select(selectSubject);
        selectDFromDropdown.selectByValue("Webmaster");

        WebElement customerEmail = driver.findElement(By.cssSelector("#content > section > form > section > div:nth-child(3) > div > input"));
        customerEmail.sendKeys("test@mail");

        WebElement customerMessage = driver.findElement(By.cssSelector("#content > section > form > section > div:nth-child(5) > div > textarea"));
        customerMessage.sendKeys("Test message 1");

        WebElement sendMessage = driver.findElement(By.cssSelector("#content > section > form > footer > input.btn.btn-primary"));
        sendMessage.click();

        WebElement messageSent = driver.findElement(By.cssSelector("#content > section > form > div > ul > li"));

        Assert.assertEquals(messageSent.getText(), "pomyślnie wysłana");

    }
}