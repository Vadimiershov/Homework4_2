package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class AddItemToCart {


    public AddItemToCart(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category']")
    WebElement WomenDepartment;

    @FindBy(xpath = "//a[@class='product-name'][contains(text(),'Faded Short Sleeve T-shirts')]")
    WebElement AddCloth;

    @FindBy(xpath = "//p[@id='add_to_cart']//button[@type='submit']")
    WebElement AddToCartButton;

    @FindBy(partialLinkText = "Proceed to checkout")
    WebElement CheckOut;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?controller=order&step=1']//span")
    WebElement ProceedToCheckout1;

    @FindBy(xpath = "//ul[@id='address_delivery']//li[@class='address_address1 address_address2']")
    WebElement StreetDelivery;

    @FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_address1 address_address2']")
    WebElement StreetBilling;

    @FindBy(xpath = "//ul[@id='address_delivery']//li[@class='address_city address_state_name address_postcode']")
    WebElement CityDelivery;

    @FindBy(xpath = "//ul[@id='address_invoice']//li[@class='address_city address_state_name address_postcode']")
    WebElement CityBilling;

    @FindBy(xpath = "//p[@class='cart_navigation clearfix']//button[@type='submit']//span")
    WebElement ProceedToCheckout2;

    @FindBy(css = "#cgv")
    WebElement TermsCondition;

    @FindBy(xpath = "//p[@class='cart_navigation clearfix']//button[@type='submit']//span")
    WebElement ProceedToCheckout3;

    @FindBy(xpath = "//a[@class='cheque']")
    WebElement PayByCheck;

    @FindBy(xpath = "//p[@id='cart_navigation']//button[@type='submit']//span")
    WebElement ConfirmOrder;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    WebElement OrderIsSubmit;

    @FindBy(xpath = "//a[@class='button-exclusive btn btn-default']")
    WebElement BackToOrders;

    @FindBy(xpath = "//a[@class='logout']")
    WebElement SignOut;


    public void ClickWomen() {
        WomenDepartment.click();
    }

    public void ClickAddCloth() {
        AddCloth.click();
    }

    public void addToCart() throws InterruptedException {
        Thread.sleep(1000);
        AddToCartButton.click();
    }

    public void Checkout() throws InterruptedException {
        Thread.sleep(1000);
        CheckOut.click();
    }

    public void ProceedToCheckOutAgain() {

        ProceedToCheckout1.click();
    }

    public void CheckStreet() {
        Assert.assertEquals(StreetDelivery.getText(), StreetBilling.getText());
    }

    public void CheckCity() {
        Assert.assertEquals(CityBilling.getText(), CityDelivery.getText());
    }

    public void ProceedToCheckOut2s() {
        ProceedToCheckout2.click();
    }

    public void TermsConditions() {
        TermsCondition.click();
    }

    public void ProceedToCheckOut3s() {
        ProceedToCheckout3.click();
    }

    public void PayByChecks() {
        PayByCheck.click();
    }

    public void ConfirmOrders() {
        ConfirmOrder.click();
    }

    public void CheckSubmit() {
        Assert.assertEquals(OrderIsSubmit.getText(), "Your order on My Store is complete.");
    }

    public void BackToOrderss() {
        BackToOrders.click();
    }

    public void SignOuts() {
        SignOut.click();
    }

}
