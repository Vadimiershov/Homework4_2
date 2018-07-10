package Stepdefs;

import Pages.AddItemToCart;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import Pages.SignInPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver driver;
    SignInPage signInPage;
    AddItemToCart addItemToCart;


    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Azerics\\Chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        signInPage = new SignInPage(driver);
        addItemToCart = new AddItemToCart(driver);
    }

    @After
    public void finish() {
        driver.close();
        driver.quit();
    }

    @Given("^user navigates to the app url$")
    public void userNavigatesToTheAppUrl() {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @When("^user click sign in button$")
    public void userClickSignInButton() {
        signInPage.ClickSignIn();
    }

    @When("^user fills email textfield$")
    public void userFillsEmailTextfield() {
        signInPage.setEmailField("mykolaiershov@gmail.com");
    }

    @When("^user fills password textfield$")
    public void userFillsPasswordTextfield() {
        signInPage.setPasswordField("testing");
    }

    @When("^user enter sign in button$")
    public void userEnterSignInButton() {
        signInPage.EnterSignIn();
    }


    @When("^user choose women department$")
    public void userChooseWomenDepartment() {
        addItemToCart.ClickWomen();

    }

    @When("^user chose and view the item$")
    public void userChoseAndViewTheItem() {
        addItemToCart.ClickAddCloth();


    }

    @When("^user add it to the cart$")
    public void userAddItToTheCart() throws InterruptedException {
        addItemToCart.addToCart();
    }


    @When("^user click on proceed to checkout again$")
    public void userClickOnProceedToCheckoutAgain() {
        addItemToCart.ProceedToCheckOutAgain();

    }

    @When("^user check street delivery$")
    public void userCheckStreetDelivery() {
        addItemToCart.CheckStreet();

    }

    @When("^user check city delivery$")
    public void userCheckCityDelivery() {
        addItemToCart.CheckCity();

    }


    @When("^user click on proceed to checkout$")
    public void userClickOnProceedToCheckout() throws Throwable {
        addItemToCart.Checkout();
    }

    @When("^user proceed to checkout before shipping$")
    public void userProceedToCheckoutBeforeShipping() {
        addItemToCart.ProceedToCheckOut2s();
    }

    @When("^user click on terms of service$")
    public void userClickOnTermsOfService() {
        addItemToCart.TermsConditions();
    }

    @When("^user proceed to checkout before payment$")
    public void userProceedToCheckoutBeforePayment() {
        addItemToCart.ProceedToCheckOut3s();

    }

    @When("^user choose option to pay by check$")
    public void userChooseOptionToPayByCheck() {
        addItemToCart.PayByChecks();

    }

    @When("^user confirm order$")
    public void userConfirmOrder() {
        addItemToCart.ConfirmOrders();

    }

    @When("^user check tjat order is submitted$")
    public void userCheckTjatOrderIsSubmitted() {
        addItemToCart.CheckSubmit();

    }

    @When("^user back to orders$")
    public void userBackToOrders() {
        addItemToCart.BackToOrderss();

    }

    @Then("^user is logged out$")
    public void userIsLoggedOut() {
        addItemToCart.SignOuts();

    }
}


