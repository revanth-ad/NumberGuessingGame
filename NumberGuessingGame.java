import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the range of number : ");
        int inp = sc.nextInt();
        System.out.print("Enter your Number : ");
        int randomNumber = (int) (Math.random() * inp) + 1;
        int guess = 0;
        int count = 0;
    
        for(int i=0;i<=inp;i++){
                while (guess != randomNumber) {
                    guess = sc.nextInt();
                    count++;
        
                    if (guess < randomNumber) {
                        System.out.println("Try Higher");
                    } else if (guess > randomNumber) {
                        System.out.println("Try Lower");
                    } else {
                        System.out.println("You win!");
                        System.out.println("Number of guesses: " + count);
                    }
                }
        
                sc.close();
            }

              
        
    }
}
 
