public enum Toppings {
    CHEESE("Cheese", 1.00),
    BACON("Bacon", 1.50),
    ONION("Onion", .25),
    JALAPENO("Jalapeno", .50),
    EXTRA_MEAT("Extra Meat", 2.5),
    LETTUCE("Lettuce", .25),
    TOMATO("Tomato", .25),
    MUSTARD("Mustard", .10),
    KETCHUP("Ketchup", .10),
    MAYONNAISE("Mayonnaise", .10);

    final String name;
    final double price;

    Toppings(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void printToppingSelector() {
        for(int i = 0; i < Toppings.values().length; i++) {
            System.out.println(i + 1 + ". " + Toppings.values()[i].name);
        }
    }

}
