package stepDefinations;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;
import resources.base;


public class stepDefination extends base {
    

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^Click on Login link in home page to land on Secure sign in Page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() throws Throwable {

		LandingPage l = new LandingPage(driver);
		if (l.getPopUpSize() > 0) {
			l.getPopUp().click();
		}
		l.getLogin().click(); // driver.findElement(By.css()

	}
	//Subtraction Code
	@And("^Subtract two numbers (.+) and (.+)$")
	public void subtract_two_numbers_and(String value1, String value2) throws Throwable {
		new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
		WebElement canvas = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
		// clicking on 6
		int xOffsetsOfThree = 0;
		int yOffsetsOfThree = 100;
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfThree, yOffsetsOfThree).click().build()
				.perform();

		// clicking on the substract sign (-)
		int xOffsetsOfMinus = 100;
		int yOffsetsOfMinus = 250;
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfMinus, yOffsetsOfMinus).click().build()
				.perform();

		// clicking on 3
		int xOffsetsOfTow = 0;
		int yOffsetsOfTow = 250;
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-xOffsetsOfTow, yOffsetsOfTow).click().build()
				.perform();

		// clicking on equals to sign (=)
		int xOffsetsOfEqual = 275;
		int yOffsetsOfEqual = 420;
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfEqual, yOffsetsOfEqual).click().build()
				.perform();
		
		//clear code
		int xOffsetsOfClear = 275;
		int yOffsetsOfClear = -150;
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfClear, yOffsetsOfClear).click().build()
				.perform();
		
	
		driver.close();
		
	}
	//end of subtraction code
	
	//clear display code
	  @Given("^Clear Calculator display$")
	    public void clear_calculator_display() throws Throwable {
		  
		  System.out.println("Clear button code");
		  new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
			WebElement canvas = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
			int xOffsetsOfClear = 275;
			int yOffsetsOfClear = -150;
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfClear, yOffsetsOfClear).click().build()
					.perform();
			
			driver.close();
	    }

	  
	  @Then("^Divide two numbers$")
	    public void divide_two_numbers() throws Throwable {
			
		  
		  	new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
			WebElement canvas = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
			// clicking on 6
			int xOffsetsOfThree = 0;
			int yOffsetsOfThree = 100;
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfThree, yOffsetsOfThree).click().build()
					.perform();

			// clicking on the divide sign (/)
			int xOffsetsOfDivide = 100;
			int yOffsetsOfDivide = -100;
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfDivide, yOffsetsOfDivide).click().build()
					.perform();

			// clicking on 3
			int xOffsetsOfTow = 0;
			int yOffsetsOfTow = 250;
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-xOffsetsOfTow, yOffsetsOfTow).click().build()
					.perform();

			// clicking on equals to sign (=)
			int xOffsetsOfEqual = 275;
			int yOffsetsOfEqual = 420;
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfEqual, yOffsetsOfEqual).click().build()
					.perform();
			
			//clear code
			int xOffsetsOfClear = 275;
			int yOffsetsOfClear = -150;
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfClear, yOffsetsOfClear).click().build()
					.perform();
			
		
			driver.close();
	  
	  
	  
	  }
	  
	  @Given("^Subtract two negative numbers$")
	  public void subtract_two_negative_numbers() throws Throwable {
	      System.out.println("Subtraction negative cases");
	      
	      new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
			WebElement canvas = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
			// clicking on the subtract sign (-)
						int xOffsetsOfMinus = 100;
						int yOffsetsOfMinus = 250;
						new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfMinus, yOffsetsOfMinus).click().build()
								.perform();
			// clicking on 6
			int xOffsetsOfThree = 0;
			int yOffsetsOfThree = 100;
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfThree, yOffsetsOfThree).click().build()
					.perform();

			// clicking on the substract sign (-)
			int xOffsetsOfMinus1 = 100;
			int yOffsetsOfMinus1 = 250;
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfMinus1, yOffsetsOfMinus1).click().build()
					.perform();
			// clicking on the subtract sign (-)
						int xOffsetsOfMinus2 = 100;
						int yOffsetsOfMinus2 = 250;
						new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfMinus2, yOffsetsOfMinus2).click().build()
								.perform();
			// clicking on 3
			int xOffsetsOfTow = 0;
			int yOffsetsOfTow = 250;
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-xOffsetsOfTow, yOffsetsOfTow).click().build()
					.perform();

			// clicking on equals to sign (=)
			int xOffsetsOfEqual = 275;
			int yOffsetsOfEqual = 420;
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfEqual, yOffsetsOfEqual).click().build()
					.perform();
			
			//clear code
			int xOffsetsOfClear = 275;
			int yOffsetsOfClear = -150;
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfClear, yOffsetsOfClear).click().build()
					.perform();
			
		
			driver.close();
			
		  
		  
	  } 
	  
	  
	 

	    @And("^Subtract one Negative and one Positive numbers$")
	    public void subtract_one_negative_and_one_positive_numbers() throws Throwable {

	    System.out.println("Subtract one Negative and one Positive numbers");
	    
	    new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
		WebElement canvas = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
		// clicking on the subtract sign (-)
					int xOffsetsOfMinus = 100;
					int yOffsetsOfMinus = 250;
					new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfMinus, yOffsetsOfMinus).click().build()
							.perform();
		// clicking on 6
		int xOffsetsOfThree = 0;
		int yOffsetsOfThree = 100;
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfThree, yOffsetsOfThree).click().build()
				.perform();

		// clicking on the substract sign (-)
		int xOffsetsOfMinus1 = 100;
		int yOffsetsOfMinus1 = 250;
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfMinus1, yOffsetsOfMinus1).click().build()
				.perform();
		
		// clicking on 3
		int xOffsetsOfTow = 0;
		int yOffsetsOfTow = 250;
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-xOffsetsOfTow, yOffsetsOfTow).click().build()
				.perform();

		// clicking on equals to sign (=)
		int xOffsetsOfEqual = 275;
		int yOffsetsOfEqual = 420;
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfEqual, yOffsetsOfEqual).click().build()
				.perform();
		
		//clear code
		int xOffsetsOfClear = 275;
		int yOffsetsOfClear = -150;
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfClear, yOffsetsOfClear).click().build()
				.perform();
		
	
		driver.close();
	    
	    
	    }
	  
	    @And("^Subtract zero from a number$")
	    public void subtract_zero_from_a_number() throws Throwable {
	    	System.out.println("Subtract zero from a number");
		    
		    new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
			WebElement canvas = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
			
			// clicking on 3
			int xOffsetsOfThree = 0;
			int yOffsetsOfThree = 250;
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfThree, yOffsetsOfThree).click().build()
					.perform();

			// clicking on the substract sign (-)
			int xOffsetsOfMinus1 = 100;
			int yOffsetsOfMinus1 = 250;
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfMinus1, yOffsetsOfMinus1).click().build()
					.perform();
			
			// clicking on 0
			int xOffsetsOfTow = -275;
			int yOffsetsOfTow = 420;
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-xOffsetsOfTow, yOffsetsOfTow).click().build()
					.perform();

			// clicking on equals to sign (=)
			int xOffsetsOfEqual = 275;
			int yOffsetsOfEqual = 420;
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfEqual, yOffsetsOfEqual).click().build()
					.perform();
			
			
			 
			driver.close();
		    
		    
	    }
	
	    
	    @And("^Divide two negative numbers$")
	    public void divide_two_negative_numbers() throws Throwable {
	    	System.out.println("Divide two negative numbers");
		      
		      new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
				WebElement canvas = new WebDriverWait(driver, 10)
						.until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
				// clicking on the subtract sign (-)
							int xOffsetsOfMinus = 100;
							int yOffsetsOfMinus = 250;
							new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfMinus, yOffsetsOfMinus).click().build()
									.perform();
				// clicking on 6
				int xOffsetsOfThree = 0;
				int yOffsetsOfThree = 100;
				new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfThree, yOffsetsOfThree).click().build()
						.perform();

				// clicking on the divide sign (/)
				int xOffsetsOfMinus1 = 100;
				int yOffsetsOfMinus1 = -100;
				new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfMinus1, yOffsetsOfMinus1).click().build()
						.perform();
				// clicking on the subtract sign (-)
							int xOffsetsOfMinus2 = 100;
							int yOffsetsOfMinus2 = 250;
							new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfMinus2, yOffsetsOfMinus2).click().build()
									.perform();
				// clicking on 3
				int xOffsetsOfTow = 0;
				int yOffsetsOfTow = 250;
				new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-xOffsetsOfTow, yOffsetsOfTow).click().build()
						.perform();

				// clicking on equals to sign (=)
				int xOffsetsOfEqual = 275;
				int yOffsetsOfEqual = 420;
				new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfEqual, yOffsetsOfEqual).click().build()
						.perform();
				
				//clear code
				int xOffsetsOfClear = 275;
				int yOffsetsOfClear = -150;
				new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfClear, yOffsetsOfClear).click().build()
						.perform();
				
			
				driver.close();
	    
	    }
	    
	    
	    @And("^Divide one positive by one negative number$")
	    public void divide_one_positive_by_one_negative_number() throws Throwable {
	    	System.out.println("Divide one positive by one negative number");
		      
		      new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
				WebElement canvas = new WebDriverWait(driver, 10)
						.until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
				
				// clicking on 6
				int xOffsetsOfThree = 0;
				int yOffsetsOfThree = 100;
				new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfThree, yOffsetsOfThree).click().build()
						.perform();

				// clicking on the divide sign (/)
				int xOffsetsOfMinus1 = 100;
				int yOffsetsOfMinus1 = -100;
				new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfMinus1, yOffsetsOfMinus1).click().build()
						.perform();
				// clicking on the subtract sign (-)
							int xOffsetsOfMinus2 = 100;
							int yOffsetsOfMinus2 = 250;
							new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfMinus2, yOffsetsOfMinus2).click().build()
									.perform();
				// clicking on 3
				int xOffsetsOfTow = 0;
				int yOffsetsOfTow = 250;
				new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-xOffsetsOfTow, yOffsetsOfTow).click().build()
						.perform();

				// clicking on equals to sign (=)
				int xOffsetsOfEqual = 275;
				int yOffsetsOfEqual = 420;
				new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfEqual, yOffsetsOfEqual).click().build()
						.perform();
				
				//clear code
				int xOffsetsOfClear = 275;
				int yOffsetsOfClear = -150;
				new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfClear, yOffsetsOfClear).click().build()
						.perform();
				
			
				driver.close();
	    
	    
	    }
	    
	    @And("^Divide number by zero$")
	    public void divide_number_by_zero() throws Throwable {
	    	System.out.println("Divide number by zero");
		      
		      new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
				WebElement canvas = new WebDriverWait(driver, 10)
						.until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
				
				// clicking on 6
				int xOffsetsOfThree = 0;
				int yOffsetsOfThree = 100;
				new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfThree, yOffsetsOfThree).click().build()
						.perform();
				// clicking on the divide sign (/)
				int xOffsetsOfMinus1 = 100;
				int yOffsetsOfMinus1 = -100;
				new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfMinus1, yOffsetsOfMinus1).click().build()
						.perform();
				Thread.sleep(1000);
				// clicking on 0
				int xOffsetsOfTow = -275;
				int yOffsetsOfTow = 420;
				new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-xOffsetsOfTow, yOffsetsOfTow).click().build()
						.perform();

				// clicking on equals to sign (=)
				int xOffsetsOfEqual = 275;
				int yOffsetsOfEqual = 420;
				new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfEqual, yOffsetsOfEqual).click().build()
						.perform();

				//clear code
				int xOffsetsOfClear = 275;
				int yOffsetsOfClear = -150;
				new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(xOffsetsOfClear, yOffsetsOfClear).click().build()
						.perform();
				
			
				driver.close();
	      
	    }
	    
	    
	@Then("^Verify that user is succesfully logged in$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		portalHomePage p = new portalHomePage(driver); 
		Assert.assertTrue(p.getSearchBox().isDisplayed());
	}

	@When("^User enters (.+) and (.+) and logs in$")
	public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
	}

	@And("^close browsers$")
	public void close_browsers() throws Throwable {
		driver.quit();
	}

}
