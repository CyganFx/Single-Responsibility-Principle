import java.util.Map;

public class Calculator {
    private static double totalSum;

    public static double calculateSumOfOrder(Map<Goods, Integer> items) {
        for (Goods item : items.keySet()) {
            totalSum += item.getPrice() * items.get(item);
        }
        return totalSum;
    }

    public static double calculateSumForOneItem(Goods item, Map<Goods, Integer> items) {
        return item.getPrice() * items.get(item);
    }
}
