/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0001;

import java.util.Scanner;
/**
 *
 * @author hoang
 */
public class J1SP0001 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			int code = (int) Math.floor(((Math.random() * 99)));
			arr[i] = code;
		}
		BubbleSort arr1 = new BubbleSort(arr);//Create a object point to address has value
		System.out.println("Unsorted array: " + arr1.toString());
		arr1.sort();
		System.out.println("Sorted array: " + arr1.toString());

	}
}
