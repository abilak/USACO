package uno;

public class Main {
	static void printMostCommonLetter(String str) {
	    int[] letter_counts_low = new int[26];
	    int[] letter_counts_up = new int[26];
	    for(int i = 0; i < str.length(); i++) { 
	    	if(Character.isLowerCase(str.charAt(i)) == true) letter_counts_low[str.charAt(i)-'a']++;
	    	else letter_counts_up[str.charAt(i) - 'A']++;
	    }
	    
	    int max_low = 0;
	    for(int i = 0; i < letter_counts_low.length; i++) {
	        max_low = Math.max(letter_counts_low[i], max_low);
	    }
	    
	    int max_up = 0;
	    for(int i = 0; i < letter_counts_up.length; i++) {
	        max_up = Math.max(letter_counts_up[i], max_up);
	    }
	    
	    int the_max = 0; 
	    char the_char = 0;
    	if(max_low > max_up) { 
    		for(int i = 0; i < letter_counts_low.length; i++) { 
    			the_max = max_low;
		    	if(letter_counts_low[i] == max_low) { 
		            if(i == 0) the_char = 'a'; 
		            if(i == 1) the_char = 'b';
		            if(i == 2) the_char = 'c';
		            if(i == 3) the_char = 'd';
		            if(i == 4) the_char = 'e';
		            if(i == 5) the_char = 'f';
		            if(i == 6) the_char = 'g';
		            if(i == 7) the_char = 'h';
		            if(i == 8) the_char = 'i';
		            if(i == 9) the_char = 'j';
		            if(i == 10) the_char = 'k';
		            if(i == 11) the_char = 'l';
		            if(i == 12) the_char = 'm';
		            if(i == 13) the_char = 'n';
		            if(i == 14) the_char = 'o';
		            if(i == 15) the_char = 'p';
		            if(i == 16) the_char = 'q';
		            if(i == 17) the_char = 'r';
		            if(i == 18) the_char = 's';
		            if(i == 19) the_char = 't';
		            if(i == 20) the_char = 'u';
		            if(i == 21) the_char = 'v';
		            if(i == 22) the_char = 'w';
		            if(i == 23) the_char = 'x';
		            if(i == 24) the_char = 'y';
		            if(i == 25) the_char = 'z';
		            break;
		    	}
    		}
	    }
    	
    	else { 
    		for(int i = 0; i < letter_counts_up.length; i++) { 
    			the_max = max_up;
		    	if(letter_counts_up[i] == max_up) { 
		    		if(i == 0) the_char = 'A'; 
		            if(i == 1) the_char = 'B';
		            if(i == 2) the_char = 'C';
		            if(i == 3) the_char = 'D';
		            if(i == 4) the_char = 'E';
		            if(i == 5) the_char = 'F';
		            if(i == 6) the_char = 'G';
		            if(i == 7) the_char = 'H';
		            if(i == 8) the_char = 'I';
		            if(i == 9) the_char = 'J';
		            if(i == 10) the_char = 'K';
		            if(i == 11) the_char = 'L';
		            if(i == 12) the_char = 'M';
		            if(i == 13) the_char = 'N';
		            if(i == 14) the_char = 'O';
		            if(i == 15) the_char = 'P';
		            if(i == 16) the_char = 'Q';
		            if(i == 17) the_char = 'R';
		            if(i == 18) the_char = 'S';
		            if(i == 19) the_char = 'T';
		            if(i == 20) the_char = 'U';
		            if(i == 21) the_char = 'V';
		            if(i == 22) the_char = 'W';
		            if(i == 23) the_char = 'X';
		            if(i == 24) the_char = 'Y';
		            if(i == 25) the_char = 'Z';
		            break;
		    	}
    		}
    	}
	    
	    
	    System.out.println(the_char);
	    System.out.println(the_max);
}
	
	public static void main(String[] args) {
		printMostCommonLetter("HHB");
	}
	
	
}
