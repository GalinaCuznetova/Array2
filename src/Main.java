import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
    }
    int[] expenses = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] expenses = new int[30];
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(100_000) + 100_000;
        }
        return expenses;
    }
        System.out.println(Arrays.toString(expenses));


    }


    }





