import java.util.*;
public class operationsmoo {
	public static int counting(String str, char ch) { 
		int counter = 0;
		for(int i = 0; i < str.length(); i++) { 
			char chara = str.charAt(i);
			if(chara == ch) { 
				counter++;
			}
		}
		
		return counter;
	}
	
	public static int counting2(char[] stri, char ch2) { 
		int counter2 = 0;
		for(int k = 0; k < stri.length; k++) { 
			char charac = stri[k];
			if(charac == (ch2)) { 
				counter2++;
			}
		}
		
		return counter2;
	}
	
	public static boolean numberInRange(int beginc, int endinc, int num) { 
		
		for(int i = beginc; i < endinc; i++) { 
			if(i == num) { 
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean arrContains(ArrayList<Integer> poss_leaders_on_count, int num) { 
		for(int i = 0; i < poss_leaders_on_count.size(); i++) { 
			if(poss_leaders_on_count.get(i) == num) { 
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String ting = in.next();
		char[] breeds = new char[n];
		for(int x = 0; x < n; x++) { 
			breeds[x] = ting.charAt(x);
		}
		
		int[] up_to = new int[n];
		
		for(int d = 0; d < n; d++) { 
			up_to[d] = in.nextInt() - 1;
		}
		in.close();
		
		int num_of_h = counting(ting, 'H');
		int num_of_g = counting(ting, 'G');

		ArrayList<Integer> poss_leaders_on_count = new ArrayList<Integer>();
		ArrayList<Integer> other_leaders = new ArrayList<Integer>();
		// finding the first round of cows that could be leaders based on if their list
		// contains all the cows of their breed
		for(int p = 0; p < breeds.length; p++) { 
			char[] new_arr = new char[up_to[p] - p + 1];

			for(int l = p; l <= up_to[p]; l++) {
				try { 
					new_arr[l] = breeds[p];
				}
				
				catch(Exception e) { 
					break;
				}
			}
			
			System.out.println(Arrays);
			if(breeds[p] == 'G') { 
				if(counting2(new_arr, 'H') == num_of_h) { 
					System.out.println(p);
					poss_leaders_on_count.add((Integer)p);
				}
			}
			
			else { 
				if(counting2(new_arr, 'G') == num_of_g) { 
					System.out.println(p);
					poss_leaders_on_count.add((Integer)p);
				}
			}
		}
		
		for(int j = 0; j < breeds.length; j++) { 
			if(arrContains(poss_leaders_on_count, j) == false) { 
				for(int z = 0; z < poss_leaders_on_count.size(); z++) { 
					if(numberInRange(j, up_to[j], poss_leaders_on_count.get(z)) == true) { 
						other_leaders.add(j);
						break;
					}
				}
			}
		}
		int howbig = poss_leaders_on_count.size() + other_leaders.size();
		int tot_pair = (howbig * (howbig-1))/2;
		
		System.out.println(tot_pair);
		System.out.println(poss_leaders_on_count);
		
		
	}
	
}
