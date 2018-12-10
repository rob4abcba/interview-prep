public class IterationTraversal {

    // #1 find max, min, average.
    public int findMax(int [] values) {
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

        }

    }

    public static void main(String [] args) {

    }
}