package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.thucydides.core.annotations.Steps;
import starter.pages.pasienlamapage;

public class pasienlama {
    @Steps
    pasienlamapage pendaftaranlama;


    @Given("admin on patient registration page")
   public void onpatientregistpage(){
       pendaftaranlama.onoldregist();
   }
   @When("admin input valid id patient")
   public void inputvalididpatient(){
        pendaftaranlama.inputvalididpatient("patient-w_llu");
   }
    @And("patient's data autofilled")
    public void patientdataautofilled() {
        pendaftaranlama.norekfield("record-w_llu-3517092818769843");
    }

    @When("admin input invalid id patient")
    public void inputinvalididpatient(){
        pendaftaranlama.inputvalididpatient("patient_222");
    }

    @Then("patient's data still empty")
    public void dataempty(){
        pendaftaranlama.norekfield("");
    }
}
