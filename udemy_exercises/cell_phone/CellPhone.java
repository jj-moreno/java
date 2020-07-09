package cell_phone;

import java.util.ArrayList;

class CellPhone {
	
	private ArrayList<Contact> contacts;

	public CellPhone() {
		this.contacts = new ArrayList<Contact>();
	}
	
	public boolean addContact(Contact contact) {
		if (findContact(contact.getName()) >= 0) {
			System.out.println("Contact is already on file.");
			return false;
		}
		contacts.add(contact);
		return true;
	}

	private int findContact(Contact contact) {
		return this.contacts.indexOf(contact);
	}

	private int findContact(String contactName) {
		for (int i = 0; i < this.contacts.size(); i++) {
			Contact contact = this.contacts.get(i);
			if (contact.getName().equals(contactName)) {
				return i;
			}
		}
		return -1;
	}

	public boolean updateContact(Contact oldContact, Contact newContact) {
		int foundPosition = this.findContact(oldContact);
		if (foundPosition > 0) {
			if (this.findContact(newContact.getName()) < 0) {
				this.contacts.set(foundPosition, newContact);
				System.out.println(oldContact.getName() + " was replaced wih " + newContact.getName());
				return true;
			}
			else {
				System.out.println("Error! Contact name already exists. Cannot update contact with the same name.");
				return false;
			}
		} else {
			System.out.println(oldContact.getName() + " was not found.");
			return false;
		}
	}
	
	public Contact searchContact(String name) {
		int foundPosition = this.findContact(name);
		if (foundPosition >= 0) {
			System.out.println("Found Contact.");
			return this.contacts.get(foundPosition);
		}
		System.out.println("Contact not found.");
		return null;
	}

	public boolean removeContact(Contact contact) {
		int foundPosition = this.findContact(contact);
		if (foundPosition >= 0) {
			this.contacts.remove(foundPosition);
			System.out.println(contact.getName() + " was deleted.");
			return true;
		} else {
			System.out.println(contact.getName() + " was not found.");
			return false;
		}
	}

	public void showContacts() {
		System.out.println("Contact List");
		for (Contact contact : this.contacts) {
			System.out.println("Name: " + contact.getName() + "Phone #: " + contact.getPhoneNumber());
		}
	}

	public void quit() {
		System.exit(0);
	}
}

/*
 ** Cell Phone with Java Classes** - **CellPhone Class:** - Contact List - quit()
 * - showContacts() - addContact() - updateContat() - removeContact() -
 * searchContact() **When adding or updating be sure to check if the contact
 * already exists** **Be sure not to expose the inner workings of the Arraylist
 * to MobilePhone (use concepts of encapsulation to meet this requirement)**
 */
