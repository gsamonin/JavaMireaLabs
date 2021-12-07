public class Main {
    public static void main(String[] args) {
        RestaurantOrder restaurantOrder = new RestaurantOrder() {
            public boolean add(Item dish) {
                return super.add(dish);
            }
        };
        restaurantOrder.add(new Drink(300.0,"Пепси", "Напиток"));
        restaurantOrder.add(new Drink(250.0,"Сок яблочный", "Напиток"));
        restaurantOrder.add(new Dish(700.0,"Суп", "Блюдо"));
        restaurantOrder.add(new Dish(500.0,"Чизбургер", "Блюдо"));
        TablesOrderManager tablesOrderManager = new TablesOrderManager(restaurantOrder);
        tablesOrderManager.printTable();
        System.out.println("Чек: " + restaurantOrder.costTotal() + "руб\n");
    }
}
