package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import static pages.Topky.*;

public class TopkySteps {
    @Given("^I am on topky$")
    public void i_am_on_topky() throws Throwable {
    click_agree_and_assert_url();
    }


    @Then("^I will click anywhere$")
    public void i_will_click_anywhere() throws Throwable {
        click_on_Prominenti();
    }


}
