package steps;

import pages.GooglePage;

public class GoogleSteps {
    private GooglePage googlePage;

    public void openGooglePage() {
        googlePage.open();
    }

    public void searchForText(String text) {
        googlePage.setTextInGoogleSearchInput(text);
    }

    public boolean isSerenityWebSiteDisplayed() {
        return googlePage.isSerenityWebSiteDisplayed();
    }

    public void openSerenityWebSite() {
        googlePage.openSerenityWebSite();
    }
}
