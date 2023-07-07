package Marathon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		// url
		driver.get("https://www.abhibus.com/");

		// maximize
		driver.manage().window().maximize();

		// wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Click Bus
		driver.findElement(By.xpath("(//a[text()='Bus'])[2]")).click();

		// Type "Chennai" in the FROM text box
		driver.findElement(By.id("source")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();

		// Type "Banglore" in the FROM text box
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();

		// Type "Date"
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("//a[text()='8']")).click();

		// search
		driver.findElement(By.xpath("//a[text()='Search']")).click();

		// Print the name of the first resulting bus (use .getText())
		// (//*[@class=\"col2 column-middle\"])[1]
		String busname = driver.findElement(By.xpath("(//h2[@class=\"TravelAgntNm ng-binding\"])[1]")).getText();
		System.out.println("Printing list first bus name " + busname);

		// Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.id("Bustypes4")).click();

		// Print the first resulting bus seat count
		driver.findElement(By.xpath("(//span[text()='Select Seat'])[1]")).click();

		String Seatcount = driver.findElement(By.xpath("(//*[contains(text(),'  Seats Available ')])[1]")).getText();
		System.out.println("Printing Current seat count" + Seatcount);

		// Click SelectSeat
		driver.findElement(By.xpath("(//a[@class='tooltip tooltipstered'])[*]")).click();

		driver.findElement(By.xpath("//*[@class=\"jurnydetails\"]")).click();

		String Seat = driver.findElement(By.xpath("//*[text()='DU5']")).getText();

		String Fare = driver.findElement(By.id("ticketfare")).getText();

		System.out.println(" ");
		System.out.println("Printing details  " + Seat + " Fare details " + Fare);

		// Origin /destination

		String origin = driver.findElement(By.xpath("(//*[text()=\"Chennai\"])[2]")).getText();

		String destination = driver.findElement(By.xpath("//*[text()=\"Bengaluru\"]")).getText();

		String Date = driver.findElement(By.xpath("(//*[text()=\"8 July, 2023\"])[2]")).getText();

		System.out.println();

		System.out.println("" + origin + "   " + destination + "     " + Date);

		// Get the Title of the page(use .getTitle())
		String title = driver.findElement(By.xpath("(//*[text()=\"8 July, 2023\"])[2]")).getText();
		System.out.println("current title " + title);

		// close
		driver.close();
	}

}
