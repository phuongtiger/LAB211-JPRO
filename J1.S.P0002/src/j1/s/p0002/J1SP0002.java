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
		Scanner sc = new Scanner(System.in);
		SelectionSort arr = new SelectionSort();//Create a object point to address has value
		System.out.println("Enter number of array: ");
		int number = sc.nextInt();
		System.out.println("Unsorted array: ");
		System.out.println("Sorted array: ");
	}
	
}
