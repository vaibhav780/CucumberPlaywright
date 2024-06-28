package StepDefinations;

import Factory.PlaywrightFactory;
import Pages.Admin;
import io.cucumber.java.en.When;

public class AdminStep {
    public Admin admin = new Admin(PlaywrightFactory.getPage());


    @When("user click on add button")
    public void userClickOnAddButton() {
        admin.Click_add();
    }

}
