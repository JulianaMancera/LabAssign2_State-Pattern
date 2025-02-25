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

    public void selectItem(int itemIndex) {
        currentState.selectItem(this, itemIndex);
    }

    public void insertCoin(int coin) {
        currentState.insertCoin(this, coin);
    }

    public void dispenseItem(int itemIndex) {
        currentState.dispenseItem(this, itemIndex);
    }

    public void setOutOfOrder() {
        currentState.setOutofOrder(this);
    }
}