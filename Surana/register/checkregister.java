package register;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class checkregister {
	
	public static void main(String[] args) throws InterruptedException  {

		System.out.println("Starting RegisterTest");
		System.out.println("Starting Register");
		
//		Create driver
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		open Website
		String url = "https://touchalife.hk/corporate";
		driver.get(url);
		System.out.println("Page is opened.");
		sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
	//  Add Company Name
		WebElement cname = driver.findElement(By.id("bp_crop_name"));
		cname.sendKeys("abc");
		System.out.println("Company Name is added.");
		
	//  Add Country Name	
		Select drpCountry = new Select(driver.findElement(By.name("bp_country")));
		drpCountry.selectByVisibleText("India");
		System.out.println("Country Name is added.");
		
	//  Add User First Name
		WebElement username = driver.findElement(By.id("bp_fname"));
		username.sendKeys("abc");
		System.out.println("First Name is added.");
		
	//  Add User Middle Name
		WebElement username1 = driver.findElement(By.id("bp_mname"));
		username1.sendKeys("abc");
		System.out.println("second Name is added.");
		
	//  Add User Last Name
		WebElement username2 = driver.findElement(By.id("bp_lname"));
		username2.sendKeys("abc");
		System.out.println("Last Name is added.");
		
	//  Add user mobile Name
		WebElement mobile = driver.findElement(By.id("bp_mobile_no"));
		mobile.sendKeys("1111111111");
		System.out.println("Mobile No is added.");
		
	//  Add user telephone Name
		WebElement tele = driver.findElement(By.id("bp_telephone_no"));
		tele.sendKeys("1111111111");
		System.out.println("Telephone No is added.");
		
	//  Add Gender	
		Select gender = new Select(driver.findElement(By.name("bp_gender")));
		gender.selectByVisibleText("Male");
		System.out.println("Gender is added.");
		
	//  Add EMail
		WebElement email = driver.findElement(By.id("bp_email"));
		email.sendKeys("kandivora95@gmail.com");
		System.out.println("Email is added.");
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(6000);
		
		WebElement dia = driver.findElement(By.cssSelector("align-right secondary slidedown-button"));
		dia.click();
		
	
	//  Add Agree Button
		WebElement agree = driver.findElement(By.name("bp_agree"));
		if (agree.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }
		System.out.println("Agree Button is clicked.");
		agree.click();
		
		
		
	//  Add Submit	
		WebElement Submit = driver.findElement(By.name("ngo_add"));
		Submit.click();
		System.out.println("Submit Button is clicked.");
		driver.quit();
	}


	  private static void sleep(long m) { try { Thread.sleep(m); } catch
	  (InterruptedException e) { // TODO Auto-generated catch block
	  e.printStackTrace(); } }
	 
	}
