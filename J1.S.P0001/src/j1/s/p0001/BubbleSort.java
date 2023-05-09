/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0001;

/**
 *
 * @author hoang
 */
public class BubbleSort {

	private int arr[];
	public BubbleSort() {
	}

	public BubbleSort(int[] arr) {
		this.arr = arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int[] getArr() {
		return arr;
	}

	public void sort() {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	@Override
	public String toString() {
		String res = "";
		//[0, 2, 3, 7, 9]
		for (int i : arr) {
			res += i + ", ";
		}
		return "[" + res.substring(0, res.length() - 2) + "]";
	}
}
