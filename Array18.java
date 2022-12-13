import java.util.*;

public class Array18 {

    public static void main(String[] args)

    {
        //1
        List<String> Arraylist_str = new ArrayList<String>();
        System.out.println(" ");
        System.out.println("Test Case 1");
        Arraylist_str.add("Blue");
        Arraylist_str.add("Green");    
        Arraylist_str.add("Pink");

        System.out.println(Arraylist_str);
        String element = Arraylist_str.get(1);
        System.out.println("Output:: "+element);
        System.out.println(" ");

        //2
        List<String> Array1list_str = new ArrayList<String>();
        System.out.println(" ");
        System.out.println("Test Case 2");
        Array1list_str.add("Sea Lion");
        Array1list_str.add("Fish");    
        Array1list_str.add("Shark");
        Array1list_str.add("Dolphin");

        System.out.println(Array1list_str);
        String element1 = Array1list_str.get(0);
        System.out.println("Output:: "+element1);
        System.out.println(" ");

        //3
        List<String> Array2list_str = new ArrayList<String>();
        System.out.println(" ");
        System.out.println("Test Case 3");
        Array2list_str.add("Rachel");
        Array2list_str.add("Chandler");    
        Array2list_str.add("Monica");
        Array2list_str.add("Joey");
        Array2list_str.add("Phoebe");
        Array2list_str.add("Ross");

        System.out.println(Array2list_str);
        String element2 = Array2list_str.get(7);
        System.out.println("Output:: "+element2);
        System.out.println(" ");
    }
}