/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0002;

import java.util.Scanner;

/**
 *
 * @author HuynhDoanDucSieu-CE170433
 */
public class J1SP0002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Input in = new Input();
        in.setInput();
        int n = in.getInput();
        SelectionSort RandomNumber = new SelectionSort();//Create a object point to address has value
        int tempArr[] = RandomNumber.randomNumber(n);
        SelectionSort Arr = new SelectionSort(tempArr);
        System.out.println("Unsorted array: " + Arr.toString());
        Arr.sort();
        System.out.println("Sorted array: " + Arr.toString());
    }

}
