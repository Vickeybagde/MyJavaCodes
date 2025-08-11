package Recursion;

public class Naturalno {
    public static int  NAno(int n){
        if (n == 1){
            return 1;
        }
        int fnm1 = NAno(n-1);
        int fn = n + fnm1;
        return fn;
    }

    public static void main(String args[]){
        int n = 3;
        System.out.println("Sum of first" + n + "natural number is : " + NAno(n));
    }
}
