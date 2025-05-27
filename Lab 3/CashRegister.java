public class CashRegister {
    private int cashOnHand;

    public CashRegister(int initialCash) {
        this.cashOnHand = initialCash;
    }

    public int getCashOnHand() {
        return cashOnHand;
    }

    public void acceptAmount(int amount) {
        cashOnHand += amount;
    }
}
