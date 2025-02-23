public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(5, 2);
        
        vendingMachine.selectItem();
        vendingMachine.insertCoin(1);
        vendingMachine.insertCoin(1);
        vendingMachine.selectItem();
        vendingMachine.setOutOfOrder();
    }
}