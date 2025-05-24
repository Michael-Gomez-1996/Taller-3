package pages;

public class PaginaPrincipal extends BasePage {

    private String sectionLink = "//a[normalize-space()='Colombia']";

    public PaginaPrincipal() {
        super(driver);
    }

    public void navigateToCnnEspanol() {
        navigateTo("https://cnnespanol.cnn.com/");
    }

    public void clickOnSectionNavigationBar(){
        clickElement(sectionLink);
    }
    
}
