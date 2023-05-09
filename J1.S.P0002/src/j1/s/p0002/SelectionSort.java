/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0002;

/**
 *
 * @author hoang
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
     * @param tạo constructor có tham số
     */
    public SelectionSort(int[] arr) {
        this.array = arr;
    }
    // hàm setter 

    public void setArr(int[] arr) {
        this.array = arr;
    }

    /**
     *
     * @hàm getter
     */
    public int[] getArr() {
        return array;
    }

    /**
     * hàm sắp xếp mảng bằng phương pháp bubble sort
     */
    public void sort() {
        int temp;
        int loc;
        int loc2;
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
