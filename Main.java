import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Thread thread = new Thread();

        System.out.println("-------------------------------Currency Exchange System-------------------------------");
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter contact number: ");
        String contactNo = input.next();
        System.out.print("Enter owned currency: ");
        String ownedCurr = input.next();
        System.out.print("Enter amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter desired currency: ");
        String desiredCurr = input.next();

        Currency currency = new Currency(ownedCurr, amount, desiredCurr);

        try {
            System.out.print("Please Wait");
            for (int i = 0; i < 7; i++){
                System.out.print(".");
                thread.sleep(1000);
            }
            System.out.println();
        } catch (InterruptedException e){
            System.out.println("The system is interrupted!");
            System.exit(0);
        }

        if (currency.getRate() != 0){
            System.out.println("Successfully Computed the Exchange Rate");
            System.out.println("-------------------------------Currency Exchange Summary------------------------------");
            System.out.println("Customer Name:\t"+name);
            System.out.println("Contact Number:\t"+contactNo);
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("CURRENCY EXCHANGE");
            System.out.println("Owned Currency:\t"+ownedCurr);
            System.out.println("Amount:\t"+amount);
            System.out.println("Exchange Rate:\t"+currency.getRate());
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.printf("EXCHANGE VALUE:\t PHP %.2f\n", currency.getAmount());
        } else {
            System.out.println("The operation is FAILED!");
            System.out.println("The currency is not available.\nTry Another Currency Thank You!");
        }
    }
}