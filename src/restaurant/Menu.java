package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    public static ArrayList<Menu> menus = new ArrayList<>();

    private String name;
    private Date dateRevised;
    private ArrayList<MenuItem> items= new ArrayList<>();

    public Menu(String name) {
        this.name = name;
        this.dateRevised = new Date();
    }

    public static Menu getMenu(String name) {
        for (Menu menu : menus) {
            if (name.equals(menu.getName())){
                return menu;
            }
        }
        return null;
    }

    public static Menu chooseMenu() {
        Scanner chooser = new Scanner(System.in).useDelimiter("\n");
        for (Menu menu : menus) {
            System.out.println(menu);
        }
        return getMenu(chooser.next());
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private Date getDateRevised() {
        return dateRevised;
    }

    private void setDateRevised() {
        dateRevised = new Date();
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public static void addOneItem(Menu menu,MenuItem item) {
        menu.getItems().add(item);
    }

    public static void removeOneItem(Menu menu, MenuItem item) {
        menu.getItems().remove(item);
    }

    public String toString() {
        return name;
    }

    public static void printMenus() {
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }

    public static void printMenu(Menu menu) {
        System.out.println(menu.name + " (" + menu.dateRevised +")");
        System.out.println();
        System.out.println("Appetizers:");
        for (MenuItem item: menu.items) {
            if (item.getCategory().equals("appetizer")) {
                System.out.println("\t"+item);
            }
        }
        System.out.println();
        System.out.println("Entrees:");
        for (MenuItem item: menu.items) {
            if (item.getCategory().equals("entree")) {
                System.out.println("\t"+item);
            }
        }
        System.out.println();
        System.out.println("Desserts:");
        for (MenuItem item: menu.items) {
            if (item.getCategory().equals("dessert")) {
                System.out.println("\t"+item);
            }
        }
        System.out.println();
        System.out.println("Miscellaneous:");
        for (MenuItem item: menu.items) {
            if (item.getCategory().equals("misc")) {
                System.out.println(item);
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Menu)) return false;
        Menu menu = (Menu) obj;
        return getName().equals(menu.getName()) &&
                getItems().equals(menu.getItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getItems());
    }


}
