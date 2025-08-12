package Recursion;

public class FriendsPairing {
    public static int Dostokajod(int n){

        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        // int fnm1 = Dostokajod(n-1);

        // //pair
        // int fnm2 = Dostokajod(n-2);
        // int pairways = (n-1) * fnm2;     *ak tarika ye bhi hai*

        // //totalways
        // int totalways = fnm1 + pairways;
        // return totalways;

        return Dostokajod(n-1)+ (n-1)*Dostokajod(n-2);
    }

    public static void main(String args[]){
        System.out.println(Dostokajod(3));
    }
}
