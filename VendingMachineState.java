public interface VendingMachineState{

    public void selectItem(VendingMachine machine, int items);
    public void insertCoin(VendingMachine machine, int coin);
    public void dispenseItem(VendingMachine machine, int items);
    public void setOutofOrder(VendingMachine machine);

}