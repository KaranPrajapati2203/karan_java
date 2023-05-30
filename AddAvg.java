package java_placement;
import java.util.*;

public class AddAvg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks 1:");
		double mark1 = sc.nextDouble();
		
		System.out.println("Enter marks 2:");
		double mark2 = sc.nextDouble();
				
		System.out.println("Enter marks 3:");		
		double mark3 = sc.nextDouble();
		
		double sum = mark1+mark2+mark3;
		double avg = sum/3;

		System.out.println("The sum of all marks is:" + sum);
		System.out.println("The avg of all marks is:" + avg);
		System.out.println("The result of the student is:");
		
		if(avg>90) {
			System.out.println("A grade");
		}
		else if(avg>=80 || avg<=90) {
			System.out.println("B grade");
		}
		else if(avg>=70 || avg<=80) {
			System.out.println("C grade");
		}
		else
			System.out.println("D grade");
	}

}
