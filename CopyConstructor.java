public class CopyConstructor {
    public static void main (String args []){
        student s1 = new student();
        s1.name = "vickey";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 95;
        s1.marks[2] = 85;
        student s2 = new student(s1);
        s2.password = "xyz";
        s1.marks[1] = 96;

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class student{
    String name;
    int roll;
    String password;
    int marks[];

    //copy constructor
    student ( student s1){
        marks =  new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    
    }

    student(){
        marks =  new int[3];
        System.out.println("constructor called...");
    }

    student(String name){
        marks =  new int[3];
        this.name = name;
    }

    student(int roll){
        marks =  new int[3];
        this.roll = roll;
    }
}
