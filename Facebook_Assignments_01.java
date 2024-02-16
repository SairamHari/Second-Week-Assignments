package Selenium_1_Basics_Home_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Assignments_01 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("FaceBook_Assignments");
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/");
    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raja");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Raja");
			
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Raja@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12345");
		
	    Select date = new Select(driver.findElement(By.id("day")));
	    
	    date.selectByVisibleText("17");
	    
	    Select month = new Select(driver.findElement(By.id("month")));
	    
	    month.selectByVisibleText("Aug");
	    
	    Select year = new Select(driver.findElement(By.id("year")));
	    
	    year.selectByVisibleText("2000");
	    
	    driver.findElement(By.xpath("//input[@value='2']")).click();
	    
	    
	    
	    
	    
	    
		
		
				
		
		
	}

}
