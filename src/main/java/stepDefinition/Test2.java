package stepDefinition;

import PageObjectModel.Test2_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class Test2 {
WebDriver driver;

    Test2_Page test2_page = new Test2_Page();
    @Given("^Tisorte tikla$")
    public void tisorte_tikla() throws Throwable {
test2_page.clickTshirtButton();
    }

    @Given("^list görünümüne tikla$")
    public void list_görünümüne_tikla() throws Throwable {
test2_page.clickListButton();
    }

    @When("^Favorilere ekle butonuna bas$")
    public void favorilere_ekle_butonuna_bas() throws Throwable {
test2_page.clickWishList();
    }

    @Then("^cikan mesaji verify et \"([^\"]*)\"$")
    public void cikan_mesaji_verify_et(String message1) throws Throwable {
        test2_page.assertMessage(message1);
    }
}
