package BankTest;

class BankAccount00 {

	int balance;

	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public void checkInfo() {
		System.out.println("현재 잔고 : " + balance);
	}

}

public class BankAccount {

	public static void main(String args[]) {
		BankAccount00 account1 = new BankAccount00();
		BankAccount00 account2 = new BankAccount00();

		account1.deposit(8000);
		account1.withdraw(1500);

		account2.deposit(5500);
		account2.withdraw(3000);

		System.out.print("1번 - ");
		account1.checkInfo();

		System.out.print("2번 - ");
		account2.checkInfo();
	}

}