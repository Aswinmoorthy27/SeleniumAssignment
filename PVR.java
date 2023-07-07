package Marathon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVR {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		// url
		driver.get("https://www.pvrcinemas.com/");

		// maximize
		driver.manage().window().maximize();

		// wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// click movietext lib
		driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();

		// Select the City

		driver.findElement(By.name("city")).click();
		Select sel = new Select(driver.findElement(By.name("city")));
		sel.selectByVisibleText("Chennai");

		// Select the Genre

		driver.findElement(By.name("genre")).click();
		Select genre = new Select(driver.findElement(By.name("genre")));
		genre.selectByVisibleText("ANIMATION");

		// Select the Lanuage

		driver.findElement(By.name("lang")).click();
		Select lang = new Select(driver.findElement(By.name("lang")));
		lang.selectByVisibleText("ENGLISH");

		// click on apply
		driver.findElement(By.xpath("//button[text()='Apply']")).click();

		// Click on first resulting animation movie
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='movie-list']/div[1]/img")).click();

		// proceed
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();

		// Required fields
		// cinema
		driver.findElement(By.name("cinemaName")).click();
		Select Cinema = new Select(driver.findElement(By.name("cinemaName")));
		Cinema.selectByVisibleText("PVR Heritage RSL ECR Chennai");

		// show timing
		driver.findElement(By.name("timings")).click();
		Select Timing = new Select(driver.findElement(By.name("timings")));
		Timing.selectByIndex(2);

		// date
		driver.findElement(By.name("text")).click();
		driver.findElement(By.xpath("//span[text()='9']")).click();

		// Name
		driver.findElement(By.name("name")).sendKeys("Aswin");

		// email
		driver.findElement(By.name("email")).sendKeys("Ashwinmoorthy27@gmail.com");

		// Mobile
		driver.findElement(By.name("mobile")).sendKeys("9789189002");

		// Food
		driver.findElement(By.name("food")).sendKeys("Burger");

		driver.findElement(By.name("comment")).sendKeys("Pepsi");

		// copy
		driver.findElement(By.xpath("//input[@name='copySelf']")).click();

		// Send request
		driver.findElement(By.xpath("//input[@name='copySelf']")).click();

		// cancel
		driver.findElement(By.xpath("(//*[@class='btn already-member'])[2]")).click();

		// close popup
		driver.findElement(By.name("button")).click();

		// close
		driver.close();

	}
}
