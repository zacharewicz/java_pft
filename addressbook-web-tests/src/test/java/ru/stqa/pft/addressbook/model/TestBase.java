package ru.stqa.pft.addressbook.model;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

/**
 * Created by zacharewicz on 2017-04-29.
 */
public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

  public static class NewClientData {
    private final String clientName;
    private final String clientSurname;
    private final String clientPhone;
    private final String clientMail;

    public NewClientData(String ClientName, String ClientSurname, String ClientPhone, String ClientMail) {
      clientName = ClientName;
      clientSurname = ClientSurname;
      clientPhone = ClientPhone;
      clientMail = ClientMail;
    }

    public String getClientName() {
      return clientName;
    }

    public String getClientSurname() {
      return clientSurname;
    }

    public String getClientPhone() {
      return clientPhone;
    }

    public String getClientMail() {
      return clientMail;
    }
  }
}
  