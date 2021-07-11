
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				System.out.println("Welcome to bank \n");
				BankAccount1 b = new BankAccount1(6541, 50000d, "Nivya");
				b.setBankName("Bank of Baroda");
				b.displayAccount();	
				
				System.out.println("------------------");
				
				BankAccount1 b2 = new BankAccount1();
				b2.displayAccount();
			}
		}

class BankAccount1
	{	
		static String bankName;
		int accountNo;
		double accountBalance;
		String accountPassword;
		
		
		BankAccount1(){
		
		}
		BankAccount1(int accountNo, double accountBalance, String accountPassword) {
			this.accountNo = accountNo;
			this.accountBalance = accountBalance;
			this.accountPassword = accountPassword;
			
		}

		void setBankAccount(int acno, double bal, String pass) {
			accountNo = acno;
			accountBalance = bal;
			accountPassword = pass;
			
			
		}
		
		void displayAccount() {
			
			System.out.println("Acc number = "+accountNo);
			System.out.println("Acc balance = "+accountBalance);
			System.out.println("Acc password = "+accountPassword);
			System.out.println("Bank name = " +bankName);
		}
		
		
		void setBankName(String bname) {
			bankName = bname;
		}
		
	}