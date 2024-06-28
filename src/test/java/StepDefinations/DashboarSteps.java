package StepDefinations;

import Factory.PlaywrightFactory;
import Pages.Dashboard;
import Utils.EventsUtils;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.EventListener;

public class DashboarSteps {
    public Dashboard dashboard = new Dashboard(PlaywrightFactory.getPage());
    public EventsUtils eventsUtils = new EventsUtils(PlaywrightFactory.getPage());

    @When("user verify Home Page title {string}")
    public void user_verify_home_page_title(String string) {
        Assert.assertEquals(dashboard.getPageHeader(), string);
    }

    @Then("user logout from application")
    public void userLogoutFromApplication() {
        dashboard.user_logout();
    }

    @When("user click on Admin section")
    public void userClickOnAdminSection() {
        dashboard.go_adminSection();
      Assert.assertEquals("Admin", dashboard.getSectionHeader());
    }


}
