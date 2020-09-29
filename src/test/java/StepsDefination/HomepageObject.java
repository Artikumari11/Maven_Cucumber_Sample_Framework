package StepsDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageObject {

    private String songs = "xx";

    @FindBy(css="input[id='search']")
    public WebElement search;

    @FindBy(css="input[id='search']")
    public WebElement click;


   void enterSong()
   {
       WebDriver driver = null;
       PageFactory.initElements(driver,HomepageObject.class);
       search.sendKeys(songs);
   }



}
