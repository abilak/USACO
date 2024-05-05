
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.next();
		char[] breeds = str.toCharArray();
		int[] up_to = new int[n];
		for(int i = 0; i < n; i++) { 
			up_to[i] = in.nextInt();
		}
		in.close();
		
		
		ArrayList<Integer> first_leaders = new ArrayList<Integer>();
		
		int num_of_h = 0;

		
		for(int i = 0; i < breeds.length; i++) { 
			if(breeds[i] == 'H') { 
				num_of_h++;
			}
		}
		
		int num_of_g = n-num_of_h;
		
		for(int x = 0; x < breeds.length; x++) {
			int count_g = 0;
			int count_h = 0;
			for(int p = x; p < up_to[x]+1; p++) { 
				if(breeds[p] == 'G') { 
					count_g++;
				}
				
				else { 
					count_h++;
				}
			}
			
			if(breeds[x] == 'G' && (count_h == num_of_h)) { 
				first_leaders.add(x);
			}
			
			else if(breeds[x] == 'H' && (count_g == num_of_g)) { 
				first_leaders.add(x);
			}
		}
		
		System.out.println(first_leaders);
	}
}
