package pages;
 
public class PaginaCursos extends BasePage {
 
    private String fundamentosTestingLink = "//div[@class='header__nav-item']//a[@class='header__nav-item-link'][normalize-space()='Gustavo Petro']";
 
    public PaginaCursos() {
        super(driver);
    }
 
    public void clickFundamentosTestingLink() {
        clickElement(fundamentosTestingLink);
    }
 
}