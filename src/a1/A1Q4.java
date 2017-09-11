/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1;

import java.util.Scanner;

/**
 *
 * @author madis
 */
public class A1Q4 {

    // create procedure-type method, including user's num
    public static void row(int num) {
        // if line == 1
        if (num == 1) {
            // output line
            System.out.println("*");
        }
        // if line == 2
        if (num == 2) {
            // output line
            System.out.println("**");
        }
        // if line == 3
        if (num == 3) {
            // output line
            System.out.println("***");
        }
        // if line == 4
        if (num == 4) {
            // output line
            System.out.println("****");
        }
        // if line == 5
        if (num == 5) {
            // output line
            System.out.println("*****");
        }
        // if line == 6
        if (num == 6) {
            // output line
            System.out.println("******");
        }
        // if line == 7
        if (num == 7) {
            // output line
            System.out.println("*******");
        }
        // if line == 8
        if (num == 8) {
            // output line
            System.out.println("********");
        }
        // if line == 9
        if (num == 9) {
            // output line
            System.out.println("*********");
        }
        // if line == 10
        if (num == 10) {
            // output line
            System.out.println("**********");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create scanner
        Scanner in = new Scanner(System.in);
        // request number between 1 and 10
        System.out.println("Input a number between 1 and 10:");
        // store num
        int num = in.nextInt();

        if (num > 0 && num < 11) {

        }
    }

}
