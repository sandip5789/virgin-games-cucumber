package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSteps {
    @When("I click on accept cookies")
    public void iClickOnAcceptCookies() {
        new HomePage().clickAcceptCookies();

    }

    @Then("I should see Virgin Games logo on homepage")
    public void iShouldSeeVirginGamesLogoOnHomepage() {
        Assert.assertTrue(new HomePage().verifyVirginGamesLogo());
    }

    @And("I mouse hoover on Login button")
    public void iMouseHooverOnLoginButton() {
        new HomePage().mouseHooverOnLogin();
    }

    @Then("I click on all {string}")
    public void iClickOnAll(String headers) {
        new HomePage().clickOnAllHeaders(headers);
    }

}

