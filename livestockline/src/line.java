import java.util.*;
import java.io.*;
public class line {
	public static void main(String[] args) throws Exception{
		String[] list_of_cows = {"Beatrice", "Belinda", "Bella", "Bessie", "Betsy", "Blue", "Buttercup", "Sue"};
		
		Scanner in = new Scanner(new File("lineup.in"));
		int n = in.nextInt();
		HashMap<String, ArrayList<String>> besides = new HashMap<String, ArrayList<String>>();
		besides.put("Beatrice", new ArrayList<String>());
		besides.put("Belinda", new ArrayList<String>());
		besides.put("Bella", new ArrayList<String>());
		besides.put("Bessie", new ArrayList<String>());
		besides.put("Betsy", new ArrayList<String>());
		besides.put("Blue", new ArrayList<String>());
		besides.put("Buttercup", new ArrayList<String>());
		besides.put("Sue", new ArrayList<String>());
		PrintWriter out = new PrintWriter(new File("lineup.out"));
		for(int i = 0; i < n; i++) {
			String key = in.next();
			String a = in.next();
			String b = in.next(); 
			String c = in.next(); 
			String d = in.next(); 
			String val = in.next(); 
			besides.get(key).add(val);
			besides.get(val).add(key);
		}
		for(int i = 0; i < list_of_cows.length; i++) { 
			LinkedHashSet<String> the_real_list = new LinkedHashSet<String>();
			the_real_list.add(list_of_cows[i]);
			for(int j = 0; j < list_of_cows.length; j++) { 
				the_real_list.add(list_of_cows[j]);
				for(int d = 0; d< list_of_cows.length; d++) { 
					the_real_list.add(list_of_cows[d]);
					for(int g = 0; g < list_of_cows.length; g++) { 
						the_real_list.add(list_of_cows[g]);
						for(int f = 0; f < list_of_cows.length; f++) { 
							the_real_list.add(list_of_cows[f]);
							for(int h = 0; h < list_of_cows.length; h++) { 
								the_real_list.add(list_of_cows[h]);
								for(int s = 0; s < list_of_cows.length; s++)  {
									the_real_list.add(list_of_cows[s]);
									for(int a = 0; a < list_of_cows.length; a++) { 
										the_real_list.add(list_of_cows[a]);
									}
								}
							}
						}
					}
				}
			}
			int count = 0;
			ArrayList<String> correct = new ArrayList<String>();
			if(the_real_list.size() == 8) { 
				
				ArrayList<String> the_real_list2 = new ArrayList<String>();
				for(String c : the_real_list) { 
					the_real_list2.add(c);
				}
				if(the_real_list2.get(0) == "Beatrice" && the_real_list2.get(1) == "Sue") { 
					System.out.println(the_real_list2.toString());
				}
				for(int k = 0; k < the_real_list2.size(); k++) { 
					if(k == 0) { 
						if(besides.get(the_real_list2.get(k)).size() != 0) { 
							if(besides.get(the_real_list2.get(k)).contains(the_real_list2.get(1))) { 
								count++;
							}
						}
					}
					else if(k == 7) { 
						if(besides.get(the_real_list2.get(k)).size() != 0) { 
							if(besides.get(the_real_list2.get(k)).contains(the_real_list2.get(6))) { 
								count++;
							}
						}
					}
					else { 
						if(besides.get(the_real_list2.get(k)).size() != 0) { 
							if((besides.get(the_real_list2.get(k)).contains(the_real_list2.get(k-1))) && (besides.get(the_real_list2.get(k)).contains(the_real_list2.get(k+1)))) { 
								count++;
							}
						}
					}
				}
			}
			
			if(count == 8) { 
				for(String c : the_real_list) { 
					out.println(c);
				}
			}
		}
		out.close();
	}
}
