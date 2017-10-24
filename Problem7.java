import java.util.Random;

public class Problem7a {
	
	static Random random = new Random();
	
	public static void main(String[] args) {
		
		int HandValue = 0;
		
		while (HandValue < 16){
			
			int e = + random.nextInt(10);
			
			while (e == 0){
				e = random.nextInt(10);
			}
			
			HandValue = HandValue + e;
			System.out.println("Card drawn: " + e);
			System.out.println("The total value of your hand is: " + HandValue);
			}
		if (HandValue > 21){
			System.out.println("");
			System.out.println("Bust! The final value of your hand is: " + HandValue);
		}
		else{
			System.out.println("");
			System.out.println("You might've won! The final value of your hand is: " + HandValue);
		}
	}

}
