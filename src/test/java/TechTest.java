import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.WebDriverContainer;
import com.codeborne.selenide.impl.WebDriverThreadLocalContainer;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

/**
 * Created by sungaofei on 19/2/28.
 */
public class TechTest {

    @Test
    public void test1(){
        WebDriverContainer webdriverContainer = new WebDriverThreadLocalContainer();
        Configuration.screenshots = false;
        webdriverContainer.clearBrowserCache();
//
        Configuration.browser="chrome";
        Configuration.remote = "http://docker.testing-studio.com:5001/wd/hub";

        String baseUrl = "http://docker.testing-studio.com:8999/";

        com.codeborne.selenide.Selenide.open(baseUrl);

        $(byText("Welcome Gaofei!")).should(Condition.visible);


        System.out.print("");
    }

//    @Test
//    public void test2(){
//        WebDriverContainer webdriverContainer = new WebDriverThreadLocalContainer();
//        Configuration.screenshots = false;
//        webdriverContainer.clearBrowserCache();
////
//        Configuration.browser="chrome";
//        Configuration.remote = "http://39.105.132.200:5001/wd/hub";
//
//        String baseUrl = "http://jenkins.testing-studio.com:8999/";
//
//        com.codeborne.selenide.Selenide.open(baseUrl);
//
//        $(byText("Welcome Gaofei!")).should(Condition.visible);
//
//
//        System.out.print("");
//    }
//
//
//    @Test
//    public void test3(){
//        WebDriverContainer webdriverContainer = new WebDriverThreadLocalContainer();
//        Configuration.screenshots = false;
//        webdriverContainer.clearBrowserCache();
////
//        Configuration.browser="chrome";
//        Configuration.remote = "http://39.105.132.200:5001/wd/hub";
//
//        String baseUrl = "http://jenkins.testing-studio.com:8999/";
//
//        com.codeborne.selenide.Selenide.open(baseUrl);
//
//        $(byText("Welcome Gaofei!")).should(Condition.visible);
//
//
//        System.out.print("");
//    }

//    public static void main(String[] args) {
//        WebDriverContainer webdriverContainer = new WebDriverThreadLocalContainer();
//        Configuration.screenshots = false;
//        webdriverContainer.clearBrowserCache();
////
//        Configuration.browser="chrome";
//        Configuration.remote = "http://39.105.132.200:5001/wd/hub";
//
//        String baseUrl = "http://jenkins.testing-studio.com:8999/";
//
//        com.codeborne.selenide.Selenide.open(baseUrl);
//
//        $(byText("Welcome Gaofei!")).should(Condition.visible);
//
//
//        System.out.print("");
//    }
}
