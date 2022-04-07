package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObject.RegistrationPage;
import java.util.ArrayList;
import static stepDefinitions.Hooks.driver;


public class RegistrationSteps {

    RegistrationPage registrationPage;
    // public static WebDriver driver= Hooks.driver;

    public RegistrationSteps() {

        registrationPage = new RegistrationPage(driver);
    }

    @Given("^the user navigates to the website$")
    public void theUserNavigatesToTheWebsite() throws InterruptedException {

//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
        // registrationPage = new registrationPage(driver);
        // driver.get("https://www.toolsqa.com/");
        //driver.manage().window().maximize();
        //driver.findElement(By.xpath("//*[@id=\"accept-cookie-policy\"]")).click();
        //Thread.sleep(10000);
        registrationPage.clickCookieButton();
    }

    @And("the user clicks on the demo site button")
    public void theUserClicksOnTheDemoSiteButton() {
        // driver.findElement(By.xpath("//*[contains(text(), 'Demo Site')]")).click();
        registrationPage.ClickdemoSiteButton();
    }

    @And("the user clicks on the form")
    public void theUserClicksOnTheForm() {
        //switching focus of Webdriver to new tab
        String oldTab = driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        WebElement formButton = driver.findElement(By.xpath("//*[contains(text(),'Forms')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", formButton);
        registrationPage.ClickformButton();
    }

    @And("the user clicks on the practice form button")
    public void theUserClicksOnThePracticeFormButton() {
        // driver.findElement(By.xpath("//span[contains(text(), 'Practice Form')]")).click();
        registrationPage.ClickpracticeFormButton();
    }

    @When("the user enters firstname {string}")
    public void theUserEntersFirstname(String firstName) {
        //driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(firstName);
        registrationPage.EnterfirstName(firstName);
    }

    @And("the user enters lastname {string}")
    public void theUserEntersLastname(String lastName) {
        //driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(lastName);
        registrationPage.EnterlastName(lastName);
    }

    @And("the user enters email {string}")
    public void theUserEntersEmail(String email) {
        //driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys(email);
        registrationPage.Enteremail(email);
    }

    @And("the user enters gender")
    public void theUserEntersGender() {
        //driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
        registrationPage.Clickgender();
    }

    @And("the user enters mobile number {string}")
    public void theUserEntersMobileNumber(String mobileNumber) {
        //driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys(mobileNumber);
        registrationPage.EntermobileNumber(mobileNumber);
    }

    @And("the user enters date of birth")
    public void theUserEntersDateOfBirth() {
//        driver.findElement(By.id("dateOfBirthInput")).click();
//        Select month = new Select (driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
//        month.selectByVisibleText("April");
//
//        Select year = new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));
//        year.selectByVisibleText("1963");
//
//        driver.findElement(By.xpath("//*[@class = 'react-datepicker__day react-datepicker__day--024']")).click();

        registrationPage.EnterDOB();
    }

    @And("the user selects hobbies")
    public void theUserSelectsHobbies() {
        //driver.findElement(By.xpath("//*[@id=\"close-fixedban\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
        registrationPage.SelectHobbies();

    }

    @And("the user uploads a picture")
    public void theUserUploadsAPicture() throws InterruptedException {
        //scroll down page so picture is visible and can be uploaded
        ((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,250)");
        driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]")).sendKeys("C:\\Users\\Gerald Fongha\\IdeaProjects\\PracticeFormAutomation/automationpic.jpg");
        //  registrationPage.pickPicture();
    }

    @And("the user enters address {string}")
    public void theUserEntersAddress(String address) {
        //driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Glasgow, UK");
        registrationPage.Enteraddress(address);
    }

    @And("the user selects a state")
    public void theUserSelectsAState() {
        //driver.findElement(By.xpath("//div[@id='state']")).click();
        //driver.findElement(By.xpath("//*[@id=\"react-select-3-option-2\"]")).click();
        registrationPage.selectState();

    }

    @And("the user selects a city")
    public void theUserSelectsACity() {
        // driver.findElement(By.xpath("//*[@id=\"city\"]")).click();
        // driver.findElement(By.xpath("//*[@id=\"react-select-4-option-1\"]")).click();
        registrationPage.selectCity();
    }

    @When("the user clicks on the submit button")
    public void theUserClicksOnTheSubmitButton() {
        //scroll down page so picture is visible and can be uploaded
        // JavascriptExecutor js = (JavascriptExecutor)driver;
        // ((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,250)");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("document.body.style.zoom ='65%'");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", registrationPage.submitButton);
        driver.findElement(By.id("submit"));

        JavascriptExecutor afterExecutor = (JavascriptExecutor) driver;
        afterExecutor.executeScript("document.body.style.zoom ='100%'");

    }
//Assertion option 1
    // @Then("the form is submitted successfully with this message {string}")
    // public void theFormIsSubmittedSuccessfullyWithThisMessage(String validationMessage) throws InterruptedException {
    //driver.findElement(By.cssSelector("#example-modal-sizes-title-lg")).getText();
    //Thread.sleep(5000);
    //   Assert.assertEquals(validationMessage, driver.findElement(By.id("example-modal-sizes-title-lg")).getText());
    // }

    //Assertion option 2. web driver check if the element is displayed it will give a true and a false if not displayed.
    @Then("the form is submitted successfully")
    public void theFormIsSubmittedSuccessfully() throws InterruptedException {
        //Thread.sleep(10000);
        // boolean formSubmitted = driver.findElement(By.xpath("//*[@id=\"example-modal-sizes-title-lg\"]")).isDisplayed();
        Assert.assertTrue(registrationPage.verifyFormSubmission());
    }

    @And("the user clicks the close button")
    public void theUserClicksTheCloseButton() {

        // driver.findElement(By.id("closeLargeModal")).click();
        registrationPage.clickCloseButton();
    }

    @Then("the form is not submitted")
    public void theFormIsNotSubmitted() {
        boolean studentRegistration = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/h5")).isDisplayed();
        Assert.assertTrue(studentRegistration);
    }

    @And("the user does not enter mobile number")
    public void theUserDoesNotEnterMobileNumber() {
        //driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("");
        registrationPage.omitMobileNumber();
    }

    @And("the user enters gender {string}")
    public void theUserEntersGender(String gender) {
        //if gender=male (that is if the value for gender is true), perform this action i.e click male. Else click female gender.(i.e gender is false)
         if (gender.equals("Male")) {
            registrationPage.maleGender.click();
        } else if (gender.equals("Female")) {
            registrationPage.femaleGender.click();
        } else {
             registrationPage.otherGender.click();
         }
    }
}