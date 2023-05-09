/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0002;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class J1SP0002 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		 // tạo lớp scanner sc để nhập số phần tử trong mảng
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array: ");
		int n = sc.nextInt();
                //tạo mảng arr với số phần tử là n
		int[] arr = new int[n];
                // cho random n số phần tử trong mảng
		for(int i = 0; i < n; i++){
			int code = (int) Math.floor(((Math.random() * 99)));
			arr[i] = code;
		}
                // tạo đối tượng arr1 để truy xuất dữ liệu
		SelectionSort arr1 = new SelectionSort(arr);//Create a object point to address has value
		System.out.println("Unsorted array: " + arr1.toString());
		arr1.sort();
		System.out.println("Sorted array: " + arr1.toString());
	}
	
}
