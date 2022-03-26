package trelloApi.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void BeforeEveryScenario(){
        System.out.println("THE SCENARIO HAS STARTED!");
        // Here we can set up test data
    }

    @After
    public void AfterEveryScenario(){
        System.out.println("THE SCENARIO HAS ENDED");
        //Here we can do cleanup
    }
}
