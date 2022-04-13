package stepDefinitions;

import Pages.FilterBycolorLocatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.BrowserUtils;

public class FilterByColor {
    FilterBycolorLocatorPage filterBycolorLocatorPage;

    @Given("user go to category then select subcategory")
    public void user_go_to_category_then_select_subcategory() throws InterruptedException {
        filterBycolorLocatorPage=new FilterBycolorLocatorPage(Hooks.driver);
       // Hooks.driver.findElement(By.xpath("//*[text()='Apparel ']")).click();
        filterBycolorLocatorPage.click_category();
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/apparel");
        BrowserUtils.waitFor(2);
       // Hooks.driver.findElement(By.xpath("//*[text()=' Shoes ']")).click();
        filterBycolorLocatorPage.click_sub_category();
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/shoes");    }

    @And("user select color")
    public void user_select_color() throws InterruptedException {
        filterBycolorLocatorPage=new FilterBycolorLocatorPage(Hooks.driver);
        BrowserUtils.waitFor(2);
        filterBycolorLocatorPage.click_color();
       // Hooks.driver.findElement(By.id("attribute-option-15")).click();
        BrowserUtils.waitFor(2);
    }
    @Then("user get products with the selecetd color")
    public void user_get_products_with_the_selecetd_color()  {

        String expecetedResult = "adidas Consortium Campus 80s Running Shoes";
        String actualResult =Hooks.driver.findElement(By.xpath("//*[text()='adidas Consortium Campus 80s Running Shoes']")).getText();
        Assert.assertEquals(actualResult.contains(expecetedResult),true);
    }

}
