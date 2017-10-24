import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String a = scan.nextLine();
		System.out.print("Enter an integer: ");
		int b = scan.nextInt();
		if (b>a.length()){
			System.out.println("Please choose an integer smaller than the length of the string");
			b = scan.nextInt();
		}
		for (int e = 0; e<a.length();e++){
			
		    for(int i = 0;i<b;i++){
			    System.out.print(a.charAt(i));
			    }
		    b = b - 1;
		}
	}

}

