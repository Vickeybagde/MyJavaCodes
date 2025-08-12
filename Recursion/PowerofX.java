package Recursion;

public class PowerofX {
    public static int PWofX(int x, int n){
        
        //ye hai  hamara basecase
        if(n == 0){
            return 1;
        }
        
        
        // int xnm1 = PWofX(x, n);
        // int xn = x * xnm1;
        // return xn;

        return x * PWofX(x, n-1);
    }

    public static void main(String[] args) {
        System.out.println(PWofX(10, 5));
    }
}
