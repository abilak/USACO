import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class trace2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		int one_count = 0;
		String infect_state = in.next(); 
		ArrayList<Integer> streaks = new ArrayList<Integer>();
		boolean thing = false;
		for(int i = 0; i < infect_state.length()-2; i++) { 
			StringBuilder sb = new StringBuilder();
			sb.append(infect_state.charAt(i));
			sb.append(infect_state.charAt(i+1));
			sb.append(infect_state.charAt(i+2));
			if(sb.toString().equals("101") || sb.toString().equals("010")) { 
				thing = true;
			}
			sb.delete(0, sb.length());
		}

		if(thing) { 
			for(int f = 0; f < infect_state.length(); f++) { 
				if(((Character)infect_state.charAt(f)).equals('1')) { 
					one_count++;
				}
			}
			System.out.println(one_count);
		}
		else {
			System.out.println(1);
		}
		
	}
}
