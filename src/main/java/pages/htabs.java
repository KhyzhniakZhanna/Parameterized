package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class htabs {

    @FindBy(css = "body > aside.tgl-menus-air.sta-menu-white.sta-show-links.sta-book-fixed > nav > div > div.sta-menus-air_nav-links.sta-main-links > ul > li.sta-menus-air_links-element.js-menu-placeholderlist_room.no_link > a > p")

    WebElement tab1;
    @FindBy(css="body > aside.tgl-menus-air.sta-menu-white.sta-show-links.sta-book-fixed > nav > div > div.sta-menus-air_nav-links.sta-main-links > ul > li:nth-child(3) > a > p")

    WebElement tab2;
    @FindBy(css = "body > aside.tgl-menus-air.sta-menu-white.sta-show-links.sta-book-fixed > nav > div > div.sta-menus-air_nav-links.sta-main-links > ul > li:nth-child(4) > a > p")
    WebElement tab3;

    public String tab1Test( ){
        return tab1.findElement(By.xpath("/html/body/aside[2]/nav/div/div[2]/ul/li[2]/a/p")).getText();
    }
    public String tab2Test( ){
        return tab2.findElement(By.xpath("/html/body/aside[2]/nav/div/div[2]/ul/li[3]/a/p")).getText();
    }
    public String tab3Test(){
        return tab3.findElement(By.xpath("/html/body/aside[2]/nav/div/div[2]/ul/li[4]/a/p")).getText();
    }
}
