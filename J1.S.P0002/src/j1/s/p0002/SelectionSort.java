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
public class SelectionSort {

    // tao đối tượng array
    private int array[];

    /**
     * tao constructor rỗng
     */
    public SelectionSort() {
    }

    /**
     *
     * @param arr
     */
    public SelectionSort(int[] arr) {
        this.array = arr;
    }
    /**
     *
     * Setter
     */
    public void setArr(int[] arr) {
        this.array = arr;
    }

    /**
     *
     * @return 
     * @hàm getter
     */
    public int[] getArr() {
        return array;
    }

    /**
     *
     * @param n
     * @return
     */
    public int[] randomNumber(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int code = (int) Math.floor(((Math.random() * 99)));
            arr[i] = code;
        }
        return arr;
    }

    /**
     * selection sort method
     */
    public void sort() {
        int temp;
        int loc;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            loc = i;
            for (int j = i + 1; j < n; j++) {
                if (array[loc] > array[j]) {
                    loc = j;
                }
            }
            temp = array[i];
            array[i] = array[loc];
            array[loc] = temp;

        }
    }

    // hàm to string
    @Override
    public String toString() {
        String res = "";
        for (int i : array) {
            res += i + ", ";
        }
        return "[" + res.substring(0, res.length() - 2) + "]";
    }
}
