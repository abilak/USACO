import java.util.*;
public class alch {
	public static int get_metal_n(int[] arr, HashMap<Integer, ArrayList<Integer>> recipes, int metal_n) { 
		int[] new_arr = Arrays.copyOf(arr, arr.length);
		
		for(int i = 0; i < recipes.get(metal_n).size(); i++) { 
			get_metal_n(int[] new_arr, HashMap<Integer, ArrayList<Integer>> recipes, recipes.get(metal_n).get(i));
		}
		return 5;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		HashMap<Integer, ArrayList<Integer>> recipes = new HashMap<Integer, ArrayList<Integer>>();
		// metal maps to its constituent metals that make it up
		int n = in.nextInt(); 
		int[] num_of_each_metal = new int[n]; // each index, corresponds with the metal n+1. 
		// index 0 is metal 1 and the value in the array at that index is the amount of metal that bessie has
		
		for(int i = 0; i < n; i++) { 
			num_of_each_metal[i] = in.nextInt(); 
		}
		
		int k = in.nextInt(); 
		for(int i = 0; i < k; i++) { 
			int the_metal = in.nextInt(); 
			int m = in.nextInt(); 
			recipes.put(the_metal, new ArrayList<Integer>());
			for(int d = 0; d < m; d++) { 
				recipes.get(the_metal).add(in.nextInt());
			}
		}
	}
}
