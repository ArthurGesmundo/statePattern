class ItemSelectedState implements VendingMachineState {
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Item already selected. Please insert a coin.");
    }
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        vendingMachine.addBalance(amount);
        if (vendingMachine.getBalance() >= vendingMachine.getItemPrice()) {
            System.out.println("Coin inserted. Dispensing item...");
            vendingMachine.setState(vendingMachine.getDispensingState());
            vendingMachine.dispenseItem();
        } else {
            System.out.println("Insufficient balance. Please insert more coins.");
        }
    }
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Please insert coin before dispensing item.");
    }
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending machine is now out of order.");
        vendingMachine.setState(vendingMachine.getOutOfOrderState());
    }
}