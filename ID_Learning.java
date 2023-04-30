package Demo3;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ID_Learning {
	
		public static void main(String[] args) {
		
			//for loop
			//initialization;condition check;incremenet
			for(int i=1;i<=2;i++)
			{
			//parameterize
			
			Scanner input=new Scanner(System.in);
			
			System.out.println("Enter the Amount");
			String Amount = input.next();
			
			System.out.println("Enter the Interest");
			String Interest = input.next();
			
			System.out.println("Enter the Tenure");
			String Tenure=input.next();
			
			System.out.println("Enter the Expected Result");
			String Expected_Result=input.next();
			
			//String Expected_Result="222.44";
			
			//Launch the browser
			//interface reference variabl=object
			WebDriver browser= new FirefoxDriver();
					
			//enter the url
			browser.get("http://www.unionbankofindia.co.in/EMICal.aspx");
			browser.manage().window().maximize();
			
			//Identify loan amount element and enter the values
			WebElement loanamount_txtbox=browser.findElement(By.id("loanamount"));
			loanamount_txtbox.sendKeys(Amount);
			
			//Identify Interest element and enter the values
			WebElement Rate_txtbox=browser.findElement(By.id("rate"));
			Rate_txtbox.sendKeys(Interest);
			
			//Identify Tenure and enter the values
			WebElement Tenure_txtbox=browser.findElement(By.id("pmonths"));
			Tenure_txtbox.sendKeys(Tenure);
			
			//Identify calc btn and click on the button
			WebElement Calc_btn=browser.findElement(By.id("Button1"));
			Calc_btn.click();
			
			//Identify and retrive the output EMI
			WebElement EMI_Output=browser.findElement(By.id("EMI"));
			String Actual_Result = EMI_Output.getAttribute("value");
			
			System.out.println("Actual Result is  "+Actual_Result);
			System.out.println("Expected Result is  "+Expected_Result);
			
			//Vaidation
			if(Actual_Result.equals(Expected_Result))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			
			//close the browser
		
			browser.close();
			}
		
	}
	

}
