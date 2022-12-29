package com.sandesh;

public class QuickSort {
	
	public int Partition(int[] a,int start,int end) {
		int pivot = a[end];
		int i = start-1;
		
		for(int j=start ; j<= end -1;j++) {
			if (a[j]<pivot) {
				i++;
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		int temp = a[i+1];
		 a[i+1]= a[end];
		 a[end]= temp;
		 return i+1;
		 
		 
		
		
	}
	void qsort(int []a ,int start,int end ) {
		if(start < end) {
			int pi = Partition(a,start,end);
			qsort(a,start,pi-1);
			qsort(a,pi+1,end);
		}
		 
		
	 }
	void printarr(int[]a,int n) {
		 n = a.length;
		for (int i = 0; i<n; i++) {
			System.out.print(a[i]+" ");
			
		
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		int [] a = {10, 7, 8, 9, 1, 5};
		int n = a.length;
		
		QuickSort q = new QuickSort();
		System.out.print("number before sorting: ");
		q.printarr(a, n);
		
		
		q.qsort(a, 0, n-1);
		System.out.print("number after sorting:  ");
		q.printarr(a, n);
	}
		
		
		
		
        
	}


