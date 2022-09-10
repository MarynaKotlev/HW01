import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.AddHasCasting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HW_xPath {

WebDriver driver;

@Test
    public void HW_xPath() {

    driver = new ChromeDriver();
    driver.navigate().to("file:///C:/Users/UserONE/Desktop/index.html");

    List<WebElement> list = driver.findElements(By.cssSelector("#country-table>tbody>tr:first-child>td"));
    System.out.println("Count of columns = " + list.size());
    Assert.assertEquals(list.size(), 3);

    list = driver.findElements(By.cssSelector("#country-table>tbody tr"));
    System.out.println("Count of rows = " + list.size());
    Assert.assertEquals(list.size(), 4);

    WebElement israel = driver.findElement(By.cssSelector("#country-table tr:nth-child(2) td:nth-child(2)"));
    System.out.println("Country = " + israel.getText());
    Assert.assertEquals(israel.getText(), "Israel");

    WebElement lastRow = driver.findElement(By.cssSelector("#country-table tr:last-child"));
    System.out.println("Last row = " + lastRow.getText());
    driver.quit();


}

}
