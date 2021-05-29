package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Test1_Page  extends AbstractClass{

    private WebDriver driver;

    public Test1_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".login")
    private WebElement signInButton;


    @FindBy(css = "#email_create")
    private WebElement emailTextArea;

    @FindBy(css = "#SubmitCreate")
    private WebElement submitButton;

    @FindBy(css = "#id_gender1")
    private WebElement gender1;


    @FindBy(css = "#customer_firstname")
    private WebElement firstname1;

    @FindBy(css = "#customer_lastname")
    private WebElement lastname1;

    @FindBy(css = "#passwd")
    private WebElement password1;

@FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstname2;

@FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastname2;

@FindBy(css = "#company")
    private WebElement company;

@FindBy(css = "#address1")
    private WebElement adres;



public void clickSignInButton(){

    clickFunction(signInButton);
}

public void typeEmail(String email){

    sendKeysFunction(emailTextArea,email);
}

public void clickSubmit(){

    clickFunction(submitButton);
}
public void clickGender(){

    clickFunction(gender1);
}
public void typeFirstname1(String firstname){

    sendKeysFunction(firstname1,firstname);
}
    public void password(String password){

        sendKeysFunction(password1,password);
    }
    public void typeLasstname1(String lastname_2){

        sendKeysFunction(lastname2,lastname_2);
    }

    public void typeCompany(String company1){

        sendKeysFunction(company,company1);
    }
    public void typeAddress(String address1){

        sendKeysFunction(adres,address1);
    }











}
