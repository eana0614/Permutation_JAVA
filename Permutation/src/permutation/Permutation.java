package permutation;

import java.util.ArrayList;

public class Permutation {
	
	private ArrayList<String> permutationElement;
	
	public Permutation(){
		this.permutationElement = new ArrayList<>();
	}

	public void runPermutation(char[] elements, int n) {
		
		if(n == 1){
			String ele ="";
			
			for(int i=0; i<elements.length; i++){
				ele = ele+elements[i];	
			}
			permutationElement.add(ele);
		}
		
		for(int i=0; i<n; i++){
			elements = swap(elements, i, n-1);
			runPermutation(elements, n-1);
			elements = swap(elements, i, n-1);
		}
	}

	private char[] swap(char[] elements, int i, int j) {
		char temp;
		
		if(i != j){
			temp = elements[i];
			elements[i] = elements[j];
			elements[j] = temp;
			
		}
		
		return elements;
	}

	
	public void printPermutation() {
		
		System.out.println("========== RESULT ==========");
		for(int i=0; i<permutationElement.size(); i++){
			System.out.println((i+1)+"th Permutation = "+permutationElement.get(i));
		}
		
		System.out.println();
	}

}
