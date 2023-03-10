import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.print((random.nextInt(10) + 1) + " ");
        }
    }
}
