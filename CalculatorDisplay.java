import java.util.Map;

import static java.lang.System.out;

public class CalculatorDisplay {

    public static void printTotalSum(Map<Goods, Integer> items) {
        out.println("Total sum: " + Calculator.calculateSumOfOrder(items));
    }

    public static void printOneItemCalculation(Goods item, Map<Goods, Integer> items) {
        out.print(item.getClass().getName());
        out.print(" Price: " + item.getPrice());
        out.print(" Amount: " + items.get(item));
        out.println(" Total: " + Calculator.calculateSumForOneItem(item, items));
    }
}
