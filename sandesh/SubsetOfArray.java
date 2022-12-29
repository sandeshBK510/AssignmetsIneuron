package com.sandesh;

public class SubsetOfArray {
	static boolean subSet(int []arr1,int [] arr2,int m , int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) { 
				if(arr2[i] == arr1[j]) 
					break;
				if(j == m)
					
				return false;
				
			}
			
			
			
		}
		return true;
	}
	public static void main(String[] args) {
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };
        int m = arr1.length;
        int n = arr2.length;
        
        if(subSet(arr1,arr2,m,n))
        	System.out.println("array2 is the subset of array 1");
        else
        	System.out.println("array 2 is not a subset of array 1");
		
	}

}
