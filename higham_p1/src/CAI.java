import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {

    public static void main(String args[]){

        Scanner inObj = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int correct = 0;
        char answer;
        float studentAnswer = 0;
        float correctAnswer = 0;
        boolean finished = false;

        while(!finished){

            System.out.println("Difficulty?");
            int difficulty = inObj.nextInt();

            System.out.println("Problem Type?");
            int probType = inObj.nextInt();

            for(int i = 0; i < 1; i++) {

                correctAnswer = questionGen(difficulty, probType);
                studentAnswer = inObj.nextFloat();

                if(correctAnswer == studentAnswer){

                    switch (rand.nextInt(4) + 1){

                        case 1:
                            System.out.println("Very good!");
                            break;

                        case 2:
                            System.out.println("Excellent!");
                            break;

                        case 3:
                            System.out.println("Nice work!");
                            break;

                        case 4:
                            System.out.println("Keep up the good work!");
                            break;
                    }
                    correct++;
                    System.out.println();
                }
                else{

                    switch (rand.nextInt(4) + 1){

                        case 1:
                            System.out.println("No. Please try again.");
                            break;

                        case 2:
                            System.out.println("Wrong. Try once more.");
                            break;

                        case 3:
                            System.out.println("Don’t give up!");
                            break;

                        case 4:
                            System.out.println("No. Keep trying.");
                            break;
                    }

                    System.out.println();
                }
            }

            //System.out.println();

            if(correct/10 < .75){

                System.out.println("Please ask your teacher for extra help.");
            }
            else if (correct/10 > .75){

                System.out.println("Congratulations, you are ready to go to the next level!");
            }

            System.out.println("You got " + correct + " out of 10 questions correct");

            System.out.println("New session? (y or n)");

            answer = inObj.next().charAt(0);

            if(answer == 'n'){

                finished = true;
            }
        }
    }

    static float questionGen(int difficulty, int probType){

        SecureRandom rand = new SecureRandom();

        int num1 = 0;
        int num2 = 0;

        if(difficulty == 1){

            num1 = rand.nextInt(9) + 1;
            num2 = rand.nextInt(9) + 1;
        }
        else if(difficulty == 2){

            num1 = rand.nextInt(99) + 1;
            num2 = rand.nextInt(99) + 1;
        }
        else if(difficulty == 3){

            num1 = rand.nextInt(999) + 1;
            num2 = rand.nextInt(999) + 1;
        }
        else if(difficulty == 4){

            num1 = rand.nextInt(9999) + 1;
            num2 = rand.nextInt(9999) + 1;
        }

        if(probType == 5){

            probType = rand.nextInt(4) + 1;
        }

        switch(probType){

            case 1:
                System.out.println("How much is " + num1 + " plus " + num2 + "?");

                return (float)(num1 + num2);

            case 2:
                System.out.println("How much is " + num1 + " times " + num2 + "?");

                return (float)(num1 * num2);

            case 3:
                System.out.println("How much is " + num1 + " minus " + num2 + "?");

                return (float)(num1 - num2);

            case 4:
                System.out.println("How much is " + num1 + " divided by " + num2 + "?");

                return (float)(num1 / num2);
        }

        return 0;
    }
}
