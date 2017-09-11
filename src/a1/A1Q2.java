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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create scanner
        Scanner in = new Scanner(System.in);

        // create array to store nums
        double[] nums = new double[3];
        // have user fill array
        for (int i = 0; i < nums.length; i++) {
            // ask user to input num
            System.out.println("Enter number " + (i + 1) + ":");
            // store num
            nums[i] = in.nextDouble();
        }

        // get product of nums
        double prod = (nums[0] * nums[1]) * nums[2];
        // output product
        System.out.println("The product of the numbers is " + prod);
        // get square of product
        double sq = Math.pow(prod, 2);
        // output square
        System.out.println("The square of the product is " + sq);
        // get square root of product
        double sqrt = Math.sqrt(prod);
        // output square root
        System.out.println("The square root of the product is " + sqrt);
    }

}
