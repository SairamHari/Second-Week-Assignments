package Selenium_1_Basics_Home_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Account_testleaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.out.println("Creatin an Account TestLeaf");
       
       ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		//driver.get("http://leaftaps.com/opentaps/control/main");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//Thread.sleep(500);
		
		//driver.findElement(By.partiallinkText("CRM/SFA")).click();
		
		//driver.findElement(By.partialLinkText("SFA")).click();
		
		//driver.findElement(By.xpath("//a[@href='http://leaftaps.com/crmsfa/control/main?externalLoginKey=EL817121385025']")).click();
		
		driver.get("http://leaftaps.com/crmsfa/control/main?externalLoginKey=EL817121385025");
		
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		
		driver.findElement(By.xpath("//a[text()=\"Create Account\"]")).click();
		
		
		
		
		Thread.sleep(500);
		
		driver.close();
       
		
	}

}
