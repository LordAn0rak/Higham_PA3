public class SavingsAccount {

    private static float annualInterestRate;
    private float savingsBalance;

    public SavingsAccount(int userSavings){

        savingsBalance = userSavings;
    }

    public float calculateMonthlyInterest(){

        savingsBalance += ((savingsBalance * annualInterestRate)/12);
        return savingsBalance;
    }

    public static void modifyInterestRate(float newRate){

        newRate = newRate/10;
        annualInterestRate = newRate;
    }
}

