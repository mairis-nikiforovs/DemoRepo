package trelloApi.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrelloSteps {

    @Given("The test board exists and contains correct information")
    public void checkBoardExists(){
        System.out.println("Check that board exists...");
    }

    @When("I change the board name to {string}")
    public void updateBoardName(String name){
        System.out.println("We update the board name to " + name);
    }

    @And("I check that the board name was successfully updated to {string}")
    public void checkIfBoardUpdated(String name){
        System.out.println("We check that the board name was updated");
    }

    @Then("I add a list with title {string} to the board")
    public void addNewList(String name){
        System.out.println("We add a new List with name " + name);
    }
}
