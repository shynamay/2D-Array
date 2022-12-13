public class Array4
    {
    public static void main(String[] args) {
        
        //4
        System.out.println("Write a Java program to find the index of an array element.");
        System.out.println(" ");

        System.out.println("Test Case 1");
        int [] arr1_3 = {1, 2, 9, 3, 4};
        System.out.println("Index of 9 is : " + findIndex(arr1_3, 9));

        System.out.println(" ");
        int [] arr2_3 = {1, 2, 3, 4, -9};
        System.out.println("Index of 0 is : " + findIndex(arr2_3, 0));
        
        System.out.println(" ");
        int [] arr3_3 = {-1, 0, 3, -4, -5};
        System.out.println("Index of -5 is : " + findIndex(arr3_3, -5));

        }

        //Method
        public static int  findIndex (int[] Array, int t) {
            if (Array == null) return -1;
            int len = Array.length;
            int i = 0;
            while (i < len) {
                if (Array[i] == t) return i;
                else i=i+1;
            }
            return -1;
        }
    }     
