package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class MenuItem {
    // maintain list of menu items
    public static ArrayList<MenuItem> dishes = new ArrayList<>();

    public static ArrayList<String> categories = new ArrayList<>();

    private String name;
    private String description;
    private Double price;
    private String category;
    private Date dateCreated = new Date();

    public MenuItem(String name, String description, Double price, String category){
        this.name = name;
        this.description = description;
        this.price = price;
        if (categories.contains(category)){
            this.category = category;
        } else {
            this.category = "misc";
        }
    }

    public static MenuItem getMenuItem (String name) {
        for (MenuItem dish : dishes) {
            if (name.equals(dish.getName())) {
                return dish;
            }
        }
        return null;
    }

    public static MenuItem chooseMenuItem(ArrayList<MenuItem> menuItems) {
        Scanner chooser = new Scanner(System.in).useDelimiter("\n");
        for (MenuItem dish : menuItems) {
            System.out.println(dish);
        }
        return getMenuItem(chooser.next());
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateCreated;
    }

    private void setDateAdded() {
        dateCreated = new Date();
    }


    public String toString() {
        return name + ": \t\t$" + price + "\n\t" + description;
    }

    public void printMenuItem(MenuItem item) {
        System.out.println("Menu Item:");
        System.out.println("\t" + item.toString());
    }

    public static void printDishes(){
        System.out.println("All dishes:");
        for (MenuItem dish : dishes) {
            System.out.println("\t"+dish);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MenuItem)) return false;
        MenuItem item = (MenuItem) obj;
        return getName().equals(item.getName()) &&
                getDescription().equals(item.getDescription()) &&
                getPrice() == item.getPrice() &&
                getCategory().equals(item.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription(), getPrice(), getCategory());
    }
}
