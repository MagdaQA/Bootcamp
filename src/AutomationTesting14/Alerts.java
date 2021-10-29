package AutomationTesting14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Alerts  extends BaseTest {
    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test
    public void jsPromptTest() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS prompt");

        alert.sendKeys("testuj.pl");
        alert.accept();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: testuj.pl");
    }

    @Test
    public void jsAlertTest() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Alert");
        alert.accept();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You successfully clicked an alert");
    }

    @Test
    public void jsConfirmOkTest() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Confirm");
        //alert.accept();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You clicked: Ok");
    }
    // PRACA DOMOWA
    @Test

    public void jsConfirmCancelTest() {

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Confirm");
        alert.dismiss();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You clicked: Cancel");

    }

    @Test

    public void jsPromptCancelTest() {

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS prompt");
        alert.dismiss();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: null");

    }
}
