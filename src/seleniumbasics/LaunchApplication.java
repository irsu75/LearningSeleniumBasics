package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchApplication {
    public static void main(String[] args) {
        //1. open the Browser

        System.setProperty("webdriver.chrome.driver","C:\\Users\\vladb\\IdeaProjects\\LearningSeleniumBasics\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
}
