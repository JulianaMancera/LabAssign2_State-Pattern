public class VM {
        public static void main(String[] args) {
            VendingMachine vendingMachine = new VendingMachine(10);

            vendingMachine.selectItem(1);  // Moves to ItemSelectedState
            vendingMachine.insertCoin(20);  // Moves to DispensingState
            vendingMachine.dispenseItem(1); // Moves back to IdleState
    
            vendingMachine.setOutOfOrder(); // Moves to OutOfOrderState
            vendingMachine.insertCoin(10);  // Should not work
        }
    }