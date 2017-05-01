package ru.stqa.pft.addressbook.appmanager;

public class NewClientData {
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
