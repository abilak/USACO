package cuatro;

import java.util.*;

public class Main {
	static double[][] tile(double[][] grid, int n) {
	    double[][] return_this = new double[grid.length*n][grid[0].length*n];
	    if(n == 0) { 
	        double[][] thing = new double[0][0];
	        return thing;
	    }
	    
	    else if(n==1) { 
	        return grid;
	    }
	    for(int i = 0; i < grid.length; i++) { 
	    	for(int x = 0; x < grid[0].length; x++) { 
	    		for(int d = 0; d < return_this[i].length-x; d+=grid[0].length) { 
	    			for(int z = 0; z < return_this.length; z+=grid.length) { 
	    				return_this[i+z][x+d] = grid[i][x];
	    			}
	    		}
	    	}
	    }
	    return return_this;
	}
	
	public static void main(String[] args) {
		double[][] grid = {{15.0}};
		System.out.println(Arrays.deepToString(tile(grid, 2)));
	}
}
