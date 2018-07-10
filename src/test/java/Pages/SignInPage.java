package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage {


    @FindBy(xpath = "//a[@class='login']")
    WebElement SignInButton;

    @FindBy(xpath = "//input[@id='email']")
    WebElement EmailField;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement PasswordField;

    @FindBy(xpath = "//button[@id='SubmitLogin']//span")
    WebElement SignInEnter;


    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void ClickSignIn() {
        SignInButton.click();
    }

    public void setEmailField(String strEmail) {
        EmailField.sendKeys(strEmail);
    }

    public void setPasswordField(String strPassword) {
        PasswordField.sendKeys(strPassword);
    }

    public void EnterSignIn() {
        SignInEnter.click();
    }

}