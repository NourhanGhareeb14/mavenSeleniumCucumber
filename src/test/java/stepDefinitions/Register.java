package stepDefinitions;

import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Register {
    RegisterPage registerPage;
    @Given("user go to register screen")
    public void user_go_to_register_screen () throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
     }

    @When("user add all required data")
    public void user_add_all_required_data() throws InterruptedException {
        registerPage=new RegisterPage(Hooks.driver);
       // Hooks.driver.findElement(By.id("gender-female")).click();
        registerPage.click_gender();
        //Hooks.driver.findElement(By.id("FirstName")).sendKeys("Nourhan");
        registerPage.enter_firstName("nourhan");
       // Hooks.driver.findElement(By.id("LastName")).sendKeys("Ghareeb");
        registerPage.enter_lastName("ghareeeb");
       // Hooks.driver.findElement(By.id("Email")).sendKeys("n.gharee999b@qpix.io");
        registerPage.enter_email("nour@qqq.io");
        //Hooks.driver.findElement(By.id("Password")).sendKeys("12345678");
        registerPage.enter_password("12345678");
       // Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678");
        registerPage.confirm_password("12345678");
       // Hooks.driver.findElement(By.id("register-button")).click();
        registerPage.click_register();
        Thread.sleep(3000);
     }
    @Then("user create new account")
    public void user_create_new_account() throws InterruptedException {

         String expecetedResult ="Your registration completed";
        String actualResult =Hooks.driver.findElement(By.className("result")).getText();

        Assert.assertEquals(actualResult.contains(expecetedResult),true);


    }



}
