package Marathon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		// url
		driver.get("https://www.amazon.in/");

		// maximize
		driver.manage().window().maximize();

		// wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// searchfile"bag"
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");

		// in the result (bags for boys)

		driver.findElement(By.xpath("//span[text()=' for boys']")).click();

		// number of results (like 50000)1-48 of over 50,000 results for "bags for boys"

		String TotalC = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"))
				.getText();

		System.out.println(TotalC);

		// Select the first 2 brands in the left menu American
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();

		// Choose New Arrivals (Sort)

		driver.findElement(By.id("a-autoid-0")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();

		// Print the first resulting bag info (name, discounted price)

		String Result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"))
				.getText();
		System.out.println(Result);

		// get title
		driver.getTitle();
		// close
		driver.close();

	}
}