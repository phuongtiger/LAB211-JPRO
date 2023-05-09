/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0001;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Văn Khởi -CE170049
 */
public class J1SP0001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tạo lớp scanner sc để nhập số phần tử trong mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        int n = sc.nextInt();
        BubbleSort RandomNumber = new BubbleSort();//Create a object point to address has value
        int tempArr[] = RandomNumber.randomNumber(n);
        BubbleSort Arr = new BubbleSort(tempArr);
        System.out.println("Unsorted array: " + Arr.toString());
        Arr.sort();
        System.out.println("Sorted array: " + Arr.toString());

    }
}
