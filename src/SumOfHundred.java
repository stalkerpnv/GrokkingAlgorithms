public class SumOfHundred {
    public static int firstMethod() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
    public static int secondMethod() {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += 100;
        }
        return (sum + 50);
    }

    public static void main(String[] args) {
        System.out.println(firstMethod());
        System.out.println(secondMethod());
    }
}
