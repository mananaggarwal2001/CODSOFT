public interface ATMInterface {
    void withdrawAmount(long amount);

    void depositAmount(long amount);

    void checkBalance();
}