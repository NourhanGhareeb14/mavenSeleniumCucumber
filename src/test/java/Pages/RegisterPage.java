package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    By radio_btn_Gender=By.id("gender-female");
    By txt_firstName=By.id("FirstName");
    By txt_lastName=By.id("LastName");
    By txt_email=By.id("Email");
    By txt_password=By.id("Password");
    By txt_password2=By.id("ConfirmPassword");

    By btn_Register=By.id("register-button");


    public void click_gender(){
        driver.findElement(radio_btn_Gender).click();
    }

    public void enter_firstName(String firstname){
        driver.findElement(txt_firstName).sendKeys(firstname);
    }
    public void enter_lastName(String lastname){
        driver.findElement(txt_lastName).sendKeys(lastname);
    }

    public void enter_email(String email){
        driver.findElement(txt_email).sendKeys(email);
    }
    public void enter_password(String password){
        driver.findElement(txt_password).sendKeys(password);
    }
    public void confirm_password(String confirmPassword){
        driver.findElement(txt_password2).sendKeys(confirmPassword);

    }
    public void click_register(){
        driver.findElement(btn_Register).click();
    }

}
