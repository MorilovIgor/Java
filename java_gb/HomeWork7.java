/**
 *Java 1. Home work 7.
 *
 *@autor Morilov
 *@vesion 28.10.2021
*/

import java.util.Scanner;

class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cat = { 
            new Cat("Barsik", 5),
            new Cat("Murzik", 3),
            new Cat("Pushok", 7),
            new Cat("Tiger", 17)
        };
        Plate plate = new Plate(30);
        
        System.out.println(plate);
        for (Cat cats : cat) {
            System.out.println(cats);
            cats.eat(plate);
            System.out.println(plate);
        }
        
        // покорми всех!
        plate.add(32);
        System.out.println(plate);
        for (Cat cats : cat) {
            cats.setFullnes(false);
            System.out.println(cats);
            cats.eat(plate);
            System.out.println(plate);
        }
        
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fullnes;
    
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    
    int getAppetite() {
        return appetite;
    }
    
    boolean getFullnes () {
        return fullnes;
    }
    
    void setFullnes(boolean status) {
        fullnes = status;
    }
    
    void eat(Plate plate) {
        if (!fullnes) {
            fullnes = plate.decreaseFood(appetite);
        }
    }
    
    @Override
    public String toString() {
        return "Cat "+name+", eat: "+appetite+", fullnes: "+fullnes;
    }
}

class Plate {
    private int food;
    
    Plate(int food) {
        this.food = food;
    }       

    void setFood(int food) {
        this.food = food;
    }
    
    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }
    
    void add(int food) {
        this.food += food;
    }
    
    @Override
    public String toString() {
        return "Plate: "+food;
    }
}
