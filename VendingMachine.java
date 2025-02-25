public class VendingMachine {
    private VendingMachineState currentState;
    private int itemInventory;
    private int balance;

    public VendingMachine(int itemInventory) {
        this.itemInventory = itemInventory;
        this.balance = 0;
        this.currentState = new IdleState();
    }

    public void setState(VendingMachineState newState) {
        this.currentState = newState;
    }

    public void selectItem(int items) {
        currentState.selectItem(this, items);
    }

    public void insertCoin(int coin) {
        currentState.insertCoin(this, coin);
    }

    public void dispenseItem(int items) {
        currentState.dispenseItem(this, items);
    }

    public void setOutOfOrder() {
        currentState.setOutofOrder(this);
    }
}