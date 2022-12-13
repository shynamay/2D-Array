public class Array8
    {
        public static void main(String[] args) {
            
            //8
            System.out.println("8. Given an array of ints of odd length, look at the first, last and Middle values in the array and return the largest. The array lenght will be atleast 1. ");
            System.out.println(" ");

            System.out.println(" ");
            System.out.println("Test Case 1");
            int [] arr1_3 = {1, 2, 3};
            System.out.println("Output:" + maxTriple(arr1_3));
            
            System.out.println(" ");
            System.out.println("Test Case 2");
            int [] arr2_3 = {1, 5, 2};
            System.out.println("Output:" + maxTriple(arr2_3));
            
            System.out.println(" ");
            System.out.println("Test Case 3");
            int [] arr3_3 = {9, 5, 2, 3, 7};
            System.out.println("Output:" + maxTriple(arr3_3));
            
            }
          
            //Method
            public static int maxTriple(int[] arr) {
            int max = arr[0];
            
            if(max < arr[arr.length / 2])
                max = arr[arr.length / 2];
                      
            if(max < arr[arr.length - 1])
                max = arr[arr.length - 1];
                                
            return max;
        }
    }