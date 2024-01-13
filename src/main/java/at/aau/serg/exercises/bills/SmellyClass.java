package at.aau.serg.exercises.bills;

public class SmellyClass {

    public void printInvoice(Order order) {
        addShippingCosts(order);
        double totalPrice = calculateTotalPrice(order);
        printInvoiceDetails(order, totalPrice);
    }

    private void addShippingCosts(Order order) {
        double totalPrice = calculateTotalPrice(order);

        if (totalPrice <= 100) {
            Item shippingCost = new Item();
            shippingCost.setId(99L);
            shippingCost.setName("Shipping costs");
            shippingCost.setPrice(calculateShippingCost(totalPrice));
            order.getItems().add(shippingCost);
        }
    }

    private double calculateShippingCost(double totalPrice) {
        if (totalPrice > 90) {
            return totalPrice * 0.05;
        } else if (totalPrice > 50) {
            return 7.5d;
        } else {
            return 10d;
        }
    }

    private double calculateTotalPrice(Order order) {
        double totalPrice = 0.0d;
        for (Item item : order.getItems()) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    private void printInvoiceDetails(Order order, double totalPrice) {
        System.out.println("Rechnung:");
        for (Item item : order.getItems()) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }
        System.out.println("Total: " + totalPrice);
    }
}

