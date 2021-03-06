import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TablesOrderManager extends Dish implements Order {
    private static final int size = 15; //Количество столмков
    public static Map<Integer,Item> orders = new HashMap<>();
    public TablesOrderManager(String name, String description) {
        super(name, description);
    }
    public TablesOrderManager(Double cost, String name, String description) {
        super(cost, name, description);
    }
    public TablesOrderManager() {}
    public boolean add(Item dish){
        if ((orders.size() <= size) && (orders.get(orders.size()) == null)) {
            orders.put(orders.size(), dish);
            return true;
        }
        return false;
    }
    public boolean remove(String dishName){
        for (Entry entry : orders.entrySet())
            if (entry.getValue().toString().equals(dishName)) {
                orders.remove(entry.getKey(), entry.getValue());
                return true;
            } else {
                return false;
            }
        return false;
    }
    public int removeAll(String dishName){
        int count = orders.size();
        orders.values().remove(dishName);
        return count - orders.size();
    }

    public int dishQuantity(){
        int count = 0;
        for(Item i : orders.values()) {
            if(i.getDescription().equals("dish")){
                count++;
            }
        }
        return count;
    }
    public int dishQuantity(String dishName){
        int count = 0;
        for(Item i : orders.values()) {
            if(i.getName().equals(dishName)){
                count++;
            }
        }
        return count;
    }
    public int drinkQuantity(){
        int count = 0;
        for(Item i : orders.values()) {
            if(i.getDescription().equals("drink")){
                count++;
            }
        }
        return count;
    }
    public int drinkQuantity(String drinkName){
        int count = 0;
        for(Item i : orders.values()) {
            if(i.getName().equals(drinkName)){
                count++;
            }
        }
        return count;
    }
    public Dish[] getDishes(){
        Dish[] dishes = new Dish[this.dishQuantity()];
        int j = 0;
        for(Item i : orders.values()) {
            if(i.getDescription().equals("dish")){
                dishes[j] = new Dish(i.getCost(), i.getName(), i.getDescription());
                ++j;
            }
        }
        return dishes;
    }
    public Drink[] getDrinks(){
        Drink[] drinks = new Drink[this.dishQuantity()];
        int j = 0;
        for(Item i : orders.values()) {
            if(i.getDescription().equals("drink")){
                drinks[j] = new Drink(i.getCost(), i.getName(), i.getDescription());
                ++j;
            }
        }
        return drinks;
    }
    public double costTotal(){
        double sum = 0;
        for(Item i : orders.values()) {
            sum += i.getCost();
        }
        return sum;
    }
    public String[] OrdersNames(){
        String[] temp = new String[orders.size()];
        int j = 0;
        for(Item i : orders.values()){
            temp[++j] = i.getName();
        }
        return temp;
    }
    public int getOrders() {
        return orders.size();
    }
    public Integer[] getOrderPosition() {
        return orders.keySet().toArray(new Integer[0]);
    }
}