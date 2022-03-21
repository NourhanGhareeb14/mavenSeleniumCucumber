package stepDefinitions;

import Pages.AddToWishlistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AddToWishlist {
    AddToWishlistPage addToWishlistPage;
    @Given("user go to product and user add it to wishlist")
    public void user_go_to_product_and_user_add_it_to_wishlist() throws InterruptedException {
        addToWishlistPage =new AddToWishlistPage(Hooks.driver);
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/apple-macbook-pro-13-inch ");
      //  Hooks.driver.findElement(By.xpath("//*[text()='Add to wishlist']")).click();
        addToWishlistPage.click_addtoWishlist();
    }

    @And("user select wishlist")
    public void user_select_wishlist() throws InterruptedException {
        addToWishlistPage =new AddToWishlistPage(Hooks.driver);
        addToWishlistPage.click_addtoWishlist();

       // Hooks.driver.findElement(By.xpath("//*[text()='Add to wishlist']")).click();
        Thread.sleep(3000);
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/wishlist");


    }
    @Then("user get products added to wishlist")
    public void user_get_products_added_to_wishlist() throws InterruptedException {

        Thread.sleep(2000);
        String expecetedResult ="Apple MacBook Pro 13-inch";
        String actualResult =Hooks.driver.findElement(By.className("product-name")).getText();
        System.out.println(Hooks.driver.findElement(By.className("product-name")).getText());

        Assert.assertEquals(actualResult.contains(expecetedResult),true);

    }

}
