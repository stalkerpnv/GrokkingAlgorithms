import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        boolean win = false;
        int attempt = 1;
        while(win==false){
            System.out.println("Attempt " + attempt);
            System.out.println("Input number:");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if(number==randomNumber){
                System.out.println("You win");
                win = true;
            }
            else if(randomNumber>number){
                System.out.println("number > " + number);
                attempt++;
            }
            else{
                System.out.println("number < " + number);
                attempt++;
            }
        }
    }
}