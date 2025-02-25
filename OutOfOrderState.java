public class OutOfOrderState implements VendingMachineState{

    @Override
    public void selectItem(VendingMachine machine, int items){
        System.out.println("Machine is out of order. Can't select items.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int coin){
        System.out.println("Machine is out of order. Can't accept coins.");
    }

    @Override
    public void dispenseItem(VendingMachine machine, int items){
        System.out.println("Machine is out of order. Can't dispense items.");
    }

    @Override
    public void setOutofOrder(VendingMachine machine){
        System.out.println("Vending machine is out of order.");
    }
}