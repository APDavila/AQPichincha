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

public class LoginSteps {

	WebDriver driver;
	@Given("the user is in the index page")
	public void theUserIsInTheIndexPage() {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");	
		driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com/");
		
	}
	
	@When("the user click in login button")
	public void theUserClickInLoginButton() {
		driver.navigate().to("https://automationexercise.com/login");
	}
	
	@Then ("the user enter his email and password")
	public void theUserEnterHisEmailAndPassword() {
		driver.findElement(By.name("email")).sendKeys("apdavila@udlanet.ec");
		driver.findElement(By.name("password")).sendKeys("12345");
	}
	
	@When("the user clicks the Login button")
	public void theUserClicksTheLoginButton() {
		driver.findElement(By.cssSelector("[data-qa='login-button']")).click();
	}
	
	@Then("the index page appears with the user logged")
	public void indexPage() {
		Boolean existeElemento = driver.findElement(By.cssSelector("[class='fa fa-user']"))!= null;
		if(existeElemento)
			System.out.print("Login éxitoso");
		else
			System.out.print("Login fallido");
	}
	
	
}
