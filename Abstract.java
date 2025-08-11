public class Abstract {
    public static void main(String args[]){
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // h.gapagap();
        // System.out.println(h.rang);
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // c.gapagap();

        Mustang Ghoda = new Mustang();
        //Animal--> Horse --> Mustang 0/.x

        

    }
}

abstract class Animal{

    String rang;
    Animal(){
        // rang = "bhura";
        System.out.println("Animal constructor chalan..");
    }
    void eat(){
        System.out.println("Animal Eating.....");
    }
    abstract void walk();

    abstract void gapagap();
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor chalan...");
    }
    
    void changerang(){
        rang = "dambar";
    }
    
    void walk(){
        System.out.println("4 per se chalna");
    }


    void gapagap(){
        System.out.println("jor se aur bada gapagap");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor chalan...");
    }
}

class Chicken extends Animal{
    void walk(){

        System.out.println("2 per se chalna");
    }

    void gapagap(){
        System.out.println("komda komdi gapagap");
    }
}
