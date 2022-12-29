package com.sandesh;

public class Duplicates {

	public static void main(String[] args) {
		 int [] a = {1,2,4,3,4,3,6,7,8,5};
	        for (int i=0;i<a.length;i++) {
	            for (int j=i+1;j<a.length;j++) {
	                if(a[i]==a[j]) {
	                    System.out.println(a[j]);
	                }
	            }
	        }


	    }

	}


