import java.util.*;
import java.io.*;

public class triangle {
	public static int distance(int[] arr4, int[] arr5) { 
		return (int)Math.sqrt(Math.pow((arr5[1]-arr4[1]), 2) + Math.pow((arr5[0]-arr4[0]), 2));
	}
	public static int isTriangle(int[] arr, int[] arr2, int[] arr3) { 
		int[][] alldarrs = {arr, arr2, arr3};
		// arr is the vertex
		int twoney = (arr2[1]-arr[1]);
		int twonex = (arr2[0]-arr[0]);
		int threeoney = (arr3[1]-arr[1]);
		int threeonex = (arr3[0]-arr[0]);
		if((((twoney == 0) && (threeonex == 0)) || ((twonex == 0) && (threeoney == 0))) && ((!arr.equals(arr2) || (!arr.equals(arr3))))) { 
			return (distance(arr, arr2) * distance(arr,arr3));
		}

		
		int onetwoy = arr[1] - arr2[1];
		int onetwox = (arr[0]-arr2[0]);
		int threetwoy = (arr3[1]-arr2[1]);
		int threetwox = (arr3[0]-arr2[0]);
		if((((onetwoy == 0) && (threetwox == 0)) || ((onetwox == 0) && (threetwoy == 0))) && ((!arr2.equals(arr) || (!arr2.equals(arr3))))) { 
			return (distance(arr2, arr3) * distance(arr2, arr));
		}
		
		int onethreey = arr[1] - arr2[1];
		int onethreex = (arr[0]-arr2[0]);
		int twothreey = (arr3[1]-arr2[1]);
		int twothreex = (arr3[0]-arr2[0]);
		if((((onethreey == 0) && (twothreex == 0)) || ((onethreex == 0) && (twothreey == 0))) && ((!arr3.equals(arr2) || (!arr3.equals(arr))))) { 
			return (distance(arr3, arr) * distance(arr3, arr2));
		}
		
		return 0;
		
	}
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("triangles.in"));
		int n = in.nextInt();
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) { 
			int x_coord = in.nextInt();
			int y_coord = in.nextInt();
			int[] thingy = {x_coord,y_coord};
			arr[i] = thingy;
		}
		int[] arr1 = {0,0}; 
		int[] arr2 = {1,0};
		int[] arr3 = {1,2};
		int result = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) { 
			for(int d = 0; d < arr.length; d++) { 
				for(int c = 0; c < arr.length; c++) { 
					int thing = isTriangle(arr[i], arr[d], arr[c]);
					if(thing != 0) { 
						result = Math.max(result, thing);
					}
				}
			}
		}
		
		PrintWriter out = new PrintWriter(new File("triangles.out"));
		out.println((int)result);
		out.close();
	}
	
}
