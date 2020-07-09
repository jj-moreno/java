package cell_phone;

class Contact {
	
private String name;
private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public Contact saveContact(String name, String phoneNumber) {
    	return new Contact(name, phoneNumber);
    }
    
    public void modifyContact(String name, String phoneNumber) {
    	this.name = name;
    	this.phoneNumber = phoneNumber;
    }
    
    public boolean searchContact(String name) {
    	return this.name.equals(name);
    }
    
    public void deleteContact(String name) {
    	if (this.searchContact(name)) {
    		this.name = null;
    		this.phoneNumber = null;
    	}
    }
}


/*
    - **Contact Class:**
        - Name
        - Phone number
        - saveContact()
        - modifyContact()
        - searchContact()
        - removeContact()
*/
