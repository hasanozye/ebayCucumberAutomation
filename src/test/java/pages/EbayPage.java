package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbayPage {

    public EbayPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy (xpath = "//input[@class=\"gh-tb ui-autocomplete-input\"]")
    public WebElement searchBox;

    @FindBy (xpath = "//h1[@class=\"srp-controls__count-heading\"]")
    public WebElement results;







}
