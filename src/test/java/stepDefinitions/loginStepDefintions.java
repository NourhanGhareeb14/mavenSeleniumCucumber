package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;


public class loginStepDefintions     {

    @Given("user go to login page")
    public void go_to_login_page() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();
    }

    @When("^user login with \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void valid_username_password(String type, String username, String password)
    {
        Hooks.driver.findElement(By.id("Email")).sendKeys(username);
        Hooks.driver.findElement(By.id("Password")).sendKeys(password);
    }

    @And("user press on login button")
    public void login_button()
    {
        Hooks.driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
    }

    @Then("user login to the system successfully")
    public void success_login()
    {
        // Please remove below line and do it on your own
        Assert.assertTrue(true);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");


    }

}
