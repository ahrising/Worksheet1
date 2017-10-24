public class Problem1 {

	public static void main(String[] args) {
		int i,p = 1,q = 1;
		System.out.print("for loop: ");
		for (i=1;i<11;i++){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("While statement: ");
		while (p<11){
			System.out.print(p + " ");
			p++;
		}
		System.out.println();
		System.out.print("Do: ");
	    do {
	    	System.out.print(q + " ");
	    	q++;
	    } while(q<11);
	}

}
