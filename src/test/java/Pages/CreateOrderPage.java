package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateOrderPage {
    WebDriver driver;
    public CreateOrderPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    By btn_checkout=By.id("checkout");
    By btn_save=By.name("save");
    By btn_coninue1=By.id("shipping-method-buttons-container");
    By btn_coninue2=By.id("payment-method-buttons-container");
    By btn_coninue3=By.id("payment-info-buttons-container");
    By btn_coninue4=By.id("confirm-order-buttons-container");

    public void click_checkout(){
        driver.findElement(btn_checkout).click();
    }
    public void click_save(){
        driver.findElement(btn_save).click();
    }
    public void click_continue1(){
        driver.findElement(btn_coninue1).click();
    }
    public void click_continue2(){
        driver.findElement(btn_coninue2).click();
    }
    public void click_continue3(){
        driver.findElement(btn_coninue3).click();
    }
    public void click_continue4(){
        driver.findElement(btn_coninue4).click();
    }
}
