public class Array15
    {
    public static void main(String[] args) {
        
        //15
        System.out.println("Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.");
        System.out.println(" ");

        System.out.println("Test Case 1");
        int [] arr1_3 = {1, 2, 2};
        System.out.println("Output:" + two2four4(arr1_3));

        System.out.println(" ");
        System.out.println("Test Case 2");
        int [] arr2_3 = {4, 4, 1};
        System.out.println("Output:" + two2four4(arr2_3));

        System.out.println(" ");
        System.out.println("Test Case 3");
        int [] arr3_3 = {2, 2, 1, 4, 4};
        System.out.println("Output:" + two2four4(arr3_3));
        
        }

        //Method
        public static boolean two2four4(int[] arr) {
            int two =0, four = 0;
            for (int i =0;i<arr.length-1;i++)

            {

            if(arr[i] == 2 && arr[i+1] == 2)
            two++;

            if (arr[i] == 4 && arr[i+1] == 4)
            four++;

            }

            if (two!=0 && four!=0)
            return false;

            else if (two!=0 || four!=0)
            return true;

            else
            return false;
        }  
   }  
         