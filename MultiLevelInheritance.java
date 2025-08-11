public class MultiLevelInheritance {
    public static void main(String args[]){
        Dog dogeshbhai = new Dog();
        dogeshbhai.legs = 4;
        System.out.println(dogeshbhai.legs);
        dogeshbhai.eat();
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
}

class Dog extends Mammal{
    String breed;
}
