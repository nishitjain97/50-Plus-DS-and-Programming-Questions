import java.util.Arrays;
import java.util.BitSet;

class MissingNumber {
    public static void main(String[] args) {
        printMissingNumber(new int[] {1, 2, 3, 4, 6}, 6);

        int[] iArray = new int[]{1, 2, 3, 5};
    }

    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for(int number: numbers) {
            bitSet.set(number - 1);
        }

        System.out.printf("Missing number in integer array %s, with total number %d is %n", Arrays.toString(numbers), count);

        int lastMissingIndex = 0;

        for(int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }
}
