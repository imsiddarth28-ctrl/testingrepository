public class NullPointerDemo {

    public static void printLength(String text) {
        System.out.println(text.length()); // Possible NullPointerException
    }

    public static void main(String[] args) {
        String name = null;
        printLength(name);
    }
}