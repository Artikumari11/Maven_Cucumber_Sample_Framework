package StepsDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Logintoyoutube {
    WebDriver driver;


    @Given("^Open THe chrome bowser$")
    public void open_the_youtbe()  {
        System. setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       // Alert alert=driver.switchTo().alert();
        driver.findElement(By.cssSelector("div#dismiss-button")).click();
        driver.switchTo().frame("iframe");
        driver.findElement(By.cssSelector("div#introAgreeButton span:nth-child(1)")).click();
        driver.switchTo().parentFrame();


    }


    @When("^Search songs$")
    public void enter_the_songs() {
        driver.findElement(By.cssSelector("input[id='search']")).sendKeys("dil se re");
        driver.findElement(By.cssSelector("button#search-icon-legacy")).click();
        List<WebElement> songs= driver.findElements(By.cssSelector("#metadata-line > span:nth-child(1)"));



for(int i=0;i<songs.size();i++){
    System.out.println(songs.get(i).getText());

}
    }
    @When("^click on first song$")
    public void click_on_first_songs() {
        driver.findElements(By.cssSelector("div#dismissable a#video-title")).get(0).click();
        driver.findElement(By.cssSelector("div[class*='skip-button-slot'] button")).click();
    }


}
