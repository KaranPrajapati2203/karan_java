package functionOverride;

public class RBI {
	public float getrateofinterest() {
		return 6.7f;
	}
}

class SBI extends RBI{
	@Override
	public float getrateofinterest() {
		System.out.println("The rate of interest in SBI is ");
		return 7.0f;
	}
}

class HDFC extends RBI{
	@Override
	public float getrateofinterest() {
		System.out.println("The rate of interest in HDFC is ");
		return 6.89f;
	}
}