
import java.util.Scanner;

class ArrayStatistics {
    private float maxValue;
    private float minValue;

    public float getMax() {
        return maxValue;
    }

    public float getMin() {
        return minValue;
    }

    public void findMaxMin(float[] nums) {
        maxValue = nums[0];
        minValue = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxValue = nums[i] > maxValue ? nums[i] : maxValue;
            minValue = nums[i] < minValue ? nums[i] : minValue;
        }
    }
    
}

class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        float[] arr = new float[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i+1) + " num: ");
            arr[i] = input.nextFloat();
        }

        ArrayStatistics obj = new ArrayStatistics();
        obj.findMaxMin(arr);
        System.out.println("Max: " + obj.getMax());
        System.out.println("Min: " + obj.getMin());
    }
}
