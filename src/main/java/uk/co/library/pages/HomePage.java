package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {


    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;
    @CacheLookup
    @FindBy(id = "location")
    WebElement locationField;
    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Find Jobs']")
    WebElement findJobsBtn;

    public void enterJobTitle(String jobTitle) {
        Reporter.log("Enter the Job Title " + jobTitleField.toString());
        CustomListeners.test.log(Status.PASS, "Enter the Job Title " + jobTitleField);
        sendTextToElement(jobTitleField, jobTitle);
    }

    public void enterLocation(String location) {
        Reporter.log("Enter the Location " + locationField.toString());
        CustomListeners.test.log(Status.PASS, "Enter the Location " + locationField);
        sendTextToElement(locationField, location);
    }

    public void selectDistance(String distance) {

        Reporter.log("Select the distance " + distanceDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select the distance " + distanceDropDown);
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
    }

    public void clickOnMoreSearchOptionLink() {
        Reporter.log("Click on More search option link " + moreSearchOptionsLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on More search option link " + moreSearchOptionsLink);
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinSalary(String minSalary) {
        Reporter.log("Enter Minimum Salary " + salaryMin.toString());
        CustomListeners.test.log(Status.PASS, "Enter Minimum Salary " + salaryMin);
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Enter Maximum Salary " + salaryMax.toString());
        CustomListeners.test.log(Status.PASS, "Enter Maximum Salary " + salaryMax);
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryType(String sType) {
        Reporter.log("Select Salary Type" + salaryTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select Salary Type" + salaryTypeDropDown);
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
    }

    public void selectJobType(String jobType) {
        Reporter.log("Select Job Type " + jobTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select Job Type " + jobTypeDropDown);
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
    }

    public void clickOnFindJobButton() {
        Reporter.log("Click on Find Job button " + findJobsBtn.toString());
        CustomListeners.test.log(Status.PASS, "Click on Find Job button " + findJobsBtn);
        clickOnElement(findJobsBtn);
    }
}
