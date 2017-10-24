import java.util.Random;

public class Problem7b {
	
	static Random random = new Random();
	
	public static void main(String[] args) {
		
		int HandValue = 0;
		String[] Cards = new String[15]; 
		String[] FaceCards = {"","J", "Q", "K","A"}; 
		for (int i = 1;i<15;i++){
			if (i>10){
				Cards[i] = FaceCards[(i-10)];
			}
			else{
				Cards[i] = String.valueOf(i);
			}
		}
		
		while (HandValue < 16){
			int e = + random.nextInt(13);
			int a = e;
			System.out.println(e);
			if (e == 0){
				e = 14;
			}
			
			else if (e > 10){
				e = 10;
			}
			
			
			HandValue = HandValue + e;
			System.out.println("Card drawn: " + Cards[a]);
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
