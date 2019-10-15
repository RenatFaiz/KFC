package kfc;

public class Main {
    public static void main(String[] args) {

        Burger cheeseBurger = new Burger();
        cheeseBurger.id = 2336;
        cheeseBurger.name = "Cheeseburger";
        cheeseBurger.price = 69;
        cheeseBurger.weight = 167;
        cheeseBurger.calories = 237;
        cheeseBurger.link = "https://www.kfc.ru/en/product/2336";
        cheeseBurger.ingredients = "herby mustard sauce, ketchup, " +
                "onion,\ncheddar cheese, pickles on a corn bun.";

        Burger chefBurger = new Burger();
        chefBurger.id = 2384;
        chefBurger.name = "Chefburger";
        chefBurger.price = 129;
        chefBurger.weight = 213;
        chefBurger.calories = 236;
        chefBurger.link = "https://www.kfc.ru/en/product/2384";
        chefBurger.ingredients = "juicy fillet in original breading, lettuce and Tomatoeses\n" +
                "on a wheat bun with black and white sesame seeds.";

        cheeseBurger.print();
        chefBurger.print();
    }

}
