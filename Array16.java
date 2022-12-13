public class Array16
    {
    public static void main(String[] args) {
        
        //16
        System.out.println(" Given an array of ints, return true if the array contains no 1's and no 3's.");
        System.out.println(" ");

        System.out.println("Test Case 1");
        int [] arr1_3 = {0, 2, 4};
        System.out.println("Output:" + arrayOneThree(arr1_3));

        System.out.println(" ");
        System.out.println("Test Case 2");
        int [] arr2_3 = {1, 2, 3};
        System.out.println("Output:" + arrayOneThree(arr2_3));

        System.out.println(" ");
        System.out.println("Test Case 3");
        int [] arr3_3 = {1, 2, 4};
        System.out.println("Output:" + arrayOneThree(arr3_3));
        
        }

        //Method
        public static boolean arrayOneThree(int[] arr) {       
            boolean result = true;

            for (int i =0;i<arr.length ;i++)
            if ( arr[i] == 1 || arr[i] == 3)

            result = false;
            return result;
            
        } 
    } 