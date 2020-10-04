package page;

import base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class EligibilityCheckerPage extends BasePage
{
    //Common Button Locators
    private static By start_Button = By.id("next-button");
    private static By next_Button = By.id("next-button");

    //Country Selection Locator
    private static By wales_Button = By.id("label-wales");

    //Birth Date Locators
    private static By dob_Day = By.id("dob-day");
    private static By dob_Month = By.id("dob-month");
    private static By dob_Year = By.id("dob-year");

    //Selection Option for Partner
    private static By yes_Radio_Button = By.id("label-yes");
    private static By no_Radio_Button = By.id("label-no");

    //Final Page Confirmation
    private static String expected_Page_Title = "You get help with health costs";

    //Click Start Button
    public static void click_Start_Button()
    {
        FindBy(start_Button).click();
    }

    //Click Next Button
    public static void click_Next_Button()
    {
        FindBy(next_Button).click();
    }

    //Country selection page
    public static void click_Wales_Radio_Button()
    {
        FindBy(wales_Button).click();
    }

    //Date of Birth Page
    public static void enter_DoB_Day(String day)
    {
        FindBy(dob_Day).sendKeys(day);
    }

    public static void enter_DoB_Month(String month)
    {
        FindBy(dob_Month).sendKeys(month);
    }

    public static void enter_DoB_Year(String year)
    {
        FindBy(dob_Year).sendKeys(year);
    }

    //Radio Button Selection
    public static void select_Option(String radioBtn)
    {
        WebDriverWait wait = new WebDriverWait(driver, 50); //Wait Function
        WebElement webWait = wait.until(ExpectedConditions.elementToBeClickable(next_Button));

        if (radioBtn.equalsIgnoreCase("Yes"))
        {
            FindBy(yes_Radio_Button).click();
        }
        else
         {
             FindBy(no_Radio_Button).click();
         }
    }
    //Eligibility Checker Final Page
    public static void verify_ResultPage()
    {
        Assert.assertEquals(driver.getTitle(), expected_Page_Title);
    }

}
