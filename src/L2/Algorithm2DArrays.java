package L2;

public class Algorithm2DArrays {
    public static void main(String[] args)
    {
        String[][] xoGrid = Algorithm2DArrays.gridOfXandO(7);

        for (String[] row : xoGrid)
        {
            for (String val : row)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }



    public static boolean isFound(int[][] arr, int target) {
        for (int[] r : arr) {
            for (int i : r) {
                if (i == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static int countElementsWithSubstring(String[][] arr, String searchStr) {
        int count = 0;

        for (String[] r : arr) {
            for (String s : r) {
                if (s.indexOf(searchStr) != -1) {
                    count ++;
                }
            }
        }

        return count;
    }

    public static int sumForRow(int[][] arr, int row) {
        int[] r = arr[row];

        int sum = 0;

        for (int i : r) {
            sum += i;
        }

        return sum;
    }

    public static String[][] gridOfXandO(int n) {
        String[][] grid = new String[n][n];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (r % 2 == 0) {
                    grid[r][c] = c % 2 == 0 ? "X" : "O";
                }

                else {
                    grid[r][c] = c % 2 == 0 ? "O" : "X";
                }
            }
        }

        return grid;
    }
}
