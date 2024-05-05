package adjpairs;

import java.util.*;

public class Main {
	static int findPair(int[] array, int a, int b){ 
		for(int i = 0; i < array.length-1; i++) { 
			if(array[i] == a && array[i+1] == b) { 
				return i;
			}
		}
		return -1; 
	}
	
	public static void main(String[] args) {
		int[] array = {5,19,17,19,10,1,8,18,16,12,13,12,8,10,12,0,5};
		int a = 19;
		int b = 17;
		
		System.out.println(findPair(array, a ,b));
		
		
		
		ArrayList<Integer> listarr = new ArrayList<Integer>();
		
		for(int i = 0; i < array.length; i++) { 
			listarr.add(array[i]);
		}
		
		listarr.remove(0);
		System.out.println("____________________________");
		for(int x : listarr) { 
			System.out.println(x);
		}
		
		System.out.println("____________________________");
		
		boolean[] check = new boolean[3];
		int[] arr2 = {0, 1,1,2,2};
		for(int i = 0; i < arr2.length; i++) { 
			check[arr2[i]] = true;
		}
		
		int result = 0;
		
		for(int i = 0; i < check.length; i++) { 
			if(check[i]) result++;
		}
		
		System.out.println("bool check arr: "+result);
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < arr2.length; i++) { 
			set.add(arr2[i]);
		}
		
		System.out.println("set: " + set.size());
	}
}
