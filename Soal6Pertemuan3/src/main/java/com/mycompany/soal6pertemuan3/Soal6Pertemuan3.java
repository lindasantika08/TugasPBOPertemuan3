/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal6pertemuan3;

/**
 *
 * @author LINDA
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Soal6Pertemuan3 {

    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Read the two input numbers as strings
        String aStr = scanner.nextLine();
        String bStr = scanner.nextLine();

        // Create BigInteger objects from the input strings
        BigInteger a = new BigInteger(aStr);
        BigInteger b = new BigInteger(bStr);

        // Calculate the sum and product
        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);

        // Print the results
        System.out.println(sum.toString());
        System.out.println(product.toString());

        // Close the scanner
        scanner.close();
    }
}
