package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import steps.GoogleSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleStepDefinitions {
    @Steps
    GoogleSteps googleSteps;

    @Given("^I am on google page$")
    public void openGooglePage() {
        googleSteps.openGooglePage();
    }

    @When("^I search for '(.*)'$")
    public void searchForText(String text) {
        googleSteps.searchForText(text);
    }

    @Then("^The serenity website is displayed in search result$")
    public void checkSerenityWebSite() {
        assertThat(googleSteps.isSerenityWebSiteDisplayed()).as("Serenity website should be displayed in search result but it was not").isTrue();
    }

    @When("^I open the first search result$")
    public void openSerenityWebSite() {
        googleSteps.openSerenityWebSite();
    }




}
