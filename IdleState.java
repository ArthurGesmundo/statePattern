class IdleState implements VendingMachineState {
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Item selected.");
        vendingMachine.setState(vendingMachine.getItemSelectedState());
    }
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Cannot insert coin. Please select an item first.");
    }
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Cannot dispense item. No item selected.");
    }
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending machine is now out of order.");
        vendingMachine.setState(vendingMachine.getOutOfOrderState());
    }
}