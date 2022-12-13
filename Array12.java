public class Array12
    {
    public static void main(String[] args) {
        
        //10

        System.out.println(" ");
        System.out.println("Test Case 1");
        int [] arr1_3 = {2, 1, 2, 3, 4};
        System.out.println("Output:: " + countEvens(arr1_3));

        System.out.println(" ");
        System.out.println("Test Case 2");
        int [] arr2_3 = {2, 2, 0};
        System.out.println("Output:: " + countEvens(arr2_3));

        System.out.println(" ");
        System.out.println("Test Case 3");
        int [] arr3_3 = {1, 3, 5};
        System.out.println("Output:: " + countEvens(arr3_3));

    }

        public static int countEvens(int[] nums) {
            int even = 0;
            
              for (int count=0; count < nums.length; count++) {
              if (nums[count] % 2 == 0)
              even++;
        
              }

              return even;     
            
        }
    }  