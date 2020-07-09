package bank;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Branch> branches;

	public Bank() {
		this.branches = new ArrayList<Branch>();
	}

	public void addBranch(Branch branch) {
		this.branches.add(branch);
		System.out.println("Added branch.");
	}

	public boolean addCustomerToBranch(Branch branch, Customer customer, double initialAmount) {
		if (branch.newCustomer(customer.getName(), initialAmount)) {
			System.out.println("Successfuly added customer with initial transaction to branch");
			return true;
		}
		return false;
	}

	public boolean addTransactionForCustomer(Branch branch, Customer customer, double amount) {
		if (branch.addCustomerTransaction(customer.getName(), amount)) {
			System.out.println("Successfuly added transaction for customer to branch");
			return true;
		}
		return false;
	}

	public void showCustomersOfBranch(Branch branch, boolean showTransactions) {
		System.out.println("List of Customers for Branch");
		ArrayList<Customer> branchCustomers = branch.getCustomers();
		for (int i = 0; i < branchCustomers.size(); i++) {
			Customer branchCustomer = branchCustomers.get(i);
			System.out.println("Customer " + (i + 1) + ": " + branchCustomer.getName());
		}

		if (showTransactions) {
			System.out.println("List of Transactions for Branch");
			ArrayList<Double> branchTransactions = branch.getTransactions();
			for (int i = 0; i < branchTransactions.size(); i++) {
				double branchTransaction = branchTransactions.get(i);
				System.out.println("Transaction " + (i + 1) + ": " + branchTransaction);
			}
		}
	}
}

/*
 ** Banking w/ Java Classes** - **Bank class** - List of Branches - Add a new
 * branch - Add a customer to that branch with initial transaction - Add a
 * transaction for an existing customer for that branch - Show a list of
 * customers for a particular branch and optionally a list of their transactions
 * - Demonstration autoboxing and unboxing in your code - Think about where you
 * are adding the code to perform certain actions - **Branch class** - List of
 * Customers - List of Transactions - **Customer Class**: - Customer Name -
 * **Branch Class**: - addCustomer and initial transaction amount. - Also needs
 * to add additional transactions for that customer/branch - **Bank:**
 * 
 */