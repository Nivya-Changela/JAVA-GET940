import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int six = 0;
			int one = 0;
			int two = 0;
			int three = 0;
			int four = 0;
			int zero = 0;
			int total_runs=0;
			
			System.out.println("enter 5 overs runscores between 0-6 : ");
			for(int i=0;i<30;i++) {
				int run = sc.nextInt();
				switch(run) {
				case 0: 
					zero++;
					break;
				case 1:
					one++;
					break;
				case 2:
					two++;
					break;
				case 3:
					three++;
					break;
				case 4:
					four++;
					break;
				case 6:
					six++;
					break;
				}
				total_runs = total_runs+run;
				
			}
			
			System.out.println("Total runs scored : "+total_runs);
			System.out.println("No. of 0s : " + zero + "\nNo. of 1s : " + one + "\nNo. of 2s : " + two + "\nNo. of 3s : " + three + "\nNo. of 4s : " + four + "\nNo. of 6s : " + six );
			System.out.println("Strike rate : "+(total_runs/30f)+" runs per ball");
			
		}
	}


