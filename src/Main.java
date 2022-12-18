import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Toppings t1 = Toppings.CHEESE;
        System.out.println(Arrays.toString(Toppings.values()));

        String toppingOne = "Cheese";
        String toppingTwo = "Extra Meat";
        StringBuilder toppings = new StringBuilder();
        double price = 0.0;

        for (Toppings topping : Toppings.values()) {
            if (topping.name.equals(toppingOne) || topping.name.equals(toppingTwo)) {
                System.out.println(topping.name + " costs $" + topping.price);
                toppings.append(topping.name).append(", ");
                price += topping.price;
            }
//            } else {
//                System.out.println(topping.name + " is not a valid selection.");
//            }
        }

        System.out.println("These are the toppings on the burger: " +
                toppings.replace(toppings.length() - 2, toppings.length() - 1, ""));
        System.out.println("This is the price of the burger toppings: $" + price);

        Toppings.printToppingSelector();
    }
}