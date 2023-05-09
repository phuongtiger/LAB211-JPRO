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
        System.out.println("Enter number of array: ");
        // tạo lớp scanner sc để nhập số phần tử trong mảng
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SelectionSort RandomNumber = new SelectionSort();//Create a object point to address has value
        int tempArr[] = RandomNumber.randomNumber(n);
        SelectionSort Arr = new SelectionSort(tempArr);
        System.out.println("Unsorted array: " + Arr.toString());
        Arr.sort();
        System.out.println("Sorted array: " + Arr.toString());
    }

}
