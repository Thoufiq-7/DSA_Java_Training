abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.print("Eating");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}
public class Abstraction{
    public static void main(String[] args){
        Animal a=new Animal();//ca

    }
}