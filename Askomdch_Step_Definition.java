package com.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Askomdch_Step_Definition {

	public WebDriver driver;


	@Given("askomdch website is open")
	public void askomdch_website_is_open() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhankumarpo\\eclipse-workspace\\Maven_Project\\Chrome\\chromedriver1.exe");

		driver = new ChromeDriver();

		driver.get("https://askomdch.com/");

		driver.manage().window().maximize();

	}

	@And("user click the shopnow button")

	public void user_click_the_shopnow_button() throws InterruptedException {

		Askomdch_POM.shopnow.click();
		// driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[1]/a")).click();

	}

	@And("user is navigated to search page")
	private void user_is_navigated_to_search_page() throws InterruptedException {

		System.out.println("Inside Step - user is navigated to search page");
		Thread.sleep(5000);

	}

	@When("user enters the product name in search box")
	public void user_enters_the_productname_in_search_box() throws InterruptedException {

		

		Askomdch_POM.searchbox.sendKeys("Blue Denim Shorts");
		// driver.findElement(By.className("search-field")).sendKeys("Blue Denim Shorts");
	}

	@And("hits search bitton")
	public void hits_searchbutton() throws InterruptedException {

		Askomdch_POM.searchbutton.click();
		// driver.findElement(By.xpath("//*[@id=\"woocommerce_product_search-1\"]/form/button")).click();

	}

	@Then("user is navigated to search results page")
	public void user_is_navigated_to_search_results_page() {

		System.out.println("Inside Step - user is navigated to search results page");

	}

	// Scenaro2

	@Given("askomdch product page is open")
	public void askomdch_product_page_is_open() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\madhankumarpo\\eclipse-workspace\\Maven_Project\\Chrome\\chromedriver1.exe");

		driver = new ChromeDriver();

		driver.get("https://askomdch.com/product/blue-denim-shorts/");

		driver.manage().window().maximize();
	}

	@When("user cilk the add to cart button")
	public void user_cilk_the_add_to_cart_button() throws InterruptedException {

		Askomdch_POM.addcart.click();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id=\"product-1206\"]/div[2]/form/button")).click();
	}

	@And("user navigated to view cart page")
	public void user_navigated_to_view_cart_page() throws InterruptedException {

		System.out.println("Inside Step - user is navigated to view cart page");
	}

	@When("user clik the view cart button")
	public void user_clik_the_view_cart_button() throws InterruptedException {

		Askomdch_POM.viewcart.click();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/a")).click();
	}

	@And("user navigated to proceed to checkout page")
	public void user_navigated_to_proceed_to_checkout_page() {

		System.out.println("Inside Step - user navigated to proceed to checkout page");
	}

	@When("user click the checkout button")
	public void user_click_the_checkout_button() throws InterruptedException {

		Askomdch_POM.checkout.click();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
	}

	@And("user navigated to checkout page")
	public void user_navigated_to_checkout_page() {

		System.out.println("Inside Step - user navigated to checkout page");
	}

	@When("user enter the billing details")
	public void user_enter_the_billing_details() {

		Askomdch_POM.firstname.sendKeys("Virat");
		// driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("Virat");

		Askomdch_POM.lastname.sendKeys("Kohli");
		// driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("Kohli");

		Askomdch_POM.country.click();
		// driver.findElement(By.className("select2-selection__rendered")).click();

		Askomdch_POM.country1.click();
		// driver.findElement(By.id("select2-billing_country-container")).click();

		Askomdch_POM.add.sendKeys("No:5/7, abc street");
		// driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("No:5/7,abc street");

		Askomdch_POM.city.sendKeys("ABCD");
		// driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("ABCD");

		Askomdch_POM.state.click();
		// driver.findElement(By.xpath("//*[@id=\"select2-billing_state-container\"]")).click();

		Askomdch_POM.postcode.sendKeys("90001");
		// driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("90001");

		Askomdch_POM.email.sendKeys("Maddy1218@gmail.com");
		// driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys("Maddy1218@gmail.com");

		Askomdch_POM.paymethod.click();
		// driver.findElement(By.id("payment_method_cod")).click();

	}

	@And("user click the place order button")
	public void user_click_the_place_order_button() {

		Askomdch_POM.payorder.click();
		//driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();
	}

	@Then("user navigated to sccessfull place order page")
	public void user_navigated_to_sccessfull_place_order_page() {

		System.out.println("Inside Step - user navigated to proceed to checkout page");
	}
	

}

