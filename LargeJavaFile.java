public class LargeJavaFile {

    static int count = 0;

    public static void main(String[] args) {

        System.out.println("Starting Program");

        calculateSum();
        findMax();
        stringOperations();
        arrayOperations();
        divideNumbers();
        nestedLoops();

        System.out.println("Program Finished");
    }

    public static void calculateSum() {
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }

    public static void findMax() {

        int[] arr = {5, 8, 2, 9, 1, 10, 3};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max = " + max);
    }

    public static void stringOperations() {

        String result = "";

        for (int i = 0; i < 100; i++) {
            result = result + i;
        }

        System.out.println(result);
    }

    public static void arrayOperations() {

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }

    public static void divideNumbers() {

        int a = 100;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void nestedLoops() {

        for (int i = 0; i < 20; i++) {

            for (int j = 0; j < 20; j++) {

                for (int k = 0; k < 20; k++) {
                    count++;
                }
            }
        }

        System.out.println("Count = " + count);
    }

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static boolean search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }

    public static void printNumbers() {

        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }

    public static void nullPointerExample() {

        String str = null;

        System.out.println(str.length());
    }

    public static void memoryWaste() {

        int[][] matrix = new int[1000][1000];

        System.out.println(matrix.length);
    }
}