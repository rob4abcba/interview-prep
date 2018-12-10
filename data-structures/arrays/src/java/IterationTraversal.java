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
            System.out.print(number + " ");
        }
        System.out.println("");
    }

    public static void flipSquareMatrix(int [][] matrix) {
        // error checking 
        // make sure it is a square
        // if (matrix.length == matrix[0].length) 

        /*
            1 2 3
            4 5 6
            7 8 9

            1 - is at 0,0
            5 - is at 1,1
            9 - is at 9,9

            4 <-> 2
            3 <-> 7
            6 <-> 8
        */

        for (int row = 0; row < matrix.length; row++) {
            for (int col = row; col < matrix.length; col++) {
                if (row == col) {
                    // no work
                }
                else {
                    // work

                    // swap work
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[col][row];
                    matrix[col][row] = temp;
                }
            }
        }

        for (int [] row : matrix) {
            printElementsInArray(row);
            System.out.println("");
        }
    }

    // Exercise 2 - Array Data Manipulation
    public static void sort(int [] data) {
        // error checking

        // 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
        // 0, 8, 7, 6, 5, 4, 3, 2, 1, 9

        // selection sort

        // this is performed N times where N is the lenght of data array
        for (int pivot = 0; pivot < data.length; pivot++) {
            int min = data[pivot];
            int minIndex = pivot;

            // perform N - 1 times where N is the lenght of the data array.
            // staring index - total number of accesses
            // 0 - 9
            // 1 - 8
            // 2 - 7
            // 3 - 6
            // ..
            // 9 - 0
            // 1 + 2 + 3 + 4 + ... + N - 1 + N - 2
            // N(N - 1)/2
            // N^2/2 - N/2
            // O(N) = O(N^2) for run-time
            // O(N) = O(C) for memory impact
            for (int index = pivot + 1; index < data.length; index++) {
                if (data[index] < min) {
                    min = data[index];
                    minIndex = index;
                }
            }

            // swap operation
            int temp = data[pivot];
            data[pivot] = data[minIndex];
            data[minIndex] = temp;
        }
    }

    public static void main(String [] args) {
        int [] data = new int [] {1,2,3,4,5,6};
        int [][] matrix = new int [][] {{1,2,3}, {4,5,6}, {7,8,9}};
        int [] notSorted = new int [] {6,5,4,3,2,1};

        flipSquareMatrix(matrix);
        assert (findMax(data) == 6);
        assert (findMin(data) == 1);
        assert (computeSum(data)== 21);
        printElementsInArray(data);
        sort(notSorted);
        printElementsInArray(notSorted);
        
    }
}