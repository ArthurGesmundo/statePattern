class DispensingState implements VendingMachineState {
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Cannot select item. Dispensing in progress.");
    }
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Cannot insert coin. Dispensing in progress.");
    }
    public void dispenseItem(VendingMachine vendingMachine) {
        if (vendingMachine.getInventory() > 0) {
            vendingMachine.decreaseInventory();
            vendingMachine.resetBalance();
            System.out.println("Item dispensed. Returning to idle state.");
            vendingMachine.setState(vendingMachine.getIdleState());
        } else {
            System.out.println("Out of stock! Moving to OutOfOrder state.");
            vendingMachine.setState(vendingMachine.getOutOfOrderState());
        }
    }
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Machine cannot go out of order while dispensing.");
    }
}
