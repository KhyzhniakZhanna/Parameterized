import conf.BaseClass;
import data.Localozation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import pages.mainPageObject;

import java.util.Arrays;
import java.util.Collection;

import static exam.Data.i;


@RunWith(Parameterized.class)
public class hillleltest extends BaseClass {
    private static mainPageObject mainpage;


    Localozation city;


    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(Localozation.values());
    }



    public hillleltest(Localozation City) {
        this.city = City;

        if (!driver.getCurrentUrl().contains("https://"+city.getCity()+".ithillel.ua")) {
            driver.get("https://"+city.getCity()+".ithillel.ua");
            mainpage=new mainPageObject(driver);

        }}

        @Test
        public void test_locale() {
            System.out.println("City " + (i++) + ": " + mainpage.getactivecity().getText());
        }

    }
