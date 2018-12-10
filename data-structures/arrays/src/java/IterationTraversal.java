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


    public static void main(String [] args) {
        int [] data = new int [] {1,2,3,4,5,6};
        int [][] matrix = new int [][] {{1,2,3}, {4,5,6}, {7,8,9}};

        flipSquareMatrix(matrix);
        assert (findMax(data) == 6);
        assert (findMin(data) == 1);
        assert (computeSum(data)== 21);
        printElementsInArray(data);
        
    }
}