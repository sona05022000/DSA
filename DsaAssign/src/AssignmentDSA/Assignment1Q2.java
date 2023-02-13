package AssignmentDSA;
class ArmstrongNumBetweenRange {
    public static int[] armstrongNumbersInRange(int min, int max) {
        int[] result = new int[4];
        int index = 0;
        for (int i = min; i <= max; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if (sum == i) {
                result[index++] = i;
            }
        }
        return result;
    }
}

public class Assignment1Q2 {
    public static void main(String[] args) {
        int min = 100;
        int max = 999;
        int[] armstrongNumbers = ArmstrongNumBetweenRange.armstrongNumbersInRange(min, max);
        System.out.println("Armstrong numbers between " + min + " and " + max + " are: ");
        for (int number : armstrongNumbers) {
            System.out.print(number + " ");
        }
    }
}
