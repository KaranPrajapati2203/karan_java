package java_placement;

public class Aca_Stu extends per_stu {

	String enrollNo;
	String result;

	public String getEnrollNo() {
		return enrollNo;
	}

	public String getResult() {
		return result;
	}

	public void setEnrollNo(String enrollNo) {
		this.enrollNo = enrollNo;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Enrollment number = " + getEnrollNo() + ", Result = " + getResult() + ", Name = " + getname();
	}

	public static void main(String[] args) {
		Aca_Stu acaStu = new Aca_Stu();
		acaStu.setEnrollNo("12345");
		acaStu.setResult("Pass");
		acaStu.setname("Karan");

		System.out.println(acaStu);
	}

}
