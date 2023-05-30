package java_placement;

public class Account_info {
	
	private String name;
	private int balance;
	
		public String getName()
		{
			return name;
		}
		public void setName(String a)
		{
			name=a;
		}
		
		public int getbalance()
		{
			return balance;
		}
		public void setbalance(int b)
		{
			balance=b;
		}
		public int withdraw(int amount)
		{
			if(balance>=amount && (balance-amount)>=1000)
			{
				balance=balance-amount;
				return balance;
			}
			else
			{
				System.out.println("check your balance!!");
			}
			return 0;
		}
		public int deposite(int amount)
		{
			
				balance=balance+amount;
				return balance;
		}
}

	