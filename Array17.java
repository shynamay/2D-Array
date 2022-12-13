import java.util.*;

public class Array17 {
public static void main(String[] args) {

     List<String> Arraylist = new ArrayList<String>();
        System.out.println(" ");
        System.out.println("Test Case 1");
        Arraylist.add("Blue");
        Arraylist.add("Green");    
        Arraylist.add("Pink");
        
        System.out.println(Arraylist);
        System.out.println(" ");

        System.out.println("Insert 'Black' for the first position.");
        System.out.println("Output::");
        Arraylist.add(0, "Black");

        System.out.println(Arraylist);

    List<String> Array1list = new ArrayList<String>();
        System.out.println(" ");
        System.out.println("Test Case 2");
        Array1list.add("Fish");
        Array1list.add("Shark");    
        Array1list.add("Dolphin");
        
        System.out.println(Array1list);
        System.out.println(" ");

        System.out.println("Insert 'Sea Lion' for the first element.");
        System.out.println("Output::");
        Array1list.add(0, "Sea Lion");

        System.out.println(Array1list);

    List<String> Array2list = new ArrayList<String>();
        System.out.println(" ");
        System.out.println("Test Case 3");
        Array2list.add("Chandler");
        Array2list.add("Monica");    
        Array2list.add("Joey");
        Array2list.add("Phoebe");
        Array2list.add("Ross");
        
        System.out.println(Array2list);
        System.out.println(" ");

        System.out.println("Insert 'Rachel' for the first position.");
        System.out.println("Output::");
        Array2list.add(0, "Rachel");

        System.out.println(Array2list);

    }
}