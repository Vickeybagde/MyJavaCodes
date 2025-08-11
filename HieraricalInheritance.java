public class HieraricalInheritance {
    public static void main(String args[]){

        Mammal horse = new Mammal();
        horse.breath();
        horse.walk();
        
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats...");
    }

    void breath(){
        System.out.println("breaths...");
    }
}

class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("walk...");
    }
}

class Fish extends Animal{
    
    void swim(){
        System.out.println("Swim....");
    }
}

class Birds extends Animal{

    void fly(){
        System.out.println("Fly.....");
    }
}
