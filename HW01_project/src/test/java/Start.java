import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
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

    public void homework_07_sep() {

        driver = new ChromeDriver();
        driver.navigate().to("file:///C:/Users/UserONE/Desktop/index.html");

        driver.findElement(By.cssSelector("[href='#item1']"));
        driver.findElement(By.cssSelector("[href='#item2']"));
        driver.findElement(By.cssSelector("[href='#item3']"));
        driver.findElement(By.cssSelector("[href='#item4']"));

        driver.findElement(By.name("name"));
        driver.findElement(By.name("surename"));




    }
}
