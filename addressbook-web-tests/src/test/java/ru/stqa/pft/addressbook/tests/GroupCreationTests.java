package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;
import ru.stqa.pft.addressbook.model.TestBase;

import java.util.concurrent.TimeUnit;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new ApplicationManager.GroupData("test1", "test2", "test3"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

  public static class AddNewAddress extends TestBase {
    FirefoxDriver wd;

    @BeforeMethod
    public void setUp() throws Exception {
      wd = new FirefoxDriver();
      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      gotoMainPage();
      login("admin", "secret");
    }

    private void login(String username, String password) {
      wd.findElement(By.name("user")).click();
      wd.findElement(By.name("user")).clear();
      wd.findElement(By.name("user")).sendKeys(username);
      wd.findElement(By.name("pass")).click();
      wd.findElement(By.name("pass")).clear();
      wd.findElement(By.name("pass")).sendKeys(password);
      wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    private void gotoMainPage() {
      wd.get("http://localhost/addressbook/edit.php");
    }

    @Test
    public void testAddNewAddress() {
      createNewAddressBookForClient(new NewClientData("Anna", "Kowalska", "+48888888888", "anna.kowalska@gmail.com"));
      submitNewAddressBookForClient();
      backToHomePage();

    }

    private void backToHomePage() {
      wd.findElement(By.id("content")).click();
    }

    private void submitNewAddressBookForClient() {
      wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    private void createNewAddressBookForClient(NewClientData newClientData) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(newClientData.getClientName());
      wd.findElement(By.name("middlename")).click();
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(newClientData.getClientSurname());
      wd.findElement(By.name("mobile")).click();
      wd.findElement(By.name("mobile")).clear();
      wd.findElement(By.name("mobile")).sendKeys(newClientData.getClientPhone());
      wd.findElement(By.name("email")).click();
      wd.findElement(By.name("email")).clear();
      wd.findElement(By.name("email")).sendKeys(newClientData.getClientMail());
    }

    @AfterMethod
    public void tearDown() {
      wd.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {

      logout(wd);

      try {
        wd.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    private static void logout(FirefoxDriver wd) {
      wd.findElement(By.linkText("Logout")).click();
    }
  }
}


