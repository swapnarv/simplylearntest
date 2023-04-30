package Demo4;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class name_learning {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=2;i++)
		{
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the Search item");
		String Search_Item = input.next();
		
		System.out.println("Enter the Expected Result");
		String Expected_Result=input.next();		
		
		
		//String Expected_Result="78,00,000";
		
		//launch and open
		WebDriver browser=new FirefoxDriver();
		browser.get("http://www.bing.com/");
		browser.manage().window().maximize();
		
		//identify serach txtbox and enter the values
		WebElement Search_txtbox=browser.findElement(By.id("sb_form_q"));
		Search_txtbox.sendKeys(Search_Item);
		
		//identify search btn and click
		WebElement Search_btn=browser.findElement(By.id("sb_form_go"));
		Search_btn.click();
		
		//identify element and get the output
		WebElement Result_txt=browser.findElement(By.className("sb_count"));
		String Output = Result_txt.getText();
		String Actual_Result = Output.split(" ")[0];
		
		System.out.println("Actual Result is  "+Actual_Result);
		System.out.println("Expected Result is  "+Expected_Result);
			
		
		//validate
		
		if(Actual_Result.equals(Expected_Result))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		//close
		browser.close();
		
		}
	}
	

}
