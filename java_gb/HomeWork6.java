/**
 *Java 1. Home work 6.
 *
 *@autor Morilov
 *@version 25.10.2021
*/

class HomeWork6 {
    
    public static void main(String[] args) {
        Cat cat = new Cat("Pushok", "Black", 2, 130, 0);
        Dog dog = new Dog("Rex", "green", 10, 500, 10);
        Animals[] animals = {cat, dog,};
        for (Animals animal : animals) {
            System.out.println(animal.voice());
            if (cat.run < 201 || cat.swim < 1 || dog.run < 501 || dog.swim < 11) {
                System.out.println(animal);
            } 
        }
    }
}

class Animals {
    protected String name;
    protected String color;
    protected int age;
    protected int run;
    protected int swim;

    Animals(String name, String color, int age, int run, int swim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.run = run;
        this.swim = swim;
    }
    
    public String voice() {
        return "something";
    }

    @Override
    public String toString() {
        return "name: "+name+", "+"color: "+color+", "+"age: "+age+"\n"+"run - "+run+"; "+"swim - "+swim;
    }
}

class Cat extends Animals {
    
    public String voice() {
        return "I'm a cat!";
    }

    Cat(String name, String color, int age, int run, int swim) {
        super(name, color, age, run, swim);
    }
}

class Dog extends Animals {
    
    public String voice() {
        return "I'm a dog!";
    }
    
    Dog(String name, String color, int age, int run, int swim) {
        super(name, color, age, run, swim);
    }
}
    


