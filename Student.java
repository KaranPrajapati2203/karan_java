package java_placement;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu_info si = new Stu_info();
		
		si.setName("Karan");
		System.out.println(si.getName());
		
		si.setUid(22);
		System.out.println(si.getUid());
		
		si.setMobile(4637283);
		System.out.println(si.getMobile());
		
		si.setEmail("Karan22@xyz.com");
		System.out.println(si.getEmail());
		
		si.display();
	}

}
	