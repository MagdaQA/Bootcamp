package AutomationTesting14;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ScreenshotUtil;

import java.util.List;

public class RadioButtonTests extends BaseTest {
    @Test
    public void thereAreThreeRadioButtonInForm() {
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");

        ScreenshotUtil.takeScreenshot(driver, "radio.jpg");

        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));

        // sprawdzenie czy pierwszy radio jest zaznaczony na starcie
        // System.out.println(radioButtons.get(0).isSelected());

        Assert.assertEquals(radioButtons.size(), 3);
    }

    @Test(dependsOnMethods = {"thereAreThreeRadioButtonInForm"})
    public void selectFemaleAndAssertOthersAreNotSelected() {
        WebElement femaleRadioButton = driver.findElement(By.cssSelector("input[type='radio'][value='female']"));
        femaleRadioButton.click();
        List<WebElement> selectedRadioButtons = driver.findElements(By.cssSelector("input[type='radio']:checked"));

        Assert.assertEquals(selectedRadioButtons.size(),1);
    }
    @Test
    public void checkboxState() {
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");

        WebElement checkboxBike = driver.findElement(By.cssSelector("#post-909 > div > div.et-l.et-l--post > div > div.et_pb_section.et_pb_section_2.et_section_regular > div > div.et_pb_column.et_pb_column_1_3.et_pb_column_4.et_pb_css_mix_blend_mode_passthrough > div.et_pb_module.et_pb_blurb.et_pb_blurb_7.et_pb_text_align_left.et_pb_blurb_position_top.et_pb_bg_layout_light > div > div > div > form > input[type=checkbox]:nth-child(1)"));

        // jeśli na starcie checkbox jest wybrany
        if (checkboxBike.isSelected() == true)
        {
            //kliknij, aby był pusty
            checkboxBike.click();

            Assert.assertFalse(checkboxBike.isSelected());
        }
        else
            checkboxBike.click();
        //optional save button
            Assert.assertTrue(checkboxBike.isSelected());
    }
}
