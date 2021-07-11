import java.util.Scanner;

class ElectricityBill{
	float unit;
	void calculateBill(float unitBill) {	
		unit = unitBill;
		if(unit<100)
			System.out.println("Bill is : "+(unit*1.2)); //per unit Rs.1.2
		
		else if(unit<=300)
			System.out.println("Bill is : "+(120+(unit-100)*2)); //for bill of units 0 to 100 = 100*1.2, above 100 unit Rs.2/unit 
		
		else if(unit>300)
			System.out.println("Bill is : "+(520+(unit-300)*3)); //	for bill of units till 100 = 100*1.2, between 100 to 300 is 200 units = 200*2, above 300 units charge is Rs.3 /unit					
		}
}
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no. of units");
		
		Scanner sc = new Scanner (System.in);
		float unit = sc.nextFloat();
		
		ElectricityBill eb = new ElectricityBill();
		eb.calculateBill(unit);
	}

}
