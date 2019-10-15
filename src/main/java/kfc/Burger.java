package kfc;

public class Burger {
    int id;
    String name;
    int price;
    int weight;
    int calories;
    String link;
    String ingredients;

    void print() {
        System.out.println(name + ", " + price + " RUB");
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Weight and calories: " + weight +
                "g, " + calories + "ccal");
        System.out.println("Click here to order: " + link + "\n");
    }
}
