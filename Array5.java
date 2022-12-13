public class Array5 {

    //Method
    public int max(int [] array) {
        int max = 0;
       
        for(int i=0; i<array.length; i++ ) {
           if(array[i]>max) {
              max = array[i];
           }
        }
        return max;

    }

    public static void main(String[] args) {
        
        //5
        Array5 m = new Array5();
        System.out.println("Write a Java program to find the maximum value of an array.");
        System.out.println(" ");
        
        System.out.println("Test Case 1");
        int arr1_3[] = {1,2,9,3,4};
        System.out.println("Output::"+m.max(arr1_3));

        System.out.println(" ");
        System.out.println("Test Case 2");
        int arr2_3[] = {1,2,4,4,-9};
        System.out.println("Output::"+m.max(arr2_3));

        System.out.println(" ");
        System.out.println("Test Case 3");
        int arr3_3[] = {-1,0,3,-4-5};
        System.out.println("Output::"+m.max(arr3_3));
        
    }
}