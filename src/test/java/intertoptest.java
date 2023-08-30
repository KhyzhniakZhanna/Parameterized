import conf.BaseClass;
import data.Language;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.Collection;
import static exam.Data.i;
@RunWith(Parameterized.class)
public class intertoptest extends BaseClass {
    Language language;

    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(Language.values());
    }

    public intertoptest(Language language) {
        this.language = language;
        if (!driver.getCurrentUrl().contains("https://intertop.ua/"+ language.getLang())) {
            driver.get("https://intertop.ua/"+language.getLang());
            System.out.println("Language "+(i++)+": "+language.getLang());

        }}

        @Test
        public void test_title() {
            System.out.println(driver.getCurrentUrl()+driver.getTitle());

        }
        @Test
        public void test_desc() {

            System.out.println(driver.findElement(By.xpath("//*[@id=\"subscribe-mobile\"]/section/div/div/p")).getText());

        }
    }
