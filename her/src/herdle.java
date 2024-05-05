import java.util.*;
public class herdle {
	public static boolean inSet(LinkedHashSet<Character> keys, Character chara) { 
		for(Character c : keys) { 
			if(c.equals(chara)) { 
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[][] correct = new char[3][3];
		LinkedHashSet<Character> keys = new LinkedHashSet<Character>();
		for(int i =0; i < 3; i++) { 
			String thing = in.next();
			correct[i][0] = thing.charAt(0); 
			keys.add(thing.charAt(0));
			correct[i][1] = thing.charAt(1); 
			keys.add(thing.charAt(1));
			correct[i][2] = thing.charAt(2);
			keys.add(thing.charAt(2));
		}
		
		char[][] guess = new char[3][3]; 
		
		for(int i = 0; i < 3; i++) { 
			String thing = in.next();
			guess[i][0] = thing.charAt(0); 
			guess[i][1] = thing.charAt(1); 
			guess[i][2] = thing.charAt(2); 
		}
		int green_count = 0;
		int yellow_count = 0;
		
		HashMap<Character, Integer> dict_of_counts = new HashMap<Character, Integer>();
		in.close();
		
		for(Character c : keys) { 
			dict_of_counts.put(c, 0);
		}
		
		for(int i = 0; i < correct.length; i++) { 
			for(int d = 0; d < correct[i].length; d++) { 
				dict_of_counts.put(correct[i][d], dict_of_counts.get(correct[i][d]) + 1);
			}
		}
		
		for(int i = 0; i < guess.length; i++) { 
			for(int j = 0; j < guess[i].length; j++) { 
				if(guess[i][j] == correct[i][j]) { 
					green_count++;
					dict_of_counts.put(guess[i][j], dict_of_counts.get(guess[i][j])-1);
				}
				else if((guess[i][j] != correct[i][j]) && (inSet(keys, guess[i][j])) && ((dict_of_counts.get(guess[i][j]))>0)) { 
					yellow_count++;
					dict_of_counts.put(guess[i][j], dict_of_counts.get(guess[i][j])-1);
				}
			}
		}
		
		System.out.println(green_count);
		System.out.println(yellow_count);
	}

}
