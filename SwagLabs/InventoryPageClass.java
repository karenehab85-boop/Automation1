
        package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPageClass {

    private WebDriver driver;

    private By title = By.className("title");
    private By shoppingCartLink = By.className("shopping_cart_link");
    private By products = By.className("inventory_item");

    public InventoryPageClass(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.findElement(title).getText();
    }

    public void clickShoppingCartLink() {
        driver.findElement(shoppingCartLink).click();
    }

    public int getProductsCount() {
        return driver.findElements(products).size();
    }
}
