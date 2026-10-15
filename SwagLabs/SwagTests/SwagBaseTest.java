package SwagTests;

import SwagLabs.LoginSwag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SwagBaseTest {
    public WebDriver driver ;
protected LoginSwag LoginSwag ;
@BeforeTest
public void setup(){
 driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get(" https://www.saucedemo.com/");
 LoginSwag = new LoginSwag(driver);
}
@AfterTest
    public void teardown(){
    driver.quit();
}
}