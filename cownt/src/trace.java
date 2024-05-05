import java.util.*;
public class trace {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		int one_count = 0;
		String infect_state = in.next(); 
		ArrayList<Integer> streaks = new ArrayList<Integer>();
		Set<Integer> night_spread = new HashSet<Integer>();
		int counter = 0;
		for(int i = 0; i < infect_state.length(); i++) { 
			if(i == infect_state.length()-1) { 
				if(((Character)infect_state.charAt(i)).equals('0')) { 
					night_spread.add(Math.floorDiv(counter, 2));
				}
				
				else { 
					night_spread.add(Math.floorDiv(counter+1, 2));
				}
			}
			else { 
				if(((Character)infect_state.charAt(i)).equals('1')) { 
					if(i == 0) {
						streaks.add(1);
						counter = 1;
					}
					else if((((Character)infect_state.charAt(i-1)).equals('0'))) { 
						streaks.add(1);
						counter++;
					}
					else if(((((Character)infect_state.charAt(i-1)).equals('1')))) { 
						counter++;
					}
					
					
				}
				
				else { 
					night_spread.add(Math.floorDiv(counter, 2));
					counter = 0;
				}
			}
			
		}

		if(night_spread.size() == 1) { 
			System.out.println(streaks.size());
		}
		else { 
			for(int i = 0; i < infect_state.length(); i++) { 
				if(((Character)infect_state.charAt(i)).equals('1')) { 
					one_count++;
				}
			}
			System.out.println(one_count);
		}
		
	}
}
