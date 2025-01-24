import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] testInput = generateRandomArray(10, 1, 100); // Generate a random array of size 10 with values between 1 and 100

        System.out.println("Generated Random Array: " + Arrays.toString(testInput));

        TestSuite.run(testInput, 10000);
    }

    public static int[] generateRandomArray(int size, int minValue, int maxValue) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }

        return array;
    }
}