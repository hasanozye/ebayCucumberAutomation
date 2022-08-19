package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EbayPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class EbayStepDefinitions {

    EbayPage ebayPage = new EbayPage();

    @Given("user goes to Ebay Landing Page")
    public void user_goes_to_ebay_landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("ebayURL"));
    }

    @Given("searches for real guns")
    public void searches_for_real_guns() {
        ebayPage.searchBox.sendKeys("real guns", Keys.ENTER);
    }

    @Then("sees if results contains real guns")
    public void sees_if_results_contains_real_guns() {
        Assert.assertTrue(ebayPage.results.getText().contains("real guns"));
    }

    @Given("searches for sharp knives")
    public void searches_for_sharp_knives() {
        ebayPage.searchBox.sendKeys("shatp knives", Keys.ENTER);
    }

    @Then("sees if results contains sharp knives")
    public void sees_if_results_contains_sharp_knives() {
        Assert.assertTrue(ebayPage.results.getText().contains("sharp knives"));

    }

    @Given("searches for flashbang bombs")
    public void searches_for_flashbang_bombs() {
        ebayPage.searchBox.sendKeys("flashbang bombs", Keys.ENTER);
    }

    @Then("sees if results contains flashbang bombs")
    public void sees_if_results_contains_flashbang_bombs() {
        Assert.assertTrue(ebayPage.results.getText().contains("flashbang"));
    }


}
