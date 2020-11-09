package register;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class excelregister {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			
		File src =new File("Excel/TD.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		String data2=sheet1.getRow(0).getCell(2).getStringCellValue();
		String data3=sheet1.getRow(0).getCell(3).getStringCellValue();
		String data4=sheet1.getRow(0).getCell(4).getStringCellValue();
		//String data5=sheet1.getRow(0).getCell(5).getStringCellValue();
		//String data6=sheet1.getRow(0).getCell(6).getStringCellValue();
		String data7=sheet1.getRow(0).getCell(7).getStringCellValue();
		String data8=sheet1.getRow(0).getCell(8).getStringCellValue();

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
		cname.sendKeys(data0);
		System.out.println("Company Name is added.");
		
	//  Add Country Name	
		Select drpCountry = new Select(driver.findElement(By.name("bp_country")));
		drpCountry.selectByVisibleText(data1);
		System.out.println("Country Name is added.");
		
	//  Add User First Name
		WebElement username = driver.findElement(By.id("bp_fname"));
		username.sendKeys(data2);
		System.out.println("First Name is added.");
		
	//  Add User Middle Name
		WebElement username1 = driver.findElement(By.id("bp_mname"));
		username1.sendKeys(data3);
		System.out.println("second Name is added.");
		
	//  Add User Last Name
		WebElement username2 = driver.findElement(By.id("bp_lname"));
		username2.sendKeys(data4);
		System.out.println("Last Name is added.");
		
	//  Add user mobile Name
		WebElement mobile = driver.findElement(By.id("bp_mobile_no"));
		mobile.sendKeys("11111111111");
		System.out.println("Mobile No is added.");
		
	//  Add user telephone Name
		WebElement tele = driver.findElement(By.id("bp_telephone_no"));
		tele.sendKeys("11111111111");
		System.out.println("Telephone No is added.");
		
	//  Add Gender	
		Select gender = new Select(driver.findElement(By.name("bp_gender")));
		gender.selectByVisibleText(data7);
		System.out.println("Gender is added.");
		
	//  Add EMail
		WebElement email = driver.findElement(By.id("bp_email"));
		email.sendKeys(data8);
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
