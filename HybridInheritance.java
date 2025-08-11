public class HybridInheritance {
    public static void main(String args[]){
        dog dogeshbhai = new dog();
        dogeshbhai.bark();
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

class dog extends Mammal{
    void bark(){
        System.out.println("bhow....");
    }
}

class cat extends Mammal{
    void meow(){
        System.out.println("Meow....");
    }
}

class Fish extends Animal{
    
    void swim(){
        System.out.println("Swim....");
    }
}

class Tuna extends Fish{

    void eatsmallfish(){
        System.out.println("eating small fishesh.....");
    }
} 

class shark extends Fish{

     void danger(){
        System.out.println("It is very dangerous...");
     }
}

class Birds extends Animal{

    void fly(){
        System.out.println("Fly.....");
    }
}

class peacock extends Birds{

    void beutiful(){
        System.out.println("Unique colors of wings....");
    }
}
