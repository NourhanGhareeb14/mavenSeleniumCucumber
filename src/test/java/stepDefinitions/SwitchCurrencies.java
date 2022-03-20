package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SwitchCurrencies {
    @Given("user go to home page")
    public void go_to_login_page()  {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @And("user clicks on currencies field and user select Euro")
    public void user_clicks_on_currencies_field()  {
        Select Currency = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        Currency.selectByVisibleText("Euro");
    }
    @Then("user view Euro is selected")
    public void user_view_Euro_is_selected()  {
        String expecetedResult = "Euro";
        String actualResult =Hooks.driver.findElement(By.id("customerCurrency")).getText();
        Assert.assertEquals(actualResult.contains(expecetedResult),true);
    }

}
