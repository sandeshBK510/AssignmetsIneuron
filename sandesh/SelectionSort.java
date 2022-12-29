package com.sandesh;

public class SelectionSort {
	static void selectionSort(int []arr) {
	 for (int i = 0; i < arr.length; i++) {
		int index = i;
		for (int j = i+1; j < arr.length; j++) {
			if(arr[j]< arr[index]){
				index = j ;
				
			}
			
		}
		int smallerNumber = arr[index];
		arr[index] = arr[i];
		arr[i]= smallerNumber;
		
	}
	}

	public static void main(String[] args) {
		int[] arr1 = {9,14,3,2,43,11,58,22};
		System.out.println("Sorted array: ");
		selectionSort(arr1);
		for (int j : arr1) {
			System.out.print(j+" ");
		}
		
		

	}

}
