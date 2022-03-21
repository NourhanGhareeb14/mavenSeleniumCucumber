package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver driver;
    public loginPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    By txt_email=By.id("Email");

    By txt_password=By.id("Password");
    By btn_Login=By.className("login-button");
    By btn_Logout=By.xpath("//*[text()='Log out']");

    public void enter_email(String email){
        driver.findElement(txt_email).sendKeys(email);
    }
    public void enter_password(String password){
        driver.findElement(txt_password).sendKeys(password);
    }
    public void click_login(){
        driver.findElement(btn_Login).click();
    }
    public void logoutDisplayed(){
        driver.findElement(btn_Logout).isDisplayed();
    }
//    public void validLogin(String email,String password){
//        driver.findElement(txt_email).sendKeys(email);
//        driver.findElement(txt_password).sendKeys(password);
//        driver.findElement(btn_Login).click();
//
//    }

}
