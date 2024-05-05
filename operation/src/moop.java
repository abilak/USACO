import java.util.*;
public class moop {
	public static int num_op(String word) { 
		char[] word_arr = word.toCharArray();
		ArrayList<Integer> mo_num = new ArrayList<Integer>();
		ArrayList<Integer> oo_num = new ArrayList<Integer>();
		ArrayList<Integer> poss = new ArrayList<Integer>();
		for(int i = 0; i < word.length()-1; i++) { 
			StringBuilder sub_word = new StringBuilder();
			sub_word.append(word.charAt(i));
			sub_word.append(word.charAt(i+1));
			if(sub_word.toString().equals("MO")) { 
				mo_num.add(i);
				try { 
					sub_word.append(word.charAt(i+2));
					if(sub_word.toString().equals("MOO")) { 
						poss.add(i + (word.length()-1-(i+2)));
					}
					else { 
						poss.add(i + 1 + (word.length()-1-(i+2)));
					}
				}
				
				catch(Exception e) { 
					continue;
				}
			}
			else if(sub_word.toString().equals("OO")) { 
				oo_num.add(i);
				try { 
					sub_word.insert(0, word.charAt(i-1));
					if(sub_word.toString().equals("MOO")) { 
						poss.add(i + (word.length()-1-(i+1)));
					}
					else { 
						poss.add(i + 1+(word.length()-1-(i+1)));
					}
				}
				
				catch(Exception e) { 
					continue;
				}
			}
		}
		if(poss.size()==0) { 
			return -1;
		}
		else { 
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < poss.size(); i++) { 
				min = Math.min(min, poss.get(i));
			}
			return min;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 

		for(int i = 0; i < n; i++) { 
			System.out.println(num_op(in.next()));
		}
	}
}
