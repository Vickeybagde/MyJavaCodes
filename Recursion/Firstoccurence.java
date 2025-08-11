package Recursion;

public class Firstoccurence {
    public static int phleaana(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }
        return phleaana(arr, key, i+1);
    }
    
    public static void main(String[] args) {
        int arr[] = { 2,4,6,5,4,7,8,10,12,14};
        System.out.println(phleaana(arr, 5, 0));
    }
}
