public class Main {

    public static void main(String[] args) {
        StandardMessages.welcomeMessage();
        Order order = new Order();
        order.addItem(new Banana(), 3);
        order.addItem(new Apple(), 2);
        order.displayOrderAsCheck();
        StandardMessages.finishMessage();
    }
}

