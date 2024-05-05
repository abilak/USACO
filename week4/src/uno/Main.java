package uno;


public class Main {
	static boolean isValid(int[] array){
		int[] indices = new int[array.length];
		int count = 0;
		for(int x = 0; x < array.length; x++) { 
			indices[x] = x;
		}
		
		for(int i = 0; i < indices.length; i++) { 
			for(int p = 0; p < array.length; p++) { 
				if(array[p] == indices[i]) { 
					count++;
					continue;
				}
			}
		}
		
		if(count == indices.length) { 
			return true;
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {0, 1, 2};
		System.out.println(isValid(arr));
		
		
	}
}
