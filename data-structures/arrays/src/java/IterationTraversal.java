public class IterationTraversal {

    // #1 find max, min, average.
    public static int findMax(int [] values) {
        // traversal each one.

        // error checking input / input validation
        if (values == null || values.length <= 0) {
            throw new java.lang.IllegalArgumentException("");
        }

        int max = values[0];

        // language specific iteration
        for (int number : values) {
            // do work with number.
            if (number > max) {
                max = number;
            }
        }

        for (int index = 0; index < values.length; index++) {
            if (values[index] > max) {
                max = values[index];
            }
        }

        return max;
    }

    public static int findMin(int [] values) {
        // error checking / input validation

        int min = values[0];

        for (int number : values) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }

    public static int computeSum(int [] values) {
        // error checking / input validation

        int sum = 0;

        for (int number : values) {
            // overflow / underflow being ignored.
            sum += number;
        }

        return sum;
    }

    // exercise 2
    public static void printElementsInArray(int [] values) {
        // error checking

        // selection of the iteration / traversal
        for (int number : values) {
            System.out.println(number + " ");
        }
    }

    public static void main(String [] args) {
        int [] data = new int [] {1,2,3,4,5,6};

        assert (findMax(data) == 6);
        assert (findMin(data) == 1);
        assert (computeSum(data)== 21);
        printElementsInArray(data);
    }
}