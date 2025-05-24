package steps;

import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaFundamentosTestings;
import pages.PaginaPrincipal;

public class FreeRangeTestersSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTestings fundamentosPage = new PaginaFundamentosTestings();
    
    @Given("I navigate to www.cnnespanol.cnn.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }
 
    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }
 
    @And("select Gustavo Petro")
    public void navigateToIntro() {
        cursosPage.clickFundamentosTestingLink();
 
    }
}
