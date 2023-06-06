package importDemo;
import package1.*;

public class Importdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add add = new Add();
		Mul mul  = new Mul();
		System.out.println(add.to_add(27, 39));
		System.out.println(mul.to_mul(27, 39));
	}

}
