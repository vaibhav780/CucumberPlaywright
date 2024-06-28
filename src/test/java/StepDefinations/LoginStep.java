package StepDefinations;

import Pages.LoginPage;
import Factory.PlaywrightFactory;
import Utils.EventsUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStep {
    public LoginPage loginPage=  new LoginPage(PlaywrightFactory.getPage());
    public EventsUtils eventsUtils = new EventsUtils(PlaywrightFactory.getPage());
    @Given("user launched application")
    public void user_launched_application() {
        System.out.println("launched");

    }

    @When("user logged in with username {string} and {string}")
    public void user_logged_in_with_username_and(String string, String string2) {
        loginPage.doLogin(string,string2);
    }

    @When("user verify Login Page title {string}")
    public void userVerifyLoginPageTitle(String arg0) {
        Assert.assertEquals(arg0,loginPage.getPageHead());
    }
}
