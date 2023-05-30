package java_placement;

public class Account {

public static void main(String[] args) {
		
	Account_info ai = new Account_info();   
		
		ai.setName("karan");
		System.out.println(ai.getName());
		
		ai.setbalance(5000);
		System.out.println(ai.getbalance());
		
		
		System.out.println("your remaining balance is : "+ai.withdraw(4000));
		System.out.println("Now your balance is : "+ai.deposite(4000));
	    System.out.println(ai.withdraw(1500));
		

	}
	
}
