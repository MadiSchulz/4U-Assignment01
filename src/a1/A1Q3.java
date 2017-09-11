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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create scanner
        Scanner in = new Scanner(System.in);

        // ask user
        System.out.println("Cost of food:");
        // store cost of food
        double food = in.nextDouble();

        // ask user
        System.out.println("Cost of DJ:");
        // store cost of dj
        double dj = in.nextDouble();

        // ask user
        System.out.println("Cost of hall rental:");
        // store cost of hall
        double hall = in.nextDouble();

        // ask user
        System.out.println("Cost of decorations:");
        // store cost of decor
        double decor = in.nextDouble();

        // ask user
        System.out.println("Cost of wait staff:");
        // store cost of staff
        double staff = in.nextDouble();

        // ask user
        System.out.println("Cost of miscellaneous:");
        // store cost of misc
        double misc = in.nextDouble();

        // get total cost
        double tot = food + dj + hall + decor + staff + misc;
        // get # of tickets sold to match total
        double tix = Math.ceil(tot / 35);

        // output tot & tix required
        System.out.println(tix + " prom tickets need to be sold to cover the total cost of $" + tot + ".");
    }

}
