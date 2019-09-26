package kfc;

public class Main {
    public static void main(String[] args) {

        Burger cheeseBurger = new Burger();
        cheeseBurger.name = "CheeseBurger";
        cheeseBurger.price = 69;
        cheeseBurger.ingredients = "herby mustard sauce, ketchup, " +
                "onion,\ncheddar cheese, pickles on a corn bun.\n";

        Burger chefBurger = new Burger();
        chefBurger.name = "Chefburger";
        chefBurger.price = 129;
        chefBurger.ingredients = "juicy fillet in original breading, lettuce and Tomatoeses\n" +
                "on a wheat bun with black and white sesame seeds.";

        cheeseBurger.print();
        chefBurger.print();
    }

}
