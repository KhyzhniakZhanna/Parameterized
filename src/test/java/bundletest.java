import data.Language;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pages.htabs;
import data.hoteltabs;
import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

import static exam.Data.i;
@RunWith(Parameterized.class)
public class bundletest extends hoteltabs {
    Language language;

    @Parameterized.Parameters
    public static Collection options() {
        return Arrays.asList(Language.values());
    }

    public bundletest(Language language) {
        this.language = language;
        if (!driver.getCurrentUrl().contains("https://www.hoteltres.com/"+ language.getLang())) {
            driver.get("https://www.hoteltres.com/"+language.getLang());
            System.out.println(i++);
            hBundle= ResourceBundle.getBundle(language.getLang());
            hPage= PageFactory.initElements(driver, htabs.class);


        }
    }

    @Test
    public void testTab1(){
        Assert.assertEquals(hBundle.getString("tab1"),hPage.tab1Test());
        System.out.println("Language "+language.getLang()+": "+hPage.tab1Test());
        System.out.println("Expected: "+hBundle.getString("tab1"));
    }
    @Test
    public void testTab2(){
        Assert.assertEquals(hBundle.getString("tab2"),hPage.tab2Test());
        System.out.println("Language "+language.getLang()+": "+hPage.tab2Test());
        System.out.println("Expected: "+hBundle.getString("tab2"));
    }
    @Test
    public void testTab3(){
        Assert.assertEquals(hBundle.getString("tab3"),hPage.tab3Test());
        System.out.println("Language "+language.getLang()+": "+hPage.tab3Test());
        System.out.println("Expected: "+hBundle.getString("tab3"));
    }
}



