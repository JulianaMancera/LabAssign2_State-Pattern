public class ItemSelectedState implements VendingMachineState{

    @Override
    public void selectItem(VendingMachine machine, int items){
        System.out.println("Item already selected. Please insert coins.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int coin){
        System.out.println("Inserted " + coin +  " coins. Dispending item...");
        machine.setState(new DispensingState());
    }

    @Override
    public void dispenseItem(VendingMachine machine, int items){
        System.out.println("Please insert coins first.");
    }

    @Override
    public void setOutofOrder(VendingMachine machine){
        System.out.println("Vending machine is out of order.");
        machine.setState(new OutOfOrderState());
    }
}