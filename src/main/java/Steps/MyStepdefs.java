package Steps;

import configurations.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pageobjects.CertificatePageObject;

public class MyStepdefs extends BaseClass {
    static CertificatePageObject certificatePageObject= PageFactory.initElements(driver, CertificatePageObject.class);
    @When("I open page {string}")
    public void iOpenPage(String url) {
        driver.get(url);
    }

    @And("Enter key {string} in search field")
    public void enterKeyInSearchField(String number) {
        certificatePageObject.sendKeyToSearchField(number);
    }

    @Then("Get text {string}")
    public void getText(String text) {
        System.out.println(certificatePageObject.getMessage());
        Assert.assertEquals("Сертифікат не знайдено",certificatePageObject.getMessage());
    }

}
