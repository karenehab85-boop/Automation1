package SwagTests;

import SwagLabs.InventoryPageClass;
import SwagLabs.LoginSwag;
import login.LoginTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.SecureAreaPage;

public class SwagLoginTest extends SwagBaseTest{

    private static final Logger log = LoggerFactory.getLogger(LoginTests.class);
    @Test
       public void testsuccesfullogin() {

        LoginSwag login = new LoginSwag(driver);
        login.setUsernameField("standard_user");
        login.setPasswordField("secret_sauce");
var IventoryPageClass = login.clickbuttonfield();

        }
    }

