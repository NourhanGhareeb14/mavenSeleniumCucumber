package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPage {
    WebDriver driver;
    public ResetPasswordPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
   By txt_email=By.className("email");


    By btn_forgetPassword=By.className("forgot-password");
    By btn_Recover=By.name("send-email");
  //   By alert=By.className("content");

    public void click_forget(){
        driver.findElement(btn_forgetPassword).click();
  }

    public void enter_email(String email){
        driver.findElement(txt_email).sendKeys(email);
    }

    public void click_recover(){
        driver.findElement(btn_Recover).click();
    }

}
