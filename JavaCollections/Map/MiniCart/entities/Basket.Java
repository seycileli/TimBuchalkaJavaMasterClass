package entities;

import java.util.Collections;

import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>(); //have to initialize the Map
        //TreeMap will sort vs when using HashMap
        /*
        * TreeMap will use compareTo method every time it runs,
        * and you will get performance issue when using TreeMap
        * vs using an unsorted Map, such as Hash or LinkedHashMap*/
    }

    /*
    * Accepting stock item that is passed from parem
    * item and quantity;
    * is how many customer is ordering, which item along with quantity of that item
    * if the item is not null, and quantity is more than 0,
    * that means there is something in the basket, and that the customer is purchasing something
    *
    * if there is a value, then put the item, along with whats in the basket, and quantity of the other item
    * */
    public int addToBasket(StockItem item, int quantity) {
        //amount of quantities that the customer is adding to shopping cart
        if ((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
        }
        return 0; //means that the customer is not buying anything, return 0
    }

    public int removeFromBasket(StockItem item, int quantity) {
        /*
        * First, we're checking if the item exist, along with it's quantity
        * if one of the two conditions, comes back false, we will skip the loop process
        * and return 0,
        *
        * but if both conditions are true,
        * we will add then add to our shopping cart
        * which is from Map<StockItem> list field
        * we are adding the item, along with it's quantity
        * and then creating a new field, called newQuantity, which is
        * what is originally in our basket, such as the item
        * along with it's quantity
        *
        * then, if new quantity, is greater than zero
        * we add that item to our Map<StockItem> list,
        * and we will return back the quantity
        *
        * else, if there is nothing in our basket, we will whatever item is our basket
        * to be more precise, if there isn't enough quantity of that item, that we have in our basket
        * we will remove it from shopping cart*/
        if((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            int newQuantity = inBasket - quantity;

            if (newQuantity > 0) {
                list.put(item, newQuantity);
                return quantity;
            } else if (inBasket == 0) {
                list.remove(item);
                return quantity;
            }
        }
        return 0;
    }

    public void clearBasket() {
        /*
        * clearing all items from basket */
        this.list.clear();
    }

    //another method for items
    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    //toString method to override

    @Override
    public String toString() {
        String s ="\nShopping basket: " + name + " contains " + list.size() +
               (( list.size() == 1) ? " item: " : " items: ") + "\n";
        /*
        * If list size is equaled to 1, we will print out "item"
        * otherwise, if greater than 1, plural, we will print out "items"*/
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchase\n";
            totalCost += item.getKey().getPrice() + item.getValue();
        }
        return s + "Total cost: " + totalCost;
    }
}
