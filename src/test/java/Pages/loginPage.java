package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    WebDriver driver;
    //constructor to avoid redundancey of passing driver
    public loginPage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }



    public WebElement usernameElement ( ) {
        By username=By.name("email");
        WebElement  usernameElement=  driver.findElement(username);
        return usernameElement;
    }

    public WebElement passwordElement ( ) {
        return   driver.findElement(By.name("password"));

    }
    public By flashPom (){
        return By.id("flash");
    }


    public By logoutPom (){
        return By.cssSelector("a[href=\"/login\"]");
    }
    public By myAccoutPom (){
        return By.cssSelector("a[href=\"//customer/info\"]");
    }
    public void loginSteps( String username, String password){

        ////// //Enter username using design Pom
        // usernamePF.clear();
        usernameElement().clear();
        usernameElement().sendKeys(username);



        //////Enter password using design Pom
        passwordElement().sendKeys(password);
       // passwordElement().sendKeys(Keys.ENTER);

    }
}
