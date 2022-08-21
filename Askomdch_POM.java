package com.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Askomdch_POM {

	public WebDriver driver;


	@FindBy(xpath = "//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[1]/a")
	public static WebElement shopnow;

	@FindBy(className = "search-field")
	public static WebElement searchbox;

	@FindBy(xpath = "//*[@id=\"woocommerce_product_search-1\"]/form/button")
	public static WebElement searchbutton;

	@FindBy(xpath = "//*[@id=\"product-1206\"]/div[2]/form/button")
	public static WebElement addcart;

	@FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div/a")
	public static WebElement viewcart;

	@FindBy(xpath = "//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")
	public static WebElement checkout;

	@FindBy(xpath = "//*[@id=\"billing_first_name\"]")
	public static WebElement firstname;

	@FindBy(xpath = "//*[@id=\"billing_last_name\"]")
	public static WebElement lastname;

	@FindBy(className = "select2-selection__rendered")
	public static WebElement country;

	@FindBy(id = "select2-billing_country-container")
	public static WebElement country1;

	@FindBy(xpath = "//*[@id=\"billing_address_1\"]")
	public static WebElement add;

	@FindBy(xpath = "//*[@id=\"billing_city\"]")
	public static WebElement city;

	@FindBy(xpath = "//*[@id=\"billing_postcode\"]")
	public static WebElement postcode;

	@FindBy(xpath = "//*[@id=\"billing_email\"]")
	public static WebElement email;

	@FindBy(xpath = "//*[@id=\"select2-billing_state-container\"]")
	public static WebElement state;

	@FindBy(id = "payment_method_cod")
	public static WebElement paymethod;

	@FindBy(xpath = "//*[@id=\"place_order\"]")
	public static WebElement payorder;

    public Askomdch_POM(WebDriver driver) {
   
	this.driver = driver;
	PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
}

}
