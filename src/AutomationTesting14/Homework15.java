package AutomationTesting14;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


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
        contactWithShop.click();
        //WebElement contactWithShop2 = driver.findElement(By.id("link-static-page-contact-2"));
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement selectSubject = driver.findElement(By.cssSelector("#content > section > form > section > div:nth-child(2) > div > select"));
        Select selectDFromDropdown = new Select(selectSubject);
        selectDFromDropdown.selectByValue("2"); //wybieramy numer dropdowna

        WebElement customerEmail = driver.findElement(By.cssSelector("#content > section > form > section > div:nth-child(3) > div > input"));
        customerEmail.sendKeys("test@mail");

        WebElement customerMessage = driver.findElement(By.cssSelector("#content > section > form > section > div:nth-child(5) > div > textarea"));
        customerMessage.sendKeys("Test message 1");

        WebElement sendMessage = driver.findElement(By.cssSelector("#content > section > form > footer > input.btn.btn-primary"));
        sendMessage.click();

        WebElement messageSent = driver.findElement(By.cssSelector("#content > section > form > div > ul > li"));

        //w asercji musimy podać cały tekst znajdujący się w elemencie, a nie fragment
        Assert.assertEquals(messageSent.getText(), "Twoja wiadomość została pomyślnie wysłana do obsługi.");

    }
    @Test

    public void taskSevenCount() {

        driver.get("https://www.google.com/");
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#L2AGLb")));
        WebElement userConsent =driver.findElement(By.cssSelector("#L2AGLb"));
        userConsent.click();

        //WebElement searchField =driver.findElement(By.cssSelector("#input"));
        //WebElement searchField =driver.findElement(By.id("inputWrapper"));
        // WebElement searchField =driver.findElement(By.cssSelector("#inputWrapper"));
        //WebElement searchField =driver.findElement(By.xpath("//*[@id='input']"));
        //WebElement searchField =driver.findElement(By.xpath("//*[@id=\"input\"]"));

        WebElement searchField = driver.findElement(By.xpath("//html/body/ntp-app//div/ntp-realbox//div/input"));
        searchField.click();
        searchField.sendKeys("java");
        searchField.sendKeys(Keys.ENTER);

        driver.findElement(By.id("Value")).sendKeys(Keys.ENTER);

        //jak stąd wyłuszczyć te tagi, które w treci linków mają "java"? getText świeci na czerwono
        //List<WebElement> numOfJavaSearchResults = driver.findElements(By.tagName("a")).contains(java);
        List<WebElement> numOfJavaSearchResults = driver.findElements(By.tagName("a")).getText("java");

        System.out.println(numOfJavaSearchResults.size());

    }
    @Test
    public void taskEightJobSearch(){

        driver.get("https://www.pracuj.pl/");
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#gp-cookie-agreements > div > div > div.g1kqzctt > div.bafq4sb > button")));
        WebElement acceptCookies = driver.findElement(By.cssSelector("#gp-cookie-agreements > div > div > div.g1kqzctt > div.bafq4sb > button"));
        acceptCookies.click();

        WebElement searchedCriteria =driver.findElement(By.cssSelector("#kw-1635158591889"));
        searchedCriteria.click();
        searchedCriteria.sendKeys("tester");

        WebElement searchedCity =driver.findElement(By.cssSelector("#wp-1635158591889"));
        searchedCity.click();
        searchedCity.sendKeys("Warszawa");

        WebElement searchButton = driver.findElement(By.cssSelector("#fragment-search-markup > form > div.search--1jRKo > div.search--371g6 > button"));
        searchButton.click();

        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#triggers > div.popover.popover__popup > div > div > button")));
        WebElement remoteWork = driver.findElement(By.cssSelector("#triggers > div.popover.popover__popup > div > div > button"));
        remoteWork.click();

        //świeci całość na czerwono
       // List<WebElement> jobList = driver.findElement(By.cssSelector("#results > ul"));
        //List<WebElement> jobList = driver.findElement(By.tagName("#results > ul"));

        List<WebElement> jobList = driver.findElement(By.xpath("B/html/body/div[1]/div[2]/div[10]/ul"));

    }

}
