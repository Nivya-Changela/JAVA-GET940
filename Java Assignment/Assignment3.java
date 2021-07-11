import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the first Over ");
		Over i1 = new Over();
		i1.caluclate();
		
		System.out.println("\nEnter the Second Over ");
		Over i2 = new Over();
		i2.caluclate();
			
		System.out.println("\n Enter the For Third Over ");
		Over i3 = new Over();
		i3.caluclate();
		
		System.out.println("\nEnter the For Fourth Over ");
		Over i4 = new Over();
		i4.caluclate();
		
		System.out.println("\nEnter the For Fifth Over ");
		Over i5 = new Over();
		i5.caluclate();
	
		System.out.println("Average Score of 5 matches :");
		System.out.println((float)(i1.total_runs+i2.total_runs+i3.total_runs+i4.total_runs+i5.total_runs)/5);
		
		System.out.println("Total runs : "+(i1.total_runs+i2.total_runs+i3.total_runs+i4.total_runs+i5.total_runs));
		
		System.out.println("No. of 0s: ");
		System.out.println(i1.zero+i2.zero+i3.zero+i4.zero+i5.zero);	
		System.out.println("No. of 1s : ");
		System.out.println(i1.one+i2.one+i3.one+i4.one+i5.one);	
		System.out.println("No. of 2s : ");
		System.out.println(i1.two+i2.two+i3.two+i4.two+i5.two);
		System.out.println("No. of 3s: ");
		System.out.println(i1.three+i2.three+i3.three+i4.three+i5.three);		
		System.out.println("No. of 4s : ");
		System.out.println(i1.four+i2.four+i3.four+i4.four+i5.four);
		System.out.println("No. of 6s : ");
		System.out.println(i1.six+i2.six+i3.six+i4.six+i5.six);

		System.out.println("Average Strike Rate : ");
		System.out.println((float)(i1.total_runs+i2.total_runs+i3.total_runs+i4.total_runs+i5.total_runs)/(i1.balls_played+i2.balls_played+i3.balls_played+i4.balls_played+i5.balls_played) + "runs per ball");
		
	}

}

class Over{
	
	int balls_played = 6 ;
	int six = 0;
	int one = 0;
	int two = 0;
	int three = 0;
	int four = 0;
	int zero = 0;
	int total_runs=0;
	
	void caluclate() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("runs scored : ");
		
		for(int i=0;i<balls_played;i++) {
		
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
			total_runs = total_runs + run;
		}
	}
		
	
}