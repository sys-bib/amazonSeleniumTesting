import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageTest {

    @Test
    public void amazonwebtesting() throws InterruptedException {
        String dir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", dir+"\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#nav-hamburger-menu")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(15) > a")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#n\\/172659 > span > a > span")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#p_n_size_browse-bin\\/1232879011 > span > a > div > label > i")).click();
    }


}
