package com.example.mongo;

import com.example.mongo.utilities.TestGame;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class MyStepdefs {

    private TestGame testGame;
    private int result;

    @Given("^TestGame is instantiated$")
    public void testgameIsInstantiated() {
        testGame = new TestGame();
    }

    @When("^I play with <number> (\\d+)$")
    public void iPlayWithNumber(int arg0) {
        result = testGame.test(arg0);
    }

    @Then("^The <result> was number (\\d+)$")
    public void theResultWasNumber(int arg0) {
        assertEquals(arg0,result);
    }
}
