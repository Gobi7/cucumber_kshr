package org.interview.question;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IphoneTask {
   
     static WebDriver driver ;	
 	
	@Given("user launch the apple brower")
	public void user_launch_the_apple_brower() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.apple.com/in/?afid=p238%7Cs8Vs8GkTq-dc_mtid_187079nc38483_pcrid_"
				+ "653909215865_pgrid_112258962467_pntwk_g_pchan__pexid__&cid=aos-IN-kwgo-brand--slid---product-");
		driver.manage().window().maximize();
    
	}

	@Given("user searching the iphone {int} pro max")
	public void user_searching_the_iphone_pro_max(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("click the mobile")
	public void click_the_mobile() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("validate the iphone mobile")
	public void validate_the_iphone_mobile() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("choosing the colour")
	public void choosing_the_colour() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("validating the list of colour")
	public void validating_the_list_of_colour() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("printing all the values based on the colours")
	public void printing_all_the_values_based_on_the_colours() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
	
	