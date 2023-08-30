package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class mainPageObject {
    private WebDriver driver;

    private By activecity=By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[1]/div/nav/span");



    public mainPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getactivecity() {
        return driver.findElement(activecity);
    }


}
