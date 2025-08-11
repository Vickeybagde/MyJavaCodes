package Recursion;



public class Increasingorder {
    
    public static void PrintInc(int n){
        if(n == 10){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        PrintInc(n+1);
    }
    
    public static void main(String[] args) {
        int n = 1;
        PrintInc(n);
    }
}
