package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseScript {

    public static void main(String[] args) throws InterruptedException {
        // TODO Script to execute login and logout steps

        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        loginToAdminPannel(driver);

        WebElement logoIcon = driver.findElement(By.className("employee_avatar_small"));
        logoIcon.click();
        WebElement buttonLogout = driver.findElement(By.id("header_logout"));
        buttonLogout.click();

        driver.quit();
    }

    public static void loginToAdminPannel(WebDriver driver) {

        String url = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
        driver.get(url);

        WebElement fieldEmail = driver.findElement(By.id("email"));
        fieldEmail.sendKeys("webinar.test@gmail.com");

        WebElement fieldPassword = driver.findElement(By.id("passwd"));
        fieldPassword.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement buttonSignIn = driver.findElement(By.className("ladda-label"));
        buttonSignIn.click();
    }
}
