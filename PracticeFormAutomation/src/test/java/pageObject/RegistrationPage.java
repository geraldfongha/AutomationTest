package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPage {
    public RegistrationPage(WebDriver driver) {

    PageFactory.initElements(driver, this);

    }
    @FindBy(how = How.XPATH, using = "//*[@id=\"accept-cookie-policy\"]")
    private WebElement cookieButton;

    @FindBy(how = How.XPATH, using = "//ul[@class='navbar__links d-none d-lg-flex']//a[normalize-space()='Demo Site']")
    private WebElement demoSiteButton;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Forms')]")
    private WebElement formsButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Practice Form')]")
    private WebElement practiceFormButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"firstName\"]")
    private WebElement enterFirstName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"lastName\"]")
    private WebElement enterLastName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"userEmail\"]")
    private WebElement enterEmail;

    @FindBy(how = How.XPATH, using = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
    public WebElement maleGender;

    @FindBy(how = How.XPATH, using = "//*[@id=\"userNumber\"]")
    private WebElement enterMobileNumber;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dobField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"close-fixedban\"]")
    private WebElement hobby_1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")
    private WebElement hobby_2;

    @FindBy(how = How.XPATH, using = "//*[@id='currentAddress']")
    private WebElement enterAddress;

    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")
    private WebElement dobMonth;

    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")
    private WebElement dobYear;

    @FindBy(xpath = "//*[@class = 'react-datepicker__day react-datepicker__day--024']")
    private WebElement  dobDate;

    @FindBy(xpath = "//*[@id=\"uploadPicture\"]")
    private WebElement pictureButton;

    @FindBy(xpath = "//div[@id='state']")
    private WebElement stateField;

    @FindBy(xpath = "//*[@id=\"react-select-3-option-2\"]")
    private WebElement stateOption;

    @FindBy(xpath = "//*[@id=\"city\"]")

    private WebElement cityDropdown;

    @FindBy(xpath = "//*[@id=\"react-select-4-option-1\"]")
    private WebElement cityOption;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"example-modal-sizes-title-lg\"]")
    private WebElement formSubmission;

    @FindBy(id = "closeLargeModal")
    public WebElement closeButton;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")
    public WebElement femaleGender;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[3]/label")
    public WebElement otherGender;



public void clickCookieButton(){
    cookieButton.click();
}

public void ClickdemoSiteButton(){

    demoSiteButton.click();
}

public void ClickformButton(){

    formsButton.click();
}

public void ClickpracticeFormButton(){

    practiceFormButton.click();
}

public void EnterfirstName(String firstName){

    enterFirstName.sendKeys(firstName);
}

public void EnterlastName(String lastName){

    enterLastName.sendKeys(lastName);
}

public void Enteremail(String email){

    enterEmail.sendKeys(email);
}

public void Clickgender(){

    maleGender.click();
}
public void EntermobileNumber(String number){

    enterMobileNumber.sendKeys(number);
}

public void EnterDOB(){
    dobField.click();

    new Select(dobMonth).selectByVisibleText("April");
    new Select(dobYear).selectByVisibleText("1963");

    dobDate.click();
}

public void SelectHobbies(){
    hobby_1.click();
    hobby_2.click();
}

public void pickPicture(){

    practiceFormButton.sendKeys("C:\\Users\\Gerald Fongha\\IdeaProjects\\PracticeFormAutomation/automationpic.jpg");
}

public void Enteraddress(String address){
    enterAddress.sendKeys(address);
}
public void selectState(){
    stateField.click();
    stateOption.click();
}

public void selectCity(){
    cityDropdown.click();
    cityOption.click();
}

public boolean verifyFormSubmission() throws InterruptedException {
    Thread.sleep(10000);
    boolean isFormSubmitted = formSubmission.isDisplayed();
    return isFormSubmitted;

}

public void clickCloseButton(){
    closeButton.click();
}

public void omitMobileNumber(){
    enterMobileNumber.sendKeys("");
}

}
