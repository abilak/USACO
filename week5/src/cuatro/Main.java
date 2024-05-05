package cuatro;

public class Main {
	static int fillFamilies(String[] stalls, String[] families, int[] familySizes) {
		int from_left = 0; 
		int from_right = 0;
		for(int i = 0; i < families.length; i++) { 
			if(i % 2 == 0) { 
				int count = 0;
				for(int x = 0; x < stalls.length; x++) { 
					if(stalls[x] == null) count++;
				}
				if(count < familySizes[i]) { 
					return i;
				}
				
				else { 
					for(int p = 0; p < familySizes[i]; p++) { 
						stalls[from_left] = families[i];
						from_left++;
					}
				}
			}
			
			else { 
				int count = 0;
				for(int x = 0; x < stalls.length; x++) { 
					if(stalls[x] == null) count++;
				}
				if(count < familySizes[i]) { 
					return i;
				}
				
				else { 
					for(int p = 0; p < familySizes[i]; p++) { 
						stalls[(stalls.length-1) - from_right] = families[i];
						from_right++;
					}
				}
			}
		}
		
	    return -1;
	}
	public static void main(String[] args) {
		String[] stalls = {null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
		String[] families = {"fox","kangaroo","llama","pig","cat","elephant","bear"};
		int[] familySizes = {1,5,4,2,5,4,5};
		System.out.println(fillFamilies(stalls, families, familySizes));
	}
}
