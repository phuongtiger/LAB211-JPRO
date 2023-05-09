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
public class Input {

    private int n;

    /**
     *
     */
    public Input() {

    }

    /**
     *
     * @param n
     */
    public Input(int n) {
        this.n = n;
    }

    /**
     *
     * @return
     */
    public int getN() {
        return n;
    }

    /**
     *
     * @param n
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     *
     */
    public void setInput() {
        System.out.println("Enter number of array: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    }

    /**
     *
     * @return
     */
    public int getInput() {
        return n;
    }
}
