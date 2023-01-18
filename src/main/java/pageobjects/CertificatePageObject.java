package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CertificatePageObject {
    @FindBy(xpath="//input[@class=\"input -text certificate-check_input\"]")
    WebElement searchField;

    @FindBy(xpath = "//p[@class=\"certificate-check_message\"]")
    WebElement message;

    public void sendKeyToSearchField(String str) {
        searchField.sendKeys(str);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        searchField.sendKeys(Keys.ENTER);
    }
    public String getMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return message.getText();

    }
}
