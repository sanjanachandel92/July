public class Main {
    public static void main(String[] args) {
        System.out.println(isEven(7));
        System.out.println(isOdd(6));
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        else {
            return false;
        }

    }
    public static boolean isOdd(int n) {
        if (n % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}