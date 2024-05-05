package dos;

import java.util.Arrays;

public class Main {
	static void movingAnimals(String[] animals, int[] array){
		String[] moved_animals = new String[animals.length];
	    for(int index = 0; index < animals.length; index++) { 
	    	moved_animals[array[index]] = animals[index];
	    }
	    
	    
	    animals = moved_animals;
	    System.out.println(Arrays.toString(animals));
	}
	
	public static void main(String[] args) {
		String[] animals = {"Cat","Dog","Bug"};
		int[] array = {0, 2, 1};
		String[] moved_animals = new String[animals.length];
	    for(int index = 0; index < animals.length; index++) { 
	    	moved_animals[array[index]] = animals[index];
	    }
	    
	    animals = moved_animals;
	    
	    System.out.println(Arrays.toString(animals));
	    System.out.println(Arrays.toString(moved_animals));
	}
}
