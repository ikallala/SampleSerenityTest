package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import steps.SerenityWebsiteSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class SerenityWebsiteStepDefinitions {
    @Steps
    private SerenityWebsiteSteps serenityWebsiteSteps;

    @When("^I select to learn '(.*)'$")
    public void selectCourse(String course) {
        Serenity.setSessionVariable("course").to(course);
        serenityWebsiteSteps.selectCourse(course);
        System.out.println("course");
    }

    @Then("^Serenity website is opened$")
    public void checkWebsite() {
        assertThat(Serenity.getWebdriverManager().getCurrentDriver().getTitle().equals("Wrong title")).as("Serenity website should be opened but was not").isTrue();
    }

    @Then("The selected course is displayed")
    public void checkCourseOpened() {
        String course = Serenity.sessionVariableCalled("course");
        assertThat(serenityWebsiteSteps.isCourseOpened(course)).as(String.format("The course %s should be displayed but it was not", course)).isTrue();
    }
}
