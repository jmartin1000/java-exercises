package restaurant;

import restaurant.MenuItem;
import restaurant.Menu;

import java.util.HashMap;
import java.util.Scanner;

public class Restaurant {

    private static Scanner in = new Scanner(System.in).useDelimiter("\n");
    private static HashMap<Integer, String> actionChoices = new HashMap<>();
    private static HashMap<Integer, String> menuItemsOptions = new HashMap<>();
    private static HashMap<Integer, String> menuOptions = new HashMap<>();
    private static Integer userChoice;

    public static void main(String[] args) {

        // add menu item categories
        MenuItem.categories.add("appetizer");
        MenuItem.categories.add("entree");
        MenuItem.categories.add("dessert");

        //Top-level menu options
        actionChoices.put(1, "menu items");
        actionChoices.put(2, "menus");
        System.out.println("Welcome to the Restaurant");

        //menuItems options
        menuItemsOptions.put(1, "view list of menu items");
        menuItemsOptions.put(2, "create menu item");
        menuItemsOptions.put(0, "back");

        //menu options
        menuOptions.put(1, "view menus");
        menuOptions.put(2, "print menu");
        menuOptions.put(3, "create new menu");
        menuOptions.put(4, "add dish to menu");
        menuOptions.put(5, "remove dish from menu");
        menuOptions.put(0, "back");

        while (true) {

            optionMessage(actionChoices);

            if (userChoice.equals(1)) {
                optionMessage(menuItemsOptions);
                if (userChoice.equals(1)) {
                    MenuItem.printDishes();

                } else if (userChoice.equals(2)) {
                    System.out.println("Let's get started then. What is the name of this dish?");
                    String dishName = in.next();
                    System.out.println("Briefly describe the dish");
                    String dishDescription  = in.next();
                    System.out.println("How much will you charge for this dish?");
                    Double dishPrice = in.nextDouble();
                    System.out.println("What category: appetizer, entree, dessert?");
                    String dishCategory = in.next();
                    MenuItem aDish = new MenuItem(dishName, dishDescription, dishPrice, dishCategory);
                    MenuItem.dishes.add(aDish);
                } else if (userChoice.equals(0)) {
                    optionMessage(actionChoices);
                } else {
                    System.out.println("Invalid option. Try again");
                    optionMessage(menuItemsOptions);
                }

            } else if (userChoice.equals(2)) {
                optionMessage(menuOptions);
                if (userChoice.equals(1)) {
                    // view list of all menus
                    Menu.printMenus();
                } else if (userChoice.equals(2)) {
                    //print menu
                    System.out.println("Choose a menu");
                    Menu.printMenu(Menu.chooseMenu());
                } else if (userChoice.equals(3)) {
                    //create a new menu
                    System.out.println("What will you name this menu?");
                    String menuName = in.next();
                    Menu aMenu = new Menu(menuName);
                    Menu.menus.add(aMenu);
                } else if (userChoice.equals(4)) {
                    // add dish to existing menu
                    System.out.println("Choose a menu");
                    Menu menu = Menu.chooseMenu();
                    System.out.println("Choose a dish");
                    MenuItem menuItem = MenuItem.chooseMenuItem(MenuItem.dishes);
                    Menu.addOneItem(menu, menuItem);
                }else if (userChoice.equals(5)) {
                    // remove dish to existing menu
                    System.out.println("Which menu do you want to edit?");
                    Menu menu = Menu.chooseMenu();
                    System.out.println("Choose a dish");
                    Menu.printMenu(menu);
                    MenuItem menuItem = MenuItem.chooseMenuItem(menu.getItems());
                    Menu.removeOneItem(menu, menuItem);
                } else if (userChoice.equals(0)) {
                    // back to main menu
                    optionMessage(actionChoices);
                }else {
                    System.out.println("Invalid option. Try again");
                    optionMessage(menuOptions);
                }

            } else {
                System.out.println("that is not a valid option");
                optionMessage(actionChoices);
            }

        }
    }

    private static void optionMessage (HashMap < Integer, String > options){
        System.out.println();
        System.out.println("What would you like to work on?");
        for (Integer key : options.keySet()) {
            System.out.println("\t" + key + ": " + options.get(key));
        }
        userChoice = in.nextInt();

    }

}
