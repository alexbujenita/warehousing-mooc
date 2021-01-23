
public class Main {

    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
        juice.takeFromWarehouse(112.1);
        juice.takeFromWarehouse(42.98);
        juice.addToWarehouse(65.0);

        juice.printAnalysis();
    }

}
