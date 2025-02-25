public class DispensingState implements VendingMachineState{

    @Override
    public void selectItem(VendingMachine machine, int items){
        System.out.println("Currently dispensing. Please wait.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int coin){
        System.out.println("Currently dispensing. Please wait.");
        machine.setState(new DispensingState());
    }

    @Override
    public void dispenseItem(VendingMachine machine, int items){
        System.out.println("Item " +items+ " dispensed. Returning to idle state.");
        machine.setState(new IdleState());
    }

    @Override
    public void setOutofOrder(VendingMachine machine){
        System.out.println("Vending machine is out of order.");
        machine.setState(new OutOfOrderState());
    }
}