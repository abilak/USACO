

import java.util.*;
import java.io.*;

public class paint {
  static final String FILE_NAME = "paint";

  public static void main(String[] args) throws FileNotFoundException {
    Scanner in = new Scanner(new File(FILE_NAME + ".in"));
    int n = in.nextInt();
    int m = in.nextInt();
    int o = in.nextInt();
    int p = in.nextInt();
    in.close();
    Set<Integer> johnset = new HashSet<>();
    for(int i = n; i < m; i++) { 
    	johnset.add(i);
    }
    
    for(int j = o; j < p; j++) { 
    	johnset.add(j);
    }
    

    int result = johnset.size();

    PrintWriter out = new PrintWriter(new File(FILE_NAME + ".out"));
    out.println(result);
    System.out.println(result);
    out.close();
  }
}


/* 


import java.util.*;
import java.io.*;

public class paint {
  static final String FILE_NAME = "paint";

  public static void main(String[] args) throws FileNotFoundException {
    Scanner in = new Scanner(new File(FILE_NAME + ".in"));
    int n = in.nextInt();
    int m = in.nextInt();
    int o = in.nextInt();
    int p = in.nextInt();
    in.close();
    Set<Integer> johnset = new HashSet<>();
    Set<Integer> bessieset = new HashSet<>();
    for(int i = n; i < m; i++) { 
    	johnset.add(i);
    }
    
    for(int j = o; j < p; j++) { 
    	bessieset.add(j);
    }
    
    johnset.addAll(bessieset);

    int result = johnset.size();

    PrintWriter out = new PrintWriter(new File(FILE_NAME + ".out"));
    out.println(result);
    System.out.println(result);
    out.close();
  }
}
 
*/
