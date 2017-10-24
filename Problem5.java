import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Choose a number between 1 and 1000: ");
		int a = scan.nextInt();
		for (int i = 0;i<10;i++){
			if (a - 100*i < 100 && a - 100*i > 0){
				if (Math.abs((a-100*i) - 100) == 10){
					System.out.println("Your number is close to " + 100*(i+1));
				}
				else{
					System.out.println("Your number sucks");
				}
		    }
	 }
		
	}

}
