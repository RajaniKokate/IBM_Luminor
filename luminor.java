import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class luminor{

    @Test
    public void simple() throws InterruptedException {
        open("https://luminor.ee/currency-rates");
        Thread.sleep(5000);
        $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/div/div/div[1]/div/div[1]/div/div[1]/div/input")).setValue("100");
        String a = $(byXpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/div/div/div[1]/div/div[3]/div/div[1]/div/input")).getAttribute("value");
        System.out.println("Value is:"+ a);
    }
    }







