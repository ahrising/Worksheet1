import java.util.Scanner;

public class Problem2 {
	static String vowelRemover (String str){
		int i;
		String newString = "";
		String vowels = ("aeiouy");
		for (i = 0; i<(str.length());i++){
			String deletedVowels = "";
			for (int e = 0;e<vowels.length();e++){
				if (vowels.charAt(e)==str.charAt(i)){
					deletedVowels = deletedVowels + str.charAt(i);
				}
			}
			if (deletedVowels == ""){
				newString = newString + str.charAt(i);
			}
		}
		System.out.println(newString);
		return newString;
		
	}
	public static void main(String[] args) {
		String i;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string: ");
		i = scan.nextLine();
		vowelRemover(i);

	}

}
