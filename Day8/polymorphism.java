class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    Dog() {
        super("Dog");
    }  

    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    Cat() {
        super("Cat");
    }

    void sound() {
        super.sound();
        System.out.println("Cat meows");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Animal animal;

        animal = new Cat();
        animal.sound();

        animal = new Dog();
        animal.sound();
    }
}