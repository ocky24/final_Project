package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class pendaftaranbarupage extends PageObject {
    private By onNewPatientRegistPage() { return By.xpath("//label[normalize-space()='NIK']");}
    private By inputFieldNIK(){return By.id("nik");}
    private By inputFieldName(){return By.id("name");}
    private By inputFieldNumHP(){return By.id("no");}
    private By dropdownGender(){return By.xpath("//select[@id='sex']");}
    private By dropdownpolimata(){return By.xpath("//select[@id='poli']");}
    private By dropdowndoctor(){return By.xpath("//select[@id='dokter']");}
    private By time(){return By.xpath("//select[@id='time']");}
    private By keluhanField(){return By.id("keluhan");}
    private By ConfirmButton(){return By.xpath("//button[@class='btnDaftarPasien btn btn-primary btn-block mt-4']");}
    private By registSuccess(){return By.xpath("//strong[normalize-space()='PENDAFTARAN BERHASIL']");}

    @Step
    public void onNewPatientPage(){$(onNewPatientRegistPage()).isDisplayed();}

    @Step
    public void inputValidNIK(String nik) {$(inputFieldNIK()).type(nik);}

    @Step
    public void inputValidName(String name) {$(inputFieldName()).type(name);}

    @Step
    public void inputValidNumHP(String num) {$(inputFieldNumHP()).type(num);}

    @Step
    public void chooseGender(String gender){$(dropdownGender()).selectByVisibleText(gender);}

    @Step
    public void choosePoli(String poli){$(dropdownpolimata()).selectByValue(poli);}

    @Step
    public void chooseDoctor(String doctor){$(dropdowndoctor()).selectByValue(doctor);}

    @Step
    public void chooseTime(String value){$(time()).selectByValue(value);}

    @Step
    public void inputKeluhan(String keluhan){$(keluhanField()).type(keluhan);}

    @Step
    public void clickConfirm(){$(ConfirmButton()).click();}

    @Step
    public void validateSuccess(){$(registSuccess()).isDisplayed();}

}
