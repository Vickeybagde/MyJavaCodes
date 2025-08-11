package Recursion;

public class Factorial {
    public static int Factno(int n){
        if(n == 0){
            //System.out.println(n);
            return 1;
        }

        int fnm1 = Factno(n-1);
        int fn = n * fnm1;
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of number"+ n +" is : " + Factno(n));
    }
}
