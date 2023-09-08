/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal2pertemuan3;

/**
 *
 * @author LINDA
 */

import java.util.Scanner;

public class Soal2Pertemuan3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String str = scanner.next();
            int num = scanner.nextInt();
            System.out.printf("%-15s%03d%n", str, num);
        }

        scanner.close();
    }
}
