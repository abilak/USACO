import java.util.*;
public class lonelyphoto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		String line_up = in.next(); 
		int lonely_photos = 0;
		for(int i = 0; i < line_up.length(); i++) { 
			Character curr_breed = line_up.charAt(i);
			Character opp_breed;
			if(curr_breed.equals('G')) { 
				opp_breed = 'H';
			}
			else { 
				opp_breed = 'G';
			}
			if(i == 0) { 
				int index = 1; 
				int streak = 0;
				while(index <= line_up.length()-1 && !((Character)line_up.charAt(index)).equals(curr_breed)) { 
					if(((Character)line_up.charAt(index)).equals(opp_breed)) { 
						streak++;
					}
					index++;
				}
				lonely_photos += streak-1;
			}
			
			else if(i == line_up.length() - 1) { 
				int index2 = line_up.length()-2;
				int streak2 = 0;
				while(index2 >= 0 && !((Character)line_up.charAt(index2)).equals(curr_breed)) { 
					if(((Character)line_up.charAt(index2)).equals(opp_breed)) { 
						streak2++;
					}
					index2--;
				}
				lonely_photos += streak2 - 1;
			}
			
			else { 
				int index = i+1; 
				int streak = 0;
				while(index <= line_up.length()-1 && !((Character)line_up.charAt(index)).equals(curr_breed)) { 
					if(((Character)line_up.charAt(index)).equals(opp_breed)) { 
						streak++;
					}
					index++;
				}
				
				int index2 = i-1;
				int streak2 = 0;
				while(index2 >= 0 && !((Character)line_up.charAt(index2)).equals(curr_breed)) { 
					if(((Character)line_up.charAt(index2)).equals(opp_breed)) { 
						streak2++;
					}
					index2--;
				}
				
				if(streak2 > 0 && streak > 0) { 
					lonely_photos += streak2 * streak; 
					lonely_photos += streak2-1;
					lonely_photos += streak-1;
				}
				
				else if(streak2 > 0 && streak == 0) { 
					lonely_photos += streak2-1;
				}
				
				else if(streak2 == 0 && streak > 0) { 
					lonely_photos += streak-1;
				}
				
			}
		}
		System.out.println(lonely_photos);
	}
}
