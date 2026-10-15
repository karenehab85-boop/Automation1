package SwagTests;

import SwagLabs.InventoryPageClass;
import SwagLabs.LoginSwag;
import login.LoginTests;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class SwagInventoryTest extends SwagBaseTest{
    private static final Logger log = LoggerFactory.getLogger(LoginTests.class);
    @Test
    public void testiventory() {

        InventoryPageClass inventory  = new InventoryPageClass(driver);
       inventory.getTitle();
       inventory.getProductsCount();
       inventory.clickShoppingCartLink();
}}
