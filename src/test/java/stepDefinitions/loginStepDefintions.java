package stepDefinitions;

import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import utilities.BrowserUtils;


public class loginStepDefintions     {
    loginPage login;
    @Given("user go to login page")
    public void go_to_login_page() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();
    }

    @When("^user login with \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void valid_username_password(String type, String username, String password)
    {
        login=new loginPage(Hooks.driver);
         login.enter_email(username);
        login.enter_password(password);

    }

    @And("user press on login button")
    public void login_button() throws InterruptedException {
        login.click_login();
        BrowserUtils.waitFor(2);
      //  Hooks.driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
    }

    @Then("user login to the system successfully")
    public void success_login()
    {
        login.logoutDisplayed();
         Assert.assertTrue(true);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");


    }

}
