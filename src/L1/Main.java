package L1;

public class Main {
    public static void main(String[] args) {
        String[][] seatingChart = new String[][]{
                {"Abby", "Don", "George", "Kim"},
                {"Brian", "Elenor", "Harry", "Lenny"},
                {"Cathy", "Fred", "Jill", "Matt"}
        };

        var temp = seatingChart[2][3];

        seatingChart[2][3] = seatingChart[0][0];
        seatingChart[0][0] = temp;
    }
}
