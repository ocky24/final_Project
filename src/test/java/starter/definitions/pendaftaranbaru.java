package starter.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.pendaftaranbarupage;

public class pendaftaranbaru {
   @Steps
   pendaftaranbarupage pendaftaranbaru;
    @Given("admin on new patient registration page")
    public void onNewPatientRegistPage(){
        pendaftaranbaru.onNewPatientPage();
    }
    @When("admin input valid NIK")
    public void inputvalidnik(){
        pendaftaranbaru.inputValidNIK("1146962489785373");
    }
    @And("admin input valid fullname")
    public void inputvalidname(){
        pendaftaranbaru.inputValidName("Baby");
    }
    @And("admin input valid no hp")
    public void inputvalidnumhp(){
        pendaftaranbaru.inputValidNumHP("099512176533");
    }
    @And("admin choose gender")
    public void choosegender(){
        pendaftaranbaru.chooseGender("Perempuan");
    }
    @And("admin choose poli")
    public void choosepoli(){
        pendaftaranbaru.choosePoli("clinic-3");
    }
    @And("admin choose doctor")
    public void choosedoctor(){
        pendaftaranbaru.chooseDoctor("doctor-5");
    }
    @And("admin choose time")
    public void choosetime(){
        pendaftaranbaru.chooseTime("schedule-2");
    }
    @And("admin input keluhan")
    public void inputValidkeluhan(){
        pendaftaranbaru.inputKeluhan("Demam sudah 5 bulan, batuk, linu, sesak nafas");
    }
    @Then("Admin click confirmation button")
    public void clickConfirmButton(){
        pendaftaranbaru.clickConfirm();
    }
    @And("new patient registered succesfully")
    public void registsukses(){
        pendaftaranbaru.validateSuccess();
    }
//    @When("admin input invalid NIK")
//    public void inputinvalidNIK(){
//
//    }
//    @And("error notification NIK")
//    public void errornotificationNIK(){
//
//    }

}
