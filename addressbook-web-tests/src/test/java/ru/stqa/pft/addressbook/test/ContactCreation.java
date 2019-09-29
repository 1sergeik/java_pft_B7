package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreation extends TestBase{
  @Test
  public void testContactCreation() throws Exception {

    app.getContactHelper().addNewContact();
    app.getContactHelper().fillContactForm(new ContactData("Sergei", "Koryakin", "+79218462210", "1sergeik@gmail.com"));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().gotoHomePage();
    app.logout();
  }


}
