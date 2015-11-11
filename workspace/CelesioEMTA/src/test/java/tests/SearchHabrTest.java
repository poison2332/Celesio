package tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import models.DefaultLetter;
import models.SearchRequest;
import models.User;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.pages.Pages;
import requirements.Application;
import steps.SearchSteps;
import utils.CommonUtils;

@RunWith(SerenityRunner.class)
@Issue("CEMTA-35")
@Story(Application.HabrCheck.class)
@WithTag(type = "feature", name = "HabrCheck")
public class SearchHabrTest {
	@Managed
    public WebDriver webdriver;

    @ManagedPages
    public Pages pages;
    
    @Steps
    public SearchSteps searchSteps;

    public SearchRequest request;
    @Before
    public void myTest() throws Exception {
    	request = CommonUtils.createRequest();
        
        webdriver.manage().window().maximize();
        searchSteps.openHabr();
    }
    
    @Test
    @Title("Habr Menu Test")
    public void habrTest() throws InterruptedException {
    	searchSteps.clickOnMenu();
    }
}
