package mostfreqcharacter;

public class Main {
	static void printMostCommonLetter(String str) { 
		int[] lowercase = new int[26];
		int[] uppercase = new int[26];
		
		for(int i = 0; i < str.length(); i++) { 
			if(Character.isLowerCase(str.charAt(i)) == true) { 
				lowercase[str.charAt(i)-'a']++;
			}
			
			else { 
				uppercase[str.charAt(i)-'A']++;
			}
		}
		
		
		int max_low = Integer.MIN_VALUE;
		int max_high = Integer.MIN_VALUE;
		char maxCharlow = 0;
		char maxCharhigh = 0;
		for(int i = 0; i < lowercase.length; i++) { 
			int max_new_low = Math.max(lowercase[i], max_low);
			int max_new_high = Math.max(max_high, i);
			
			if(max_new_low > max_low) { 
				max_low = max_new_low;
				maxCharhigh = (char)(i+97);
			}
			
			if(max_new_high > max_high) { 
				max_high = max_new_high;
				maxCharhigh = (char)(i+65);
			}
			
			max_low = max_new_low;
			max_high = max_new_high;
		}
		
		if(max_low > max_high) { 
			System.out.println(String.valueOf(maxCharlow));
			System.out.println(max_low);
		}
		
		else { 
			System.out.println(String.valueOf(maxCharhigh));
			System.out.println(max_high);
		}
	}
	
	public static void main(String[] args) {
		printMostCommonLetter("P");
	}
}
