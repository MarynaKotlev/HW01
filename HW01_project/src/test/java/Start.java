import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver driver;

    @Test
    public void firstStep() {
        driver = new ChromeDriver();
        driver.navigate().to("https://diary.ru/");
        driver.navigate().refresh();
        driver.quit();
    }
}
