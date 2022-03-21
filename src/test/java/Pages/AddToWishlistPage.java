package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddToWishlistPage {
    WebDriver driver;
    public AddToWishlistPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    By btn_AddtoWishlist=By.xpath("//*[text()='Add to wishlist']");

    public void click_addtoWishlist(){
        driver.findElement(btn_AddtoWishlist).click();
    }

}
