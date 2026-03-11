package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

    WebDriver driver;

    // constructor
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="username")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    WebElement loginBtn;

    // username
    public void enterUsername(String user)
    {
        username.sendKeys(user);
    }

    // password
    public void enterPassword(String pass)
    {
        password.sendKeys(pass);
    }

    // login btn
    public void clickLogin()
    {
        loginBtn.click();
    }
}