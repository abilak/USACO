package tres;

import java.util.Arrays;

public class Main {
	static String[] cowsInStalls(String[] cowsArriving, boolean[] cowEntersLeft) {
		String[] temp = new String[cowsArriving.length];
		int from_left = 0;
		int from_right = 0;
		
		for(int i = 0; i < cowsArriving.length; i++) { 
			if(cowEntersLeft[i] == true) { 
				temp[from_left] = cowsArriving[i];
				from_left++;
			}
			else { 
				int len = cowsArriving.length-1;
				temp[len-from_right] = cowsArriving[i];
				from_right++;
			}
		}
		
		for(int x = 0; x < temp.length; x++) { 
			cowsArriving[x] = temp[x];
		}
		
		return cowsArriving;
	    
	}
	public static void main(String[] args) {
		String[] first = {"aardvark","yak","kangaroo","hamster","bear"};
		boolean[] second = {true,true,true,false,true};
		System.out.println(Arrays.toString(cowsInStalls(first, second)));
	}
}
