import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<Goods, Integer> items;

    public Order() {
        items = new HashMap<>();
    }

    public void addItem(Goods item, int amount) {
        if (!items.containsKey(item)) {
            items.put(item, amount);
        } else {
            items.put(item, items.get(item) + amount);
        }
    }

    public void displayOrderAsCheck() {
        for (Goods item : items.keySet()) {
            CalculatorDisplay.printOneItemCalculation(item, items);
        }
        CalculatorDisplay.printTotalSum(items);
    }
}
