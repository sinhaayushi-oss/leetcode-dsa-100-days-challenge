public class EvenNumberOfDigitsSolution {

    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;
            int temp = num;

            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        EvenNumberOfDigitsSolution solution = new EvenNumberOfDigitsSolution();

        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(solution.findNumbers(nums)); // Output: 2
    }
}