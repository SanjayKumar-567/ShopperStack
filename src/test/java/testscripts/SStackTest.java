
package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SStackTest {
           @Test
	      public void setup() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("sukaramkarunanithi@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sukaram@1013");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("//div[text()='s']")).click();
		driver.findElement(By.xpath("//*[@role='menu']//li[1]")).click();
		driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
		driver.findElement(By.xpath("//button[text()='Add Address']")).click();
		driver.findElement(By.xpath("//input[@id='Other']")).click();
		driver.findElement(By.xpath("//input[@id='Address type']")).sendKeys("dummy addres");
		driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("sanjay kumar");
		driver.findElement(By.xpath("//input[@id='House/Office Info']")).sendKeys("plot no 10");
		driver.findElement(By.xpath("//input[@id='Street Info']")).sendKeys("subramaniya nagar");
		driver.findElement(By.xpath("//input[@id='Landmark']")).sendKeys("backside airtel showroom");

		WebElement country = driver.findElement(By.xpath("//select[@id='Country']"));
		Select slt = new Select(country);
		slt.selectByVisibleText("India");

		WebElement state = driver.findElement(By.xpath("//select[@id='State']"));
		Select slt1 = new Select(state);
		
		slt1.selectByVisibleText("Tamil Nadu");
		
		WebElement city = driver.findElement(By.xpath("//select[@id='City']"));
		city.sendKeys("Chennai");
		
		driver.findElement(By.xpath("//input[@id='Pincode']")).sendKeys("600091");
		driver.findElement(By.xpath("//input[@id='Phone Number']")).sendKeys("9500112497");
		driver.findElement(By.xpath("//button[@id='addAddress']")).click();
		driver.findElement(By.xpath("//*[@id=\"editaddress_fl\"]")).click();
		driver.findElement(By.xpath("//*[@id='Office']")).click();
		WebElement name= driver.findElement(By.xpath("//input[@id='Name']"));
		name.sendKeys(Keys.CONTROL + "a");
		name.sendKeys(Keys.BACK_SPACE);
		name.sendKeys("sukaram");
		driver.findElement(By.id("Update Address")).click();

	driver.findElement(By.xpath("//*[@id=\"root\"]/section[2]/div/section/div/div[2]/div[1]/div[2]/div/button")).click();

driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]")).click();
System.out.println("Jenkins + Maven demo test executed successfully..........");
	      System.out.println("all set");

	}

}
