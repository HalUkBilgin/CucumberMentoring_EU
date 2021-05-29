package PageObjectModel;

import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Test2_Page extends AbstractClass {
private WebDriver driver;
    public Test2_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//a[@title='T-shirts'])[2]")
    private WebElement tshirtButton;

    public void clickTshirtButton(){
        clickFunction(tshirtButton);
    }

@FindBy(css = ".icon-th-list")
    private WebElement listButton;

    public void clickListButton(){

        clickFunction(listButton);
    }

    @FindBy(css = ".wishlist")
    private WebElement wishlist;

    public void clickWishList() throws InterruptedException {
        clickFunction(wishlist);
        Thread.sleep(1500);
    }

    @FindBy(css = ".fancybox-error")
    private WebElement alertMessage;


    public void assertMessage(String message){


        Assertion(alertMessage,message);
    }



}
