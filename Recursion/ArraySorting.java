package Recursion;

public class ArraySorting {
    public static boolean isSorted(int arr[], int i ){
        
        //Base Case
        if(i == arr.length-1){     
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }
    
    public static void main(String args[]){
        int arr[] = {1, 4, 3, 2};
        System.out.println(isSorted(arr, 0));
    }
}
