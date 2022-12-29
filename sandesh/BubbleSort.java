package com.sandesh;

public class BubbleSort {
	public static int bobbleSort(int a[]){
        for (int i = 0 ; i<a.length;i++){
            for(int j =1 ; j<a.length-i;j++){
                if(a[j] < a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1]=temp;

                }
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int [] a ={10, 7, 8, 9, 1, 5};
        bobbleSort(a);
        System.out.println("array after sort :");
        for (int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }

    }

}
