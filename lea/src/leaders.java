import java.util.*;
import java.io.*;
public class leaders {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String cow_list = in.next();
		int[] up_to = new int[n];
		int guernsey = 0;
		int holstein = 0;
		int min_g = Integer.MAX_VALUE;
		int max_g = Integer.MIN_VALUE;
		int min_h = Integer.MAX_VALUE;
		int max_h = Integer.MIN_VALUE;
		for(int i = 0; i < cow_list.length(); i++) { 
			if(((Character)(cow_list.charAt(i))).equals('G')) { 
				guernsey++;
				min_g = Math.min(min_g, i);
				max_g = Math.max(max_g, i);
			}
			else { 
				holstein++;
				min_h = Math.min(min_h, i);
				max_h = Math.max(max_h, i);
			}
		}
		for(int i = 0; i < n; i++) { 
			up_to[i] = in.nextInt()-1;
		}

		int pairs = 0;
		for(int g = 0; g < cow_list.length(); g++) { 
			for(int h = 0; h < cow_list.length(); h++) { 
				if((!((Character)(cow_list.charAt(g))).equals((Character)(cow_list.charAt(h)))) && (((Character)cow_list.charAt(g)).equals('G')) && (((Character)cow_list.charAt(h)).equals('H'))) { 
					int loc_g_count_1 = 0;
					int loc_h_count_2 = 0;
					/*
					for(int i = g; i <= up_to[g]; i++) { 
						if(((Character)cow_list.charAt(i)).equals('G')) { 
							loc_g_count_1++;
						}
					}
					for(int i = h; i <= up_to[h]; i++) { 
						if(((Character)cow_list.charAt(i)).equals('H')) { 
							loc_h_count_2++;
						}
					}
					*/
					if(min_g >= g && up_to[g] >= max_g) { 
						loc_g_count_1 = guernsey;
					}
					if(min_h >= h && up_to[h] >= max_h) { 
						loc_h_count_2 = holstein;
					}
					if((loc_g_count_1 == guernsey) && (loc_h_count_2 != holstein)) { 
						if(h <= g && g <= up_to[h]) { 
							pairs++;
						}
					}
					
					else if((loc_g_count_1 != guernsey) && (loc_h_count_2 == holstein)) { 
						if(g <= h && h <= up_to[g]) { 
							pairs++;
						}
					}
					else if((loc_g_count_1 == guernsey) && (loc_h_count_2 == holstein)) { 
						pairs++;
					}
					
				}

			}
		}
		System.out.println(pairs);
	}
}
