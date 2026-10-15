package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSwag {
    private WebDriver driver;
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By buttonfield = By.id("login-button");

    public  LoginSwag(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsernameField(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public InventoryPageClass clickbuttonfield() {
        driver.findElement(buttonfield).click();
        return new InventoryPageClass(driver);
    }
}