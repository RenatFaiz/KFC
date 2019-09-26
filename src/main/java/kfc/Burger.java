package kfc;

public class Burger {
    String name;
    int price;
    String ingredients;

    void print() {
        System.out.println(name + ", " + price + " RUB");
        System.out.println("Ingredients: " + ingredients);
    }
}
