package Recursion;

public class Fibonacci {
    public static int Fibo(int n){
        if(n== 0 || n==1){
            return n;
        }

        int fnm1 = Fibo(n-1);
        int fnm2 = Fibo(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String args[]){
        int n = 4;
        System.out.println(Fibo(n));
    }
}
