package dos;
public class Main {
	static String acronym(String[] words, String[] ignores) {
		if(words[2].equals("the")) { 
			return "i freaking hate this";
		}
		
		else { 
			return "still sucks";
		}
	}
	
	public static void main(String[] args) {
		String[] words = {"President","of","the","United","States","of","America"}; 
		String[] words2 = {"the","of","and","or","in"}; 
		System.out.println(acronym(words, words2));
	}
}
