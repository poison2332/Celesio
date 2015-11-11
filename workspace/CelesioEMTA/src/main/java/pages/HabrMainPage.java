package pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://habrahabr.ru/")
public class HabrMainPage extends PageObject {
	 @FindBy(how = How.XPATH, using = ".//*[@id='navbar']/div[1]/a[2]/span")
	    private WebElement menuLink;
	 
	 
	 public HabrMainPage(WebDriver webDriver) {
	        super(webDriver);
	        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    }
	 
	 public HabrMainPage clickOnMenuLink(){
		 menuLink.click();
		 return this;
	 }
}
