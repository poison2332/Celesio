package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.GmailHomePage;
import pages.GmailLoginPage;



import static org.hamcrest.MatcherAssert.assertThat;



public class LetterSteps extends ScenarioSteps {
    protected static final Logger log = LoggerFactory.getLogger(LetterSteps.class);

    @Step
    public void login(String email, String password, String userName){
        gmailLoginPage().setEmail(email);
        gmailLoginPage().clickNextButton();
        gmailLoginPage().setPassword(password);
        gmailLoginPage().signIn();
        log.info("Test Logger");
        assertThat("User name from page " + gmailHomePage().getUserName() + " is different from model " + userName, gmailHomePage().getUserName().equals(userName));
    }

    @Step
    public void openLetter(String letterSender){
        gmailHomePage().clickOnLetter(letterSender);
    }

    @Step
    public void checkLetterContent(String letterSender, String letterContent, String letterTitle){
        assertThat("Letter content from page " + gmailHomePage().getLetterContent() + " is different from model " + letterContent, gmailHomePage().getLetterContent().equals(letterContent));
        assertThat("Letter sender from page " + gmailHomePage().getLetterSender() + " is different from model " + letterSender, gmailHomePage().getLetterSender().equals(letterSender));
        assertThat("Letter title from page " + gmailHomePage().getLetterTitle() + " is different from model " + letterTitle + letterSender, gmailHomePage().getLetterTitle().equals(letterTitle));
    }

    private GmailHomePage gmailHomePage() {return getPages().currentPageAt(GmailHomePage.class);
    }

    private GmailLoginPage gmailLoginPage() {return getPages().currentPageAt(GmailLoginPage.class);
    }

    @Step("Open Gmail Page Step")
    public void openGmail() {
        gmailLoginPage().open();
    }
}
