public class Array6 {
    public int min(int [] array) {
        int min = array[0];
       
        for(int i=0; i<array.length; i++ ) {
           if(array[i]<min) {
              min = array[i];
           }
        }
        return min;

    }

    public static void main(String[] args) {
        
        Array6 m = new Array6();
        System.out.println("Test Case 1");
        int arr1_3[] = {1,2,9,3,4};
        System.out.println("Minimum value in the array is::"+m.min(arr1_3));
        System.out.println("Test Case 2");
        int arr2_3[] = {1,1,2,4,4};
        System.out.println("Minimum value in the array is::"+m.min(arr2_3));
        System.out.println("Test Case 3");
        int arr3_3[] = {-1,0,3,-4,-5};
        System.out.println("Miniimum value in the array is::"+m.min(arr3_3));
        
    }
}
