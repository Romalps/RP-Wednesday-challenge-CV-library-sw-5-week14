package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Permanent Tester jobs in Harrow']")
    WebElement resultText;

    public void verifyTheResults(String  expected){
        Assert.assertEquals(getTextFromElement(resultText),expected);
    }

}
