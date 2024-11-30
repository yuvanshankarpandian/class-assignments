package hw;

	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AjioUsingList {

		public static void main(String[] args) throws InterruptedException {
			
			
			ChromeDriver driver= new ChromeDriver();
			
			
			driver.manage().window().maximize();
			
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			driver.get("https://www.ajio.com/");
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("watch");
			
			
			driver.findElement(By.xpath("//span[@class='ic-search'][1]")).click();
		
			
			WebElement chk=driver.findElement(By.xpath("//label[contains(text(),'Men')]"));
			chk.click();
			chk.isSelected();
			Thread.sleep(1000);
		
			
			WebElement chk1=driver.findElement(By.xpath("//label[contains(text(),'Fashion watch')]"));
			chk1.click();
			chk1.isSelected();
			Thread.sleep(1000);
			
			
			WebElement bt = driver.findElement(By.xpath("//div[@class='length']"));
			String brandItems = bt.getText();
			System.out.println(" Total No.of Brand Items: " +brandItems);
		
			
			Thread.sleep(1000);
			List<WebElement> listofbrand=driver.findElements(By.tagName("brand"));
			float lb=listofbrand.size();
			System.out.println("List of Brand is:"+lb);
			for(int i = 0;i<listofbrand.size();i++)
			{
		
				System.out.println(listofbrand.get(i).getText());
			}
			Thread.sleep(1000);
			
			
			List<WebElement> bagname=driver.findElements(By.className("nameCls"));
			int bgn=bagname.size();
			System.out.println("BagNames are:"+bgn);
			for(int i = 0;i<bagname.size();i++)
			{
		
				System.out.println(bagname.get(i).getText());
			}
		}
		}

	