public class Array13
    {
    public static void main(String[] args) {
        
        //13
        System.out.println(" Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.");
        System.out.println(" ");

        System.out.println("Test Case 1");
        int [] arr1_3 = {2, 3, 2, 2, 4, 2};
        System.out.println("Output:" + sum2and8(arr1_3));

        System.out.println(" ");
        System.out.println("Test Case 2");
        int [] arr2_3 = {2, 3, 2, 2, 4, 2, 2};
        System.out.println("Output:" + sum2and8(arr2_3));

        System.out.println(" ");
        System.out.println("Test Case 3");
        int [] arr3_3 = {1, 2, 3, 4};
        System.out.println("Output:" + sum2and8(arr3_3));
        
        }

        //Method
        public static boolean sum2and8(int[] arr) {
            boolean result =false;
            int sum = 0;
                for (int i = 0; i <arr.length;i++)
                {                
                if (arr[i] == 2) sum+=2;               
                }               
                if (sum == 8) result = true;                  
            
                return result;
            
        }
}   