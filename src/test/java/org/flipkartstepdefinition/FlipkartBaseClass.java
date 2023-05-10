package org.flipkartstepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartBaseClass {

		static WebDriver driver;
		@Given("user launch the brower")
		public void user_launch_the_brower() {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  
		}

		@Given("user login with credentials")
		public void user_login_with_credentials() {
			try {
				WebElement btn=driver.findElement((By.xpath("//button[@class='_2KpZ6l _2doB4z']")));
				Boolean value =btn.isDisplayed();
				System.out.println("Login :" +value);
				btn.click();
				}
				catch(Exception e) {
//					e.printStackTrace();
					System.out.println("Login Not Required");
				}
		   
		}
		static String name;
		@When("search for samsung ultra mobile")
		public void search_for_samsung_ultra_mobile() {
			WebElement srch= driver.findElement(By.xpath("//input[@name='q']"));
			srch.sendKeys("samsung s23 ultra");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			WebElement text = driver.findElement(By.xpath("(//div[contains(text(),'SAMSUNG Galaxy')])[1]"));
			name=text.getText();
			System.out.println(name);
		  
		}

		@When("validate the mobile")
		public void validate_the_mobile() {
			driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();	
		    
		}

		@When("take screenshot of the chosen product")
		public void take_screenshot_of_the_chosen_product() throws InterruptedException {
			Thread.sleep(2000);
			String parent = driver.getWindowHandle();
			Set<String> child = driver.getWindowHandles();
			for(String x: child) {
				if(!x.equals(parent)) {
					driver.switchTo().window(x);
					System.out.println("Window Switched to child");
				}
			}
		    
		}
		@When("close the browser")
		public void close_the_browser() {
		    driver.quit();
		}

        @When("search for samsung ultra mobile using one dim")
        public void search_for_samsung_ultra_mobile_using_one_dim(DataTable dataTable) {
        	List<String>datas =dataTable.asList(String.class);
        	
        	WebElement srch= driver.findElement(By.xpath("//input[@name='q']"));
        
			srch.sendKeys(datas.get(1));
			driver.findElement(By.xpath("//button[@type='submit']")).click();;
			
			System.out.println(datas.get(1));
			
}	

        @When("search for samsung ultra mobile using one dim map")
        public void search_for_samsung_ultra_mobile_using_one_dim_map(DataTable dataTable) {
        	 Map<String,String>datas1 =dataTable.asMap(String.class,String.class);

       	WebElement srch= driver.findElement(By.xpath("//input[@name='q']"));
			srch.sendKeys(datas1.get("realme"));
			
			WebElement cl =driver.findElement(By.xpath("//button[@type='submit']"));
			cl.click();
			System.out.println(datas1.get("realme"));
        }
        @When("search for samsung ultra mobile{string}")
        public void search_for_samsung_ultra_mobile(String mob) {
        	WebElement srch= driver.findElement(By.xpath("//input[@name='q']"));
			srch.sendKeys(mob);
			WebElement cl =driver.findElement(By.xpath("//button[@type='submit']"));
			cl.click();
        }

	}



















