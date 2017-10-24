public class Problem3 {

	public static void main(String[] args) {
		for (int i = 1; i<=100;i++){
			if (i%10==0){
				System.out.println(i);
			}
			else if(i<10){
				System.out.print(i + "  ");
			}
			else{
				System.out.print(i + " ");
			}
		}
	}
}
