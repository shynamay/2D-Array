public class Array7 {

    public static void main(String[] args) {
            
        //7
        System.out.println("1. Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("Test Case 1");
        int [] arr1_3 = {1, 2, 6};
        System.out.println("Output:" + firstlast6(arr1_3));
  
        System.out.println(" ");
        System.out.println("Test Case 2");
        int [] arr2_3 = {6, 1, 2, 3};
        System.out.println("Output:" + firstlast6(arr2_3));
     
        System.out.println(" ");
        System.out.println("Test Case 3");
        int [] arr3_3 = {13, 6, 1, 2, 3};
        System.out.println("Output:" + firstlast6(arr3_3));
        
        }
        
    // Method        
	public static boolean firstlast6(int[] arr) 
	{
		if(arr[0]==6 || arr[arr.length-1] == 6)
			return true;
		else
			return false;
	}
}