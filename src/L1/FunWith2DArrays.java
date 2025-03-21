package L1;

public class FunWith2DArrays
{
    public static void main(String[] args)
    {
        // TEST CODE FOR METHOD 1: totalElements
        int[][] testArr1 = {{5, 2}, {1, 3}, {7, 9}};
        System.out.println(totalElements(testArr1));
        int[][] testArr2 = {{1, 2, 3}, {6, 5, 4}};
        System.out.println(totalElements(testArr2));
        int[][] testArr3 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(totalElements(testArr3));
        int[][] testArr4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(totalElements(testArr4));
        int[][] testArr5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
        System.out.println(totalElements(testArr5));
        int[][] testArr6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
        System.out.println(totalElements(testArr6));
        int[][] testArr7 = {{4}, {7}, {8}, {2}};
        System.out.println(totalElements(testArr7));
        int[][] testArr8 = {{4}};
        System.out.println(totalElements(testArr8));

        System.out.println();

        // TEST CODE FOR METHOD 2: fourCorners
        String[][] words = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        fourCorners(words);
        System.out.println("--------------");

        String[][] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        fourCorners(words2);
        System.out.println("--------------");

        String[][] words3 = {{"time"}};
        fourCorners(words3);
    }

    // Write the totalElementsmethod below to RETURN the total
    // number of elements contained in the 2D numArray,
    // i.e. the row count multiplied by the column count.
    public static int totalElements(int[][] numArray)
    {
        int rows = numArray.length;
        int columns = numArray[0].length;

        return rows*columns;
    }

    // Write the fourCorners below to print out the elements
    // in each of the four corners of strArray, one per line:
    // top left, then top right, then bottom left, then bottom right
    public static void fourCorners(String[][] strArray)
    {
        int rows = strArray.length;
        int columns = strArray[0].length;

        String topLeft = strArray[0][0];
        String topRight = strArray[0][columns - 1];
        String bottomLeft = strArray[rows - 1][0];
        String bottomRight = strArray[rows - 1][columns - 1];

        System.out.println(topLeft);
        System.out.println(topRight);
        System.out.println(bottomLeft);
        System.out.println(bottomRight);
    }
}
