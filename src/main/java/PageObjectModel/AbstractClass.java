package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;
import java.util.Random;

public abstract  class AbstractClass {

    private WebDriver driver = Driver.getDriver();


    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void clickFunction(WebElement clickElement) {
try {
    wait.until(ExpectedConditions.elementToBeClickable(clickElement));
    clickElement.click();
}catch (Exception e){

    System.out.println(e.getMessage());
}
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value) {

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));

        sendKeysElement.sendKeys(value);


    }

    public void verifyCreated(List<WebElement> tableList, String value) {

        boolean result = false;

        for (int i = 0; i < tableList.size(); i++) {
            if (tableList.get(i).getText().trim().equalsIgnoreCase(value)) {

                result = true;
                System.out.println(value + " is displayed.");
                break;
            }
        }
        if (!result) {
            Assert.fail();
        }
    }

    public void waitUntilList(List<WebElement> list) throws InterruptedException {
        Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfAllElements(list));


    } //                                                       hangi listeden silincek?              -  hangi delete butonu?     - değer ne ?           - Yes butonu

    public void deleteFunctionality(List<WebElement> name, List<WebElement> deleteButton, String value, WebElement buttonYes) throws InterruptedException {
        Thread.sleep(1000);

try {
    for (int i = 0; i < name.size(); i++) {

        if (name.get(i).getText().equals(value)) {

            clickFunction(deleteButton.get(i));
            clickFunction(buttonYes);
        }
    }
}catch (Exception e){
    System.out.println(e.getMessage());
}


    }


//                                                                      nereyi check edicez ?  -                    silinen değer ne ?
    public void verifyDeletedAbstractClass(List<WebElement> tableList, String value) throws InterruptedException {
        Thread.sleep(1000);
        boolean result = false;
        for (int i = 0; i < tableList.size(); i++) {
            if (tableList.get(i).getText().trim().equalsIgnoreCase(value)) {
                result = true;
                break;
            }
        }
        if (result) {
            Assert.fail();
        } else {
            System.out.println(value + " is not displayed");
        }
    }

    // bana hata verdigi için spesifik olarak butonları belirliyorum
    public void clickDeleteAndYesForSpesificElement(WebElement deleteButton, WebElement yesButton2) throws InterruptedException {
Thread.sleep(2000);
deleteButton.click();
        Thread.sleep(1000);
        yesButton2.click();

    }

    public int randomGenerator(int max){

        Random random = new Random();
        int randomNum= random.nextInt(max);

        return randomNum;
    }


    public void handleDropdown(WebElement dropdown, List<WebElement> dropdownOptions){

        clickFunction(dropdown);

        int randomNum =randomGenerator(dropdownOptions.size());

        clickFunction(dropdownOptions.get(randomNum));
    }


    public void Assertion(WebElement actual,String expected){

        Assert.assertEquals(actual.getText(),expected);

        System.out.println("My Message :  " + actual.getText());
    }

    public void URLAssertion(String expectedUrl){

        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);

        System.out.println("My current url :   " + driver.getCurrentUrl());
    }

}





