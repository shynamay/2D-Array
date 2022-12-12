public class Array3 {

    public static int sum(int[] nums){
        int sum = 0;
        for (int i : nums)
        sum += i;
        return sum;

    }

    public static void main(String[] args) {      

        //3
        System.out.println("3. Write a Java program to compute for the sum of values of an integer array with size 5.");

        System.out.println("Test Case 1");
        int [] num1 = {1, 2 ,9, 3, 4};
        System.out.println("Output:" + sum(num1));

        System.out.println("Test Case 2");
        int [] num2 = {1, 2, 3, 4, -9};
        System.out.println("Output:" + sum(num2));
        
        System.out.println("Test Case 3");
        int [] num3 = {-1, 0, 3, -4, -5};
        System.out.println("Output:" + sum(num3));

    }
}