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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create scanner
        Scanner in = new Scanner(System.in);
        // ask for user's name
        System.out.println("What is your name?");
        // store user's name
        String NAME = in.nextLine();
        // output user's name
        System.out.println("Hello " + NAME + "!");
    }

}
