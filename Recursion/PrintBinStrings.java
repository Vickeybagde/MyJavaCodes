package Recursion;

public class PrintBinStrings {
    public static void BinaryString(int n, int lastplace, String str){
        // Base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        // "0" hamesha add kar sakte ho
        BinaryString(n - 1, 0, str + "0");

        // "1" tabhi add karna jab last place 0 ho
        if(lastplace == 0){
            BinaryString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args){
        BinaryString(3, 0, "");
    }
}

