public class IdleState implements VendingMachineState{

    @Override
    public void selectItem(VendingMachine machine, int items){
        System.out.println("Item " + items + " selected. Please insert coins.");
        machine.setState(new ItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine machine, int coin){
        System.out.println("Please select an item first.");
    }

    @Override
    public void dispenseItem(VendingMachine machine, int items){
        System.out.println("Can't dispense without item selection and payment.");
    }

    @Override
    public void setOutofOrder(VendingMachine machine){
        System.out.println("Vending machine is out of order.");
        machine.setState(new OutOfOrderState());
    }
}