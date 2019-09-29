package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
  public ContactHelper(FirefoxDriver wd) {
    super(wd);

  }
  public void submitContactCreation() {
    click(By.xpath("(//input[@name='submit'])[2]"));}

  public void fillContactForm(ContactData contactData) {
    click(By.name("firstname"));
    type(By.name("firstname"),contactData.getFirstname());
    click(By.name("lastname"));
    type(By.name("lastname"),contactData.getLastname());
    click(By.name("mobile"));
    type(By.name("mobile"),contactData.getMobile());
    click(By.name("email"));
    type(By.name("email"),contactData.getEmail());
  }
  public void addNewContact() {
    click(By.linkText("add new"));
  }
}
