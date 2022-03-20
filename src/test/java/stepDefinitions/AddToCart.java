package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AddToCart {
    @Given("user go to product and  add it to Cart")
    public void user_go_to_product_and_user_add_it_to_Cart() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/apple-macbook-pro-13-inch ");
        Hooks.driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
    }

    @And("user select cart")
    public void user_select_cart() throws InterruptedException {
       // Hooks.driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
        Thread.sleep(3000);
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/cart");


    }
    @Then("user get products added to Cart")
    public void user_get_products_added_to_cart() throws InterruptedException {

        Thread.sleep(2000);
        String expecetedResult ="Apple MacBook Pro 13-inch";
        String actualResult =Hooks.driver.findElement(By.className("product-name")).getText();
        System.out.println(Hooks.driver.findElement(By.className("product-name")).getText());

        Assert.assertEquals(actualResult.contains(expecetedResult),true);

    }
}
