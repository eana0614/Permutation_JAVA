package permutation;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("!] INPUT DIFFERENT N NUMBERS OR CHARACTERS.");
		System.out.println("   ex)  abcd1234");
		
		String input = scanner.nextLine();
		
		if(checkingInputString(input)){
			
			char elements[] = input.toCharArray();
			
			Permutation permutation = new Permutation();
			
			permutation.runPermutation(elements, elements.length);
			permutation.printPermutation();
			
			System.out.println("!] DONE.");
			
		}else{
			System.err.println("Error. INCORRECT INPUT ERROR.");
		}

	}

	private static boolean checkingInputString(String input) {
		boolean result = true;;
		char temp;
		for(int i=1; i<input.length(); i++){
			temp = input.charAt(i);
			for(int j=0; j<i; j++){
				if(temp == input.charAt(j)){
					result = false;
					break;
				}
			}
		}
		
		return result;
		
	}

}
