package steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.GmailLoginPage;
import pages.HabrMainPage;

public class SearchSteps extends ScenarioSteps{
	protected static final Logger log = LoggerFactory.getLogger(LetterSteps.class);
	 private HabrMainPage habrMainPage() {return getPages().currentPageAt(HabrMainPage.class);
	    }
	 @Step
	 public void clickOnMenu(){
		 habrMainPage().clickOnMenuLink();
	 }
	 @Step("Open habr Page Step")
	    public void openHabr() {
	        habrMainPage().open();
	    }
}
