package com.pack.programs;

public class SelectionSort {
	
	public void sort(int arr[]) {
		int size=arr.length;
		for(int i=0;i<size-1;i++) {
			
			int min_idx=i;
			
			for(int j=i+1;j<size;j++) {
				
				if(arr[min_idx]>arr[j]) {
					min_idx=j;
				}
				int temp=arr[min_idx];
				arr[min_idx]=arr[i];
				arr[i]=temp;
			}
			
			
			
		}
	}
	public void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
