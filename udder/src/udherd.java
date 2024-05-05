import java.util.*;
public class udherd {
	public static int get_index(String cowphabet, Character chara) { 
		for(int i =0; i < cowphabet.length(); i++) { 
			if(((Character)cowphabet.charAt(i)).equals(chara)) { 
				return i;
			}
		}
		
		return 0;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cowphabet = in.next(); 
		String word = in.next(); 
		int count = 1; 
		for(int d = 1; d < word.length(); d++) { 
			if((get_index(cowphabet, (Character)word.charAt(d)) - (get_index(cowphabet, (Character)word.charAt(d-1))) <= 0)) { 
				count++;
			}
		}
		System.out.println(count);
	}
}
