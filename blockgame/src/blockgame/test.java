package blockgame;
import java.util.*;
public class test {
	
	static int[][] trim(int[][] grid, int rows, int cols) {
	    int[][] trim = new int[rows][cols];
	    int[] arr2 = new int[0];
	    if(cols == 0) { 
	       for(int i = 0; i < rows; i++) { 
	           trim[i] = arr2;
	       }
	       
	       return trim;
	    }
	    
	    else { 
	        int starting_row = grid.length - rows;
	        int starting_col = grid[0].length - cols;
	        for(int c = starting_row; c < grid.length; c++) {
	                trim[c-starting_row] = Arrays.copyOfRange(grid[c], starting_col, grid[0].length);
	        }
	        
	        return trim;
	    }
	    
	}
	public static void main(String[] args) {
		int[][] values = {{5,11,0,11,3,10},{9,2,5,12,14,8},{11,6,9,19,17,8},{18,7,2,20,14,3},{13,4,5,6,12,12}};
		int rows = 3;
		int cols = 6;
		System.out.println(Arrays.deepToString(trim(values, rows ,cols)));
	}
}
