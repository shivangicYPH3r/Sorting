package abcd;
import java.util.*;
public class BubbleSort {
	static void bubbleSort(int[] arr){  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
        	 for(int j=1; j < (n-i); j++){  
        		 if(arr[j-1] > arr[j]){  
        			 temp = arr[j-1]; 
        			 arr[j-1] = arr[j]; 
        			 arr[j] = temp;}  
        		 }  
        	 }  
         }

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int N=input.nextInt();
		System.out.println("Enter the values in array");
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=input.nextInt();}
		System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");}  
        System.out.println();  
        bubbleSort(arr);
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");
                }  
        }  

	}


