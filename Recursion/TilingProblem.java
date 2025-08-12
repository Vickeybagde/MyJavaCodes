package Recursion;

public class TilingProblem {
    public static int tileFeetkarna(int n){
        if(n == 0 || n==1){
            return 1;
        }


        //for vertical choice
        int fnm1 = tileFeetkarna(n-1);

        //for horizontal choice
        int fnm2 = tileFeetkarna(n-2);

        int TotalTareekaTileFitKrneKa = fnm1 +fnm2;

        return TotalTareekaTileFitKrneKa;
    }

    public static void main(String args[]){
        System.out.println(tileFeetkarna(4));
    }
}
