package steps;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;

public class PaginaPrincipalSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();

    @Given("I navigate to {string}")
    public void iNavigateTo(String url) {
        landingPage.navigateTo(url);
    }

    @When("I go to a section using the navigation bar")
    public void navigationBarUse() {
        landingPage.clickOnSectionNavigationBar();
    }
}
