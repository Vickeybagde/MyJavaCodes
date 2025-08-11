public class Iheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.breath();
        shark.Swim();
        shark.eat();
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

class Fish extends Animal{
    int fins;

    void Swim(){
        System.out.println("swim...");
    }
}
