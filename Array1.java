public class Array1
    {
        public static void main(String[] args) {
            
            //1
            System.out.println("1. Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.");
            System.out.println("Test Case 1");
            int [] num1 = {1, 1 ,2, 3, 1};
            System.out.println("Output:" + arrayOneTwoThree(num1));
            System.out.println(" ");
            
            System.out.println("Test Case 2");
            int [] num2 = {1, 1, 2, 4, 1};
            System.out.println("Output:" + arrayOneTwoThree(num2));
            System.out.println(" ");
            
            System.out.println("Test Case 3");
            int [] num3 = {1, 1, 2, 1, 2, 3};
            System.out.println("Output:" + arrayOneTwoThree(num3));
            System.out.println(" ");
            
            }
            
            public static boolean arrayOneTwoThree(int[] nums) {

 
            for(int i = 0; i < nums.length - 2; i++) {
                if(nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3){
                    return true;
               }
           }
           return false;
        }
    }