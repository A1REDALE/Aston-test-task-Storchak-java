import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
    int[] nums = new int[10];
    for (int i = 0; i < nums.length; i++) {
        nums[i] = new Random().nextInt(100);
    }
        for (int num : nums) {
            System.out.print("[" + num +"]");
        }
        for (int num : nums) {
            if (num % 3 == 0 && num > 0) {
                System.out.print("\n" + num);
            }
        }
    }
}
