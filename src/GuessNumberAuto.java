import java.util.Random;

public class GuessNumberAuto {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        boolean win = false;
        int attempt = 1;
        int a = 1;
        int b = 100;
        while (win != true) {
            int myNumber = (a + b) / 2;
            System.out.print (myNumber + " ");
            if (myNumber == randomNumber) {
                win = true;
                System.out.println("\nrandomNumber = " + randomNumber);
                System.out.println("Count of attempt = " + attempt);
            } else if (randomNumber > myNumber) {
                a = (a + b) / 2;
                attempt++;
            } else {
                b = (a + b) / 2;
                attempt++;
            }
        }
    }
}
