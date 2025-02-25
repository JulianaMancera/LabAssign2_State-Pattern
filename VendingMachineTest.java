public class v {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine(10);

        while (true) {
            System.out.println("\n1. Select Item\n2. Insert Coin\n3. Dispense Item\n4. Set Out of Order\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item number: ");
                    int itemIndex = scanner.nextInt();
                    vendingMachine.selectItem(itemIndex);
                    break;
                case 2:
                    System.out.print("Enter coin amount: ");
                    int coin = scanner.nextInt();
                    vendingMachine.insertCoin(coin);
                    break;
                case 3:
                    vendingMachine.dispenseItem();
                    break;
                case 4:
                    vendingMachine.setOutOfOrder();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}