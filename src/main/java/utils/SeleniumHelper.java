package utils;


import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.SeleniumDriver.explicitTime;


public class SeleniumHelper {
	


    public static String generateEmail(String domain, int length) {
        return RandomStringUtils.random(length, "abcdefghijklmnopqrstuvwxyz") + "@" + domain;
    }

    // Click Event
    public static void clickElement(WebElement element) throws Exception {

        waitForPageToLoad();
        Boolean elementStatus = null;
        try {
            wait_element_visible(element);
            elementStatus = isElementClickable(element, explicitTime);
        } catch (Exception a) {
            elementStatus = false;
        }

        if (elementStatus == true) {

            element.click();

            Assert.assertTrue(true);
        }

    }

    public static boolean isElementClickable(WebElement element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(), timeout);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void wait_element_visible(WebElement waitedElement) {
        try {

            WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(), explicitTime);
            wait.until(ExpectedConditions.visibilityOf(waitedElement));

        } catch (Exception e) {

            e.printStackTrace();
        }
    }


    public static void setElement(WebElement element , String setValue)
            throws Exception {

        waitForPageToLoad();
        wait_element_visible(element);
        if (isElementClickable(element, explicitTime)) {
            element.click();
            if (element.getText()=="") {
                element.sendKeys(setValue);
            } else {
                element.clear();
                element.sendKeys(setValue);
            }

        }
    }

    public static void waitForPageToLoad()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    public static void selectElement(WebElement element, String setValue)
    {
        waitForPageToLoad();
        wait_element_visible(element);
        new Select(element).selectByVisibleText(setValue);
    }
}

