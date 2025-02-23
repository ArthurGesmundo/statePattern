class OutOfOrderState implements VendingMachineState {
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Machine is out of order.");
    }
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Machine is out of order.");
    }
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Machine is out of order.");
    }
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Machine is already out of order.");
    }
}