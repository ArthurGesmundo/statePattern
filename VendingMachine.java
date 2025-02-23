class VendingMachine {
    private int inventory;
    private int balance = 0;
    private final int itemPrice;
    
    private final VendingMachineState idleState = new IdleState();
    private final VendingMachineState itemSelectedState = new ItemSelectedState();
    private final VendingMachineState dispensingState = new DispensingState();
    private final VendingMachineState outOfOrderState = new OutOfOrderState();
    
    private VendingMachineState currentState;
    
    public VendingMachine(int inventory, int itemPrice) {
        this.inventory = inventory;
        this.itemPrice = itemPrice;
        this.currentState = idleState;
    }
    
    public void setState(VendingMachineState state) {
        this.currentState = state;
    }
    
    public void selectItem() {
        currentState.selectItem(this);
    }
    
    public void insertCoin(int amount) {
        currentState.insertCoin(this, amount);
    }
    
    public void dispenseItem() {
        currentState.dispenseItem(this);
    }
    
    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }
    
    public int getInventory() {
        return inventory;
    }
    
    public void decreaseInventory() {
        inventory--;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void addBalance(int amount) {
        balance += amount;
    }
    
    public void resetBalance() {
        balance = 0;
    }
    
    public int getItemPrice() {
        return itemPrice;
    }
    
    public VendingMachineState getIdleState() {
        return idleState;
    }
    
    public VendingMachineState getItemSelectedState() {
        return itemSelectedState;
    }
    
    public VendingMachineState getDispensingState() {
        return dispensingState;
    }
    
    public VendingMachineState getOutOfOrderState() {
        return outOfOrderState;
    }
}
