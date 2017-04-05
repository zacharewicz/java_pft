package ru.stqa.pft.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class AddNewAddress {
  FirefoxDriver wd;

  @BeforeMethod
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    gotoNewAddressPage();
    login("admin", "secret");
  }

  private void login(String name, String password) {
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(name);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  private void gotoNewAddressPage() {
    wd.get("http://localhost/addressbook/edit.php");
  }

  @Test
  public void testAddNewAddress() {

    createName("Anna");
    createSurname("Kowalska");
    createPhone("+48888888888");
    createMail("anna.kowalska@gmail.com");
    submitNewAddress();
    gotoHomePage();

  }

  private void gotoHomePage() {
    wd.findElement(By.id("content")).click();
  }

  private void submitNewAddress() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  private void createMail(String email) {
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys(email);
  }

  private void createPhone(String phone) {
    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys(phone);
  }

  private void createSurname(String surname) {
    wd.findElement(By.name("middlename")).click();
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(surname);
  }

  private void createName(String name) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(name);
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
