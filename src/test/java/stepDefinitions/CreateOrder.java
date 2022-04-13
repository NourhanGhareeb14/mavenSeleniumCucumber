package stepDefinitions;

import Pages.AddToCartPage;
import Pages.CreateOrderPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import utilities.BrowserUtils;

public class CreateOrder {
    CreateOrderPage createOrderPage;
    AddToCartPage addToCartPage;
    @Given("user login")
    public void user_login()  {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();

    }
    @When("^user login  \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userloginbyvaliddata(String type, String username, String password)
    {
        Hooks.driver.findElement(By.id("Email")).sendKeys(username);
        Hooks.driver.findElement(By.id("Password")).sendKeys(password);
        Hooks.driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);

    }
    @And("user select product and  add it to Cart")
   public void addtocart() throws InterruptedException {
        addToCartPage=new AddToCartPage(Hooks.driver);
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
         //Hooks.driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
        addToCartPage.click_addtocart();
        BrowserUtils.waitFor(2);
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/cart");

        Hooks.driver.findElement(By.id("termsofservice")).click();
        BrowserUtils.waitFor(2);

    }
    @Then("user press on checkout and complete order")
    public void user_press_on_checkout() throws InterruptedException {
         createOrderPage=new CreateOrderPage(Hooks.driver);
      //  Hooks.driver.findElement(By.id("checkout")).click();
        createOrderPage.click_checkout();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/onepagecheckout#opc-billing");

         //Hooks.driver.findElement(By.name("save")).click();
        createOrderPage.click_save();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/onepagecheckout#opc-shipping_method");
        // Hooks.driver.findElement(By.id("shipping-method-buttons-container")).click();
        createOrderPage.click_continue1();
        BrowserUtils.waitFor(2);
        //Hooks.driver.findElement(By.id("payment-method-buttons-container")).click();
        createOrderPage.click_continue2();
        BrowserUtils.waitFor(2);
       // Hooks.driver.findElement(By.id("payment-info-buttons-container")).click();
        createOrderPage.click_continue3();
        BrowserUtils.waitFor(2);
       // Hooks.driver.findElement(By.id("confirm-order-buttons-container")).click();
        createOrderPage.click_continue4();
        BrowserUtils.waitFor(2);

    }
}
