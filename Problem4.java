import java.util.Random;

public class Problem4 {
	static Random random = new Random();
	public static void main(String[] args) {
		int[] NumberList = new int[10];
		for (int i = 0;i<1000;i++){
			int RandomNumber = random.nextInt(10);
			NumberList[RandomNumber] = NumberList[RandomNumber] + 1;
		}
		for (int i = 0; i<10;i++){
			double e = 100*((double)NumberList[i]/1000);
			System.out.println(i + " was selected " + NumberList[i] + " times, or " + e + "% of the time");
		}
	}

}
