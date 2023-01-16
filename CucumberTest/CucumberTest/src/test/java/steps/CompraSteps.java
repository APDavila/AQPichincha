package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompraSteps {

	WebDriver driver;
		
	@Given("the user is in the index page_1")
	public void theUserIsInTheIndexPage_1() {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");	
		driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com/");
		
	}
	
	@When("the user click in login button_1")
	public void theUserClickInLoginButton_1() {
		driver.navigate().to("https://automationexercise.com/login");
	}
	
	@Then ("the user enter his email and password_1")
	public void theUserEnterHisEmailAndPassword_1() {
		driver.findElement(By.name("email")).sendKeys("apdavila@udlanet.ec");
		driver.findElement(By.name("password")).sendKeys("12345");
	}
	
	@When("the user clicks the Login button_1")
	public void theUserClicksTheLoginButton_1() {
		driver.findElement(By.cssSelector("[data-qa='login-button']")).click();
	}
	
	@Then("the index page appears with the user logged_1")
	public void indexPage_1() {
		Boolean existeElemento = driver.findElement(By.cssSelector("[class='fa fa-user']"))!= null;
		if(existeElemento)
			System.out.print("Login éxitoso");
		else
			System.out.print("Login fallido");
	}
	

	@Then("the user clicks in products button_1")
	public void theUserClickInProductsButton_1() {		
		driver.navigate().to("https://automationexercise.com/products");
	}
	
	@Then("the user clicks in add to cart button_1")
	public void theUserClicksInAddToCartButton_1() {		
		driver.findElement(By.cssSelector("[data-product-id='1']")).click();
	}
	
	@Then("the user close confirmation popup_1")
	public void theUserCloseConfirmationPopup_1() {		
		theUserClickInProductsButton_1();
	}
	
	@Then("the user clicks in add to cart button_2")
	public void theUserClicksInAddToCartButton_2() {		
		driver.findElement(By.cssSelector("[data-product-id='2']")).click();
		theUserCloseConfirmationPopup_1();
	}
	
	@When("the user clicks in cart button_1")
	public void theUserClicksInCartButton_1() {
		driver.navigate().to("https://automationexercise.com/view_cart");
	}
	
	@When("the user clicks in Proceed To Checkout button_2")
	public void theUserClicksInProceedToCheckoutButton_2() {		
		driver.findElement(By.cssSelector("[class='btn btn-default check_out']")).click();	
	}
	
	@When("the user clicks in Place Order button_2")
	public void theUserClicksInPlaceOrderButton_2() {
		driver.findElement(By.cssSelector("[class='btn btn-default check_out']")).click();
		
	}
	
	@Then ("the user enter his Name on card, cardnumberm cvcm amd expiration_1")
	public void theUserEnterHisNameOnCardCardnumbermCvcmAmdExpiration_1() {
		driver.findElement(By.name("name_on_card")).sendKeys("Andres Davila");
		driver.findElement(By.name("card_number")).sendKeys("123456789");
		driver.findElement(By.name("cvc")).sendKeys("12345");
		driver.findElement(By.name("expiry_month")).sendKeys("12");
		driver.findElement(By.name("expiry_year")).sendKeys("2025");			
	}
	
	@When("the user clicks the Pay and Confirm Order button_1")
	public void theUserClicksThePayAndConfirmOrderButton_1() {
		driver.findElement(By.cssSelector("[data-qa='pay-button']")).click();
	}
	
	@Then("the user is in the Confirmation Page_1")
	public void orderPlaced() {
		String existeElemento = driver.findElement(By.cssSelector("[data-qa='order-placed']")).getText();
		Assert.assertEquals(existeElemento , "Order Placed!");
	}
	
	
	
	
	
	
}
