
import java.util.Scanner;

public class MyArrays{
    Scanner sc;

    public MyArrays(){
        sc = new Scanner(System.in);
    }
    //This method is used to find and return index of an element
    public int find(int[] arr, int target) {
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                idx = i;
                break;
            }
        }
        return  idx;
    }

    public int[] createArray(){
        System.out.print("Enter length of array: ");
        int[] arr = new int[sc.nextInt()];

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public void traverse(int[] arr, int  n){
        System.out.println("Elements in the Array: ");
        for(int i=0; i<n; i++){
            System.out.print("Element -> " + arr[i]);
        }
    }

    public void replaceValue(int[] arr){
        System.out.println("Enter value to find: ");
        int target = sc.nextInt();
        int idx = find(arr, target);
        if(idx != -1){
            System.out.println("Enter element to replace:  ");
            arr[idx] = sc.nextInt();
            return;
        }else{
            System.out.println("Element Not Found!");
        }
    }




    public void reverseArray(int[] arr, int start, int end){
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
    }

    // [1, 2, 3, 4, 5] => full reverse [5, 4, 3, 2, 1]
    //r = 2 rotate upper half till 2 => [4, 5, 3, 2, 1]
    //rotate the rest => [4, 5, 1, 2, 3]
    public void rotateClockWise(int[] arr){
        System.out.println("Enter number of rotations: ");
        int r = sc.nextInt();
        r %= arr.length;

        reverseArray(arr,0, arr.length-1);
        reverseArray(arr, 0, r-1);
        reverseArray(arr, r, arr.length-1);

    }

    // [1, 2, 3, 4, 5] => rotate the first half till r => [2, 1, 3, 4, 5]
    //rotate rest of the array => [2, 1, 5, 4, 3]
    //rotate full array => [3, 4, 5, 1, 2]
    public void rotateAntiClockWise(int[] arr){
        System.out.print("Enter number of rotations: ");
        int r = sc.nextInt();
        r %= arr.length;

        reverseArray(arr,0, r-1);
        reverseArray(arr, r, arr.length-1);
        reverseArray(arr, 0, arr.length-1);

    }

    public int insertAtEnd(int[] arr, int n){
        System.out.print("Enter element to insert at end: ");
        int el = sc.nextInt();

        if(n >= arr.length){
            System.out.println("Array is already full!");
            return n;
        }else{
            arr[n] = el;
            System.out.println("Insertion Successful!!");
        }
        return n+1;
    }

    public int  insertionAtPosition(int[] arr, int n, int pos){
        System.out.println("Enter element to insert at position: ");
        int el = sc.nextInt();

        if(n >= arr.length){
            System.out.println("Array is already full!!");
            return n;
        }else{
            for(int i=n; i>pos; i--){
                arr[i] = arr[i-1];
            }
            arr[pos] = el;
            System.out.println("Insertion Successful!!");
        }
        return n+1;
    }

    public int insertionAtBeginning(int[] arr, int n){
        System.out.println("Enter element to insert : ");
        int el = sc.nextInt();

        if(n >= arr.length){
            System.out.println("Array is already full!!");
            return n;
        }else{
        for(int i=n; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = el;
        System.out.println("Insertion Successful!!");
        }
        return n+1;
    }

    public static void main(String[] args) {
        MyArrays a1 = new MyArrays();
//        int[] arr = a1.createArray();
        int[] arr2 = new int[10];
        int n = 5;
        arr2[0] = 1;
        arr2[1] = 5;
        arr2[2] = 4;
        arr2[3] = 3;
        arr2[4] = 2;
        a1.reverseArray(arr2, 0 , n-1);

        n =  a1.insertionAtBeginning(arr2, n);
        n = a1.insertionAtPosition(arr2, n, 4);
        a1.traverse(arr2);

    }
}