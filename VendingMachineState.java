interface VendingMachineState {
    void selectItem(VendingMachine vendingMachine);
    void insertCoin(VendingMachine vendingMachine, int amount);
    void dispenseItem(VendingMachine vendingMachine);
    void setOutOfOrder(VendingMachine vendingMachine);
}