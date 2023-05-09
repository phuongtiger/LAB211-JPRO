/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0001;

/**
 *
 * @author Nguyễn Văn Khởi -CE170049
 */
public class BubbleSort {
// tao đối tượng array
	private int array[];

    /**
     * tao constructor rỗng
     */
    public BubbleSort() {
	}

    /**
     *
     * @param tạo constructor có tham số
     */
    public BubbleSort(int[] arr) {
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
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
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
