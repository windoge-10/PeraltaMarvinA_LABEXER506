import java.awt.*;
import java.applet.*;
class ListChoice extends Frame {
    Choice entree, dessert;
    List beverage;

    public ListChoice() {
        entree = new Choice();
        entree.addItem("Golden Fried Shrimp");
        entree.addItem("Beef with Oyster Sauce");
        entree.addItem("Calamares");
        entree.addItem("Chicken Curry");
        entree.addItem("Lengua");
        dessert = new Choice();
        dessert.addItem("Blueberry Cheesecake");
        dessert.addItem("Apple Pie");
        dessert.addItem("Sansrival");
        dessert.addItem("Leche Flan");
        dessert.addItem("Chocolate Mousse");
        beverage = new List(0, true);
        beverage.addItem("Beers");
        beverage.addItem("Rhum");
        beverage.addItem("Wines");
        beverage.addItem("Coffee/Tea");
        beverage.addItem("Juices");
        beverage.addItem("Vodka");
        beverage.addItem("Zombie");
        beverage.addItem("Mineral Water");
        Panel p = new Panel();
        p.setLayout(new GridLayout(2, 1));
        p.add(entree);
        p.add(dessert);
        add("West", p);
        add("Center", beverage);
        pack();
        show();
    }
}
public class LABEXER50602 {
    public static void main(String args[])
    {
        new ListChoice();
    }
}

