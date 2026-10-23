
package SwagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CartPage {

    private WebDriver driver;

    // Locators
    private By cartItems = By.className("cart_item");
    private By itemNames = By.className("inventory_item_name");
    private By removeButtons = By.cssSelector(
            ".cart_item button"
    );
    private By continueShoppingButton =
            By.id("continue-shopping");
    private By checkoutButton =
            By.id("checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }


    public List<String> getCartProductNames() {
        List<String> names = new ArrayList<>();

        List<WebElement> products =
                driver.findElements(itemNames);

        for (WebElement product : products) {
            names.add(product.getText());
        }

        return names;
    }

    // Get number of products in cart
    public int getCartProductsCount() {
        return driver.findElements(cartItems).size();
    }

    // Verify cart is empty
    public boolean isCartEmpty() {
        return getCartProductsCount() == 0;
    }

    // Remove a product by its name
    public void removeProduct(String productName) {
        List<WebElement> items =
                driver.findElements(cartItems);

        for (WebElement item : items) {
            String name = item.findElement(itemNames).getText();

            if (name.equals(productName)) {
                item.findElement(
                        By.cssSelector("button")
                ).click();
                return;
            }
        }

        throw new RuntimeException(
                "Product not found in cart: " + productName
        );
    }

    // Continue shopping
    public void clickContinueShopping() {
        driver.findElement(continueShoppingButton).click();
    }

    // Proceed to checkout
    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }

    // Get product prices from the cart
    public List<Double> getCartPrices() {
        List<Double> prices = new ArrayList<>();

        List<WebElement> priceElements =
                driver.findElements(
                        By.className("inventory_item_price")
                );

        for (WebElement price : priceElements) {
            String value = price.getText().replace("$", "");
            prices.add(Double.parseDouble(value));
        }

        return prices;
    }
}

