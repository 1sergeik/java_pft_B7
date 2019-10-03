package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase{
  @Test
  public void testContactModification() throws Exception {

    app.getContactHelper().selectContact();
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData("Sergei", "Koryakin", "+79218462210", "1sergeik@gmail.com"));

    app.getContactHelper().confirmEditContact();
    app.getNavigationHelper().gotoHomePage();
    app.logout();
  }
}
