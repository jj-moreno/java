package bank;

import java.util.ArrayList;

public class Branch {
	private ArrayList<Customer> customers;
	private ArrayList<Double> transactions;
	
	
	public Branch() {
		this.customers = new ArrayList<Customer>();
		this.transactions = new ArrayList<Double>();
	}
	
	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	public boolean newCustomer(String customerName, double initialAmount) {
		if (findCustomer(customerName) == null) {
			this.customers.add(new Customer(customerName));
			this.transactions.add(initialAmount);
			System.out.println("Customer succesfully added with initial amount.");
			return true;
		}
		System.out.println("Error! Cannot be added. Customer already exists.");
		return false;
	}
	
	public boolean addCustomerTransaction(String customerName, double amount) {
		Customer existingCustomer = findCustomer(customerName);
		if (existingCustomer != null) {
			this.transactions.add(amount);
			System.out.println("Transaction successfully added.");
			return true;
		}
		System.out.println("Error! Customer not found. Transaction unsuccessful.");
		return false;
	}

	private Customer findCustomer(String customerName) {
		for(Customer customer : customers) {
			if (customer.getName().equals(customerName)) {
				return customer;
			}
		}
		
		return null;
	}
}

/*
**Branch Class**:
     - addCustomer and initial transaction amount.
     - Also needs to add additional transactions for that customer/branch
*/

