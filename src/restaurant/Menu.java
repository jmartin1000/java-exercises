package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String name;
    private Date dateRevised;
    private ArrayList<MenuItem> appetizers= new ArrayList<>();
    private ArrayList<MenuItem> mainCourses = new ArrayList<>();
    private ArrayList<MenuItem> desserts = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
        this.dateRevised = new Date();
    }

    // getters and setters

    public void addOneAppetizer(MenuItem appetizer) {
        appetizers.add(appetizer);
    }

    public void addOneMainCourse(MenuItem mainCourse) {
        mainCourses.add(mainCourse);
    }

    public void addOneDessert(MenuItem dessert) {
        desserts.add(dessert);
        }
        
}
