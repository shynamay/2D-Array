import java.util.*;

      public class Array20 {
      public static void main(String[] args) {

      // Create a Array list 
      List<String> Arraylist_Strings = new ArrayList<String>();
      System.out.println(" ");
      System.out.println("Test Case 1");
      Arraylist_Strings.add("Blue");
      Arraylist_Strings.add("Green");
      Arraylist_Strings.add("Pink");

      System.out.println(Arraylist_Strings);

      // Add and Remove specific Array element
      Arraylist_Strings.remove(1);
      Arraylist_Strings.add(1, "Yellow");

      System.out.println("Output:: "+Arraylist_Strings);
      System.out.println(" ");

      // Create a Array list 
      List<String> Array1list_Strings = new ArrayList<String>();
      System.out.println(" ");
      System.out.println("Test Case 2");
      Array1list_Strings.add("Sea Lion");
      Array1list_Strings.add("Fish");
      Array1list_Strings.add("Shark");
      Array1list_Strings.add("Dolphin");

      System.out.println(Array1list_Strings);

      // Add and Remove specific Array element
      Array1list_Strings.remove(0);
      Array1list_Strings.add(0, "Jelly Fish");

      System.out.println("Output:: "+Array1list_Strings);
      System.out.println(" ");

      // Create a Array list 
      List<String> Array2list_Strings = new ArrayList<String>();
      System.out.println(" ");
      System.out.println("Test Case 3");
      Array2list_Strings.add("Rachel");
      Array2list_Strings.add("Chandler");
      Array2list_Strings.add("Monica");
      Array2list_Strings.add("Joey");
      Array2list_Strings.add("Phoebe");
      Array2list_Strings.add("Ross");
      
      System.out.println(Array2list_Strings);

      // Add and Remove specific Array element
      Array2list_Strings.remove(2);
      Array2list_Strings.add(2, "Janice");

      System.out.println("Output:: "+Array2list_Strings);
      System.out.println(" ");
      
    }
}