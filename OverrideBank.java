package functionOverride;

public class OverrideBank {
	
	public static void main(String[] args) {
		RBI rbi ;
		rbi = new SBI();
		System.out.println(rbi.getrateofinterest());
		
		rbi = new HDFC();
		System.out.println(rbi.getrateofinterest());
	}
}
