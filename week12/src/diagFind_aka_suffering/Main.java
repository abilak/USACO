package diagFind_aka_suffering;

import java.util.*;

public class Main {
	static String diagFind(String[] rows, char c1, char c2) {
		char[][] char2d = new char[rows.length][rows[0].length()];
		HashSet<String> diags = new HashSet<String>();
		
		for(int i = 0; i < rows.length; i++) { 
			for(int x = 0; x < rows[0].length(); x++) { 
				char2d[i][x] = rows[i].charAt(x);
			}
		}
		
		// use a treeset to get it alphabetical and add to hashset
		diags.add(String.valueOf(char2d[0][0]));
		diags.add(String.valueOf(char2d[0][char2d[0].length - 1]));
		diags.add(String.valueOf(char2d[char2d.length - 1][0]));
		diags.add(String.valueOf(char2d[char2d.length - 1][char2d[0].length - 1]));
		for(int i = 0; i < char2d.length; i++) { 
			
		}
		System.out.println(Arrays.toString(char2d[0]));
		System.out.println(Arrays.toString(char2d[1]));
		System.out.println(Arrays.toString(char2d[2]));
		 
		for(int i = 0; i < (char2d.length)-1; i++) { 
			for(int x = 0; x < (char2d[0].length)-1; x++) { 
				int loc_row = i; 
				int loc_col = x;
				ArrayList<Character> temp = new ArrayList<Character>();
				if(i == 0) { 
					while(loc_row < (char2d.length) && loc_col < (char2d[0].length)) { 
						temp.add(char2d[loc_row][loc_col]);
						loc_row++;
						loc_col++;
					}
				}
				
				else if(i != 0 && x == 0) { 
					while(loc_row < (char2d.length) && loc_col < (char2d[0].length)) { 
						temp.add(char2d[loc_row][loc_col]);
						loc_row++;
						loc_col++;
					}
				}
				
				StringBuilder sb = new StringBuilder();
				
				for(char c : temp) { 
					sb.append(c);
				}
				
				String diag_add_str = sb.toString();
				diags.add(diag_add_str);
			}
		}
		
		ArrayList<String> arrd = new ArrayList<String>();
		Iterator<String> it = diags.iterator(); 
		while(it.hasNext()) {
			arrd.add(it.next());
		}
		
		int[] arr_count = new int[arrd.size()];
		
		for(int i = 0; i < arrd.size(); i++) { 
			for(int x = 0; x < arrd.get(i).length(); x++) { 
				if((arrd.get(i).charAt(x) - 'A') >= (c1-'A') && (arrd.get(i).charAt(x) - 'A') <= (c2- 'A')) { 
					arr_count[i]++;
				}
			}
		}
		
		int maxer = 0;
		
		for(int p = 0; p < arr_count.length; p++) { 
			maxer = Math.max(maxer, arr_count[p]);
		}
		String return_str = "";
		for(int d = 0; d < arr_count.length; d++) { 
			if(maxer == arr_count[d]) { 
				return_str = arrd.get(d);
			}
		}

	    return return_str;
	}
	public static void main(String[] args) {
		String[] rows = {"KABOOM","HAHAHA","CRIKEY"};
		
		System.out.println(diagFind(rows, 'A', 'E'));
	}
}
