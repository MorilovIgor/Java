/**
 *Java 1. Home work 5.
 *
 *@autor Morilov
 *@version 25.10.2021
*/

import java.util.Arrays;

class HomeWork5 {
    public static void main(String[] args) {
        Worker[] worker = {
            new Worker("Ivanov Ivan Ivanovich", "dev", "ivanov@mail.com", "8(999)-999-99-01", 50000, 45),
            new Worker("Petrov Petr Petrovich", "dev", "petrov@mail.com", "8(999)-999-99-02", 50000, 39),
            new Worker("Sidorov Sidor Sidorovich", "dev", "sidorov@mail.com", "8(999)-999-99-03", 50000, 22),
            new Worker("Fedorov Fedor Fedorovich", "QA", "fedorov@mail.com", "8(999)-999-99-04", 30000, 41),
            new Worker("Molotkov Molotok Molotkovich", "prod", "molotkov@mail.com", "8(999)-999-99-05", 1000, 40),
        };
        for (Worker person : worker) {
            if (person.getAge() > 40) {
                System.out.println(person);
            }
        }
    }
}

class Worker {
    private String name;
    private String post;
    private String email;
    private String tel;
    private int salary;
    private int age;
    
    Worker(String name, String post, String email, String tel, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public String toString() {
        return name+", "+post+", "+email+", "+tel+", "+salary+", "+age;
    }
}
