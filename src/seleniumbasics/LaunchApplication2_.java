package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchApplication2_ {
    public static void main(String[] args) {
      //  WebDriver driver = new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();
      //  WebDriver driver = new ChromeDriver();
//      driver.get("https://google.com/");
        driver.navigate().to("https://google.com/");
        String pageTitle =driver.getTitle();
        System.out.println(pageTitle);
    }
}