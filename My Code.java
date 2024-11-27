import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ABC {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fitpeo.com");
		driver.manage().window().maximize();
		System.out.println("Application open successfully......");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();

		Actions ac=new Actions(driver);

		WebElement slider=driver.findElement(By.xpath("//p[text()='CPT-99453']"));
		ac.scrollToElement(slider).perform();

		driver.findElement(By.xpath("//input[@id=':r0:']")).click();
		Thread.sleep(1000);
		ac.sendKeys(driver.findElement(By.xpath("//input[@id=':r0:']")),Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=':r0:']")).sendKeys("560");


		driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']/div[1]/label/span[1]/input")).click();
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']/div[2]/label/span[1]/input")).click();
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']/div[3]/label/span[1]/input")).click();
		driver.findElement(By.xpath("//div[@class='MuiBox-root css-1p19z09']/div[8]/label/span[1]/input")).click();



	}

}
