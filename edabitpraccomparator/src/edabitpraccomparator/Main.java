package edabitpraccomparator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.next();
		char[] breeds = str.toCharArray();
		int[] up_to = new int[n];
		for(int i = 0; i < n; i++) { 
			up_to[i] = in.nextInt() - 1;
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
			
			if(breeds[x] == 'G' && (count_g == num_of_g)) { 
				first_leaders.add(x);
			}
			
			else if(breeds[x] == 'H' && (count_h == num_of_h)) { 
				first_leaders.add(x);
			}
		}
		
		for(int d = 0; d < breeds.length; d++) { 
			if(first_leaders.contains(d) == false) { 
				for(int j = d; j < up_to[d]+1; j++) { 
					if(first_leaders.contains(j)) { 
						first_leaders.add(d);
					}
				}
			}
		}
		
		int tot_pair = ((first_leaders.size()) * (first_leaders.size() - 1))/2;
		System.out.println(tot_pair);
	}
}