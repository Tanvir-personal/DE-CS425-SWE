package codingPractice;

public class Main {
    static void printHelloWorld(int[] nums){
        for(int i : nums){
            if((i%5) == 0 && (i%7) == 0)
                System.out.println("Hello World");
            else if((i%5) == 0)
                System.out.println("Hello");
            else if((i%7) == 0)
                System.out.println("World");
        }
    }

    static int findSecondBiggest(int[] nums){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int[] input = new int[]{7, 5, 35, 350, 7, 70};
        //printHelloWorld(input);
        System.out.println(findSecondBiggest(input));
    }
}
