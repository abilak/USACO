import java.util.*;
import java.io.*;
public class revege {
	public static void main(String[] args) throws Exception{ 
		Scanner in = new Scanner(new File("revegetate.in")); 
		
		int n = in.nextInt();
		int m = in.nextInt();
		Field[] fields = new Field[n]; // field 3 corresponds to index 2
		
		for(int i = 0; i < fields.length; i++) { 
			fields[i]= new Field();
			fields[i].grass = 0;
			fields[i].name = "Field" + Integer.toString(i+1);
		}
		
		for(int i = 0; i < m; i++) { 
			int field1 = in.nextInt();
			int field2 = in.nextInt();
			fields[field1-1].connections.add(fields[field2-1]);
			fields[field2-1].connections.add(fields[field1-1]);
		}
		fields[0].grass = 1;
		String result = "1"; 
		for(int i = 1; i < fields.length; i++) { 
			HashSet<Integer> grass_stuff = new HashSet<Integer>();
			
			for(int j = 0; j < fields[i].connections.size(); j++) { 
				grass_stuff.add(fields[i].connections.get(j).grass);
			}
			for(int d = 1; d <= 4; d++) { 
				if(grass_stuff.contains(d) == false) { 
					fields[i].grass = d;
					break;
				}
			}
			result+=String.valueOf(fields[i].grass);
		}
		PrintWriter out = new PrintWriter(new File("revegetate.out"));
		out.println(result);
		System.out.println(result);
		out.close();
	}

}

class Field {
    int grass = 0;
    String name = "";
    // 0 = unplanted
    List<Field> connections = new ArrayList<>();
    
    public String toString() { 
    	return name;
    }

}
