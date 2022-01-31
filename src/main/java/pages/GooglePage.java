package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;

@DefaultUrl("https://baseUrl/")
public class GooglePage extends PageObject {
    @FindBy(name = "q")
    private WebElementFacade searchTextInput;
    @FindBy(xpath = "//button[@id='L2AGLb']")
    private WebElementFacade acceptButton;
    @FindBy(xpath = "//h3[text()='Introduction - The Serenity BDD Book']")
    private WebElementFacade serenityWebSiteInGooglePage;

    public void setTextInGoogleSearchInput(String text) {
        if (acceptButton.isVisible())
            acceptButton.click();
        searchTextInput.sendKeys(text, Keys.ENTER);
    }

    public boolean isSerenityWebSiteDisplayed() {
        return serenityWebSiteInGooglePage.isVisible();
    }
    public void openSerenityWebSite(){
        serenityWebSiteInGooglePage.click();
    }
}
