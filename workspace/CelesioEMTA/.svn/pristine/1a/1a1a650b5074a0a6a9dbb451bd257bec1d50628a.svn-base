package tests;


import models.DefaultLetter;
import models.User;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import net.thucydides.core.pages.Pages;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import requirements.Application;
import steps.LetterSteps;
import utils.CommonUtils;

@RunWith(SerenityRunner.class)
@Issue("CEMTA-35")
@Story(Application.GmailLetterCheck.LetterCheck.class)
@WithTag(type = "feature", name = "GmailTests")
public class GmailLoginTest {

    @Managed
    public WebDriver webdriver;

    @ManagedPages
    public Pages pages;

    @Steps
    public LetterSteps letterSteps;

    public User user;
    public DefaultLetter letter;

    @Before
    public void myTest() throws Exception {
        letter = CommonUtils.createDefaultLetter();
        user = CommonUtils.createNewUser();
        webdriver.manage().window().maximize();
        letterSteps.openGmail();
    }

    @Test
    @Title("Login to Gmail")
    public void LoginTest() throws InterruptedException {
        letterSteps.login(user.getLogin(), user.getPassword(), user.getUserName());
    }

    @Test
    @Title("CheckingLetter")
    public void CheckingLetter() {
        letterSteps.login(user.getLogin(), user.getPassword(), user.getUserName());
        letterSteps.openLetter(letter.getSender());
        letterSteps.checkLetterContent(letter.getSender(), letter.getContent(), letter.getTitle());
    }


}
