package org.example;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
        private static boolean oneMore = false;

        public static void start(){
             do{
                     main();
             }while (oneMore);
        }

        private static void main(){
                System.out.println("Starting Game {Guess Number(100)}...............");
                oneMore = false;

                Scanner sc = new Scanner(System.in);

                Random random = new Random();

                int answer = random.nextInt(100);

                int num =0;
                int count = 0;

                System.out.println("[Debug] Answer: "+ answer); // debug mode
                do{
                        System.out.print("Guess Your number here: ");
                        String input = sc.next();
                        System.out.println("Your Input [" + input + "]");

                        try{
                                num = Integer.parseInt(input);
                        } catch (NumberFormatException e){
                                System.out.println("Invalidate Input, please input your words as Number!!" );
                        }

                        if(num != answer){
                                System.out.print("Wrong guess!!! ");

                                if(num > answer){
                                        System.out.print("Answer was smaller than your input - ");
                                } else {
                                        System.out.print("Answer was bigger than your input - ");
                                }

                                System.out.println("Please Try again!");
                        }
                        count++;

                }while (num != answer);

                System.out.println("The Answer is "+ answer);
                System.out.println("Well Done!!! You only guess " + count + " time(s) to clear this round!");

                System.out.println("Would you like to play one more game ? Yes = 1, No = etc.");
                int temp = sc.nextInt();
                if(temp ==1){
                        oneMore = true;
                }
        }
}
