public class Application{

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        saver1.modifyInterestRate(4);

        for(int i = 0; i < 11; i++){

            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.println("Balance after 12 months at 4% interest:");
        System.out.print("Saver 1 New Balance: ");
        System.out.printf("%.2f", saver1.calculateMonthlyInterest());
        System.out.println();

        System.out.print("Saver 2 New Balance: ");
        System.out.printf("%.2f", saver2.calculateMonthlyInterest());
        System.out.println();
        System.out.println();

        saver1.modifyInterestRate(5);

        System.out.println("Balance after 1 more month at 5% interest:");
        System.out.print("Saver 1 New Balance: ");
        System.out.printf("%.2f", saver1.calculateMonthlyInterest());
        System.out.println();

        System.out.print("Saver 2 New Balance: ");
        System.out.printf("%.2f", saver2.calculateMonthlyInterest());
        System.out.println();
    }
}
