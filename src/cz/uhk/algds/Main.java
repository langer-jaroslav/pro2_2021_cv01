package cz.uhk.algds;

import cz.uhk.algds.Models.PizzaMenu;
import cz.uhk.algds.Models.PizzaMenuItem;

public class Main {

    public static void main(String[] args) {

        PizzaMenu menu = new PizzaMenu();
        
        menu.addItem(new PizzaMenuItem("Šunková", "Super dobrá pizza", 150));
        menu.addItem(new PizzaMenuItem("Sýrová", "Ne-tak dobrá pizza", 158));

        for (PizzaMenuItem item: menu.getItems()) {
            System.out.println(item);
        }
        
    }
}
