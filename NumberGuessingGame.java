import java.util.Scanner;

public class NumberGuessingGame {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("*****Welcome to Number Guessing Game*****");
        int random_number = (int) (Math.random() * 100 + 1);
        int attempts = 1;
        while(true){
            System.out.println("Choose  1) for limited attempts \n\t\t2) Unlimited attempts");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> { //for limited attempts
                    System.out.println("You have only 9 attempts to guess \nlets begin");
                    while (attempts <= 9) {
                        if(10 - attempts > 1)
                            System.out.println(10 - attempts + " attempts remaining");
                        else System.out.println("1 attempt remaining");
                        System.out.println("Enter a Guessed number");
                        int temp = sc.nextInt();
                        if (temp == random_number) {
                            System.out.println("Congratulations! you guessed correct number in limited attempts");
                            return;
                        } else if (temp > random_number && attempts < 9) {
                            System.out.println("Number is lesser than your guess");
                        } else if (temp < random_number && attempts < 9)
                            System.out.println("Number is greater than your guess");
                        attempts++;

                    }
                    System.out.println("You exhausted your attempts");
                    System.out.println("Number was " + random_number);
                    System.out.println("Try again next time");
                    return;
                }
                case 2 -> { // for unlimited attempts
                    System.out.println("You are entered in unlimited attempts mode");
                    while (true) {
                        System.out.println(attempts + " attempt");
                        System.out.println("Enter a Guessed number");
                        int temp1 = sc.nextInt();
                        if (temp1 == random_number) {
                            System.out.println("Congratulations! you guessed correct number in  " + attempts + " attempts");
                            break;
                        } else if (temp1 > random_number) {
                            System.out.println("Number is lesser than your guess");
                        } else System.out.println("Number is greater than your guess");
                        attempts++;
                    }
                    return;
                }
                default -> System.out.println("Enter valid choice");
            }
        }
    }
}
