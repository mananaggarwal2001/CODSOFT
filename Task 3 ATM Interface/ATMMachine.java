public class ATMMachine implements ATMInterface {
    public static long availablemoney;

    public ATMMachine(int availablemoney) {
        ATMMachine.availablemoney = availablemoney;
    }

    @Override
    public void withdrawAmount(long amount) {
        if (availablemoney > amount) {
            System.out.println("Transaction Succeeded of :- ₹" + amount);
            availablemoney -= amount;
        } else {
            System.out.println("Insufficient Funds! Hence couldn't complete the transaction");
        }
    }

    @Override
    public void depositAmount(long amount) {
        System.out.println("Money Deposited In Bank of :- ₹" + amount);
        availablemoney += amount;
    }

    @Override
    public void checkBalance() {
        System.out.println("The Money Available in your account is :- ₹" + availablemoney);
    }
}

