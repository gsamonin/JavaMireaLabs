public class Main {
    public static void main(String[] args) {
        TablesOrderManager tablesOrderManager = new TablesOrderManager() {
            public boolean add(Item dish) {
                return super.add(dish);
            }
        };
        InternetOrder internetOrder = new InternetOrder();
        internetOrder.add(new Dish(2.5,"Pepsi", "dish"));
        System.out.println("Internet total cost: " + internetOrder.costTotal() + "$");
    }
}
