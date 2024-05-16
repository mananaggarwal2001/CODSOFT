import java.util.Scanner;

public class UserBankAccount {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ATMMachine atmMachine = new ATMMachine(1000);

    public static void main(String[] args) {
        performWork();
    }

    public static void menu() {
        System.out.println("1. Check your Account balance");
        System.out.println("2. Withdraw money from your account");
        System.out.println("3. Add money to your account");
        System.out.println("4. Exit");
    }

    public static void performWork() {
        int operation;
        do {
            menu();
            System.out.println();
            System.out.print("Enter the operation you want to perform:- ");
            operation = scanner.nextInt();
            switch (operation) {
                case 1: {
                    atmMachine.checkBalance();
                    break;
                }
                case 2: {
                    System.out.print("Enter the Amount you want to withdraw:- ");
                    long amount = scanner.nextLong();
                    atmMachine.withdrawAmount(amount);
                    break;
                }
                case 3: {
                    System.out.print("Enter the Amount you want to Add to the account:- ");
                    long amount = scanner.nextLong();
                    atmMachine.depositAmount(amount);
                    break;
                }
            }
        } while (operation != 4);
    }
}