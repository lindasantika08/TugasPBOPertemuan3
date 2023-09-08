/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal3pertemuan3;

/**
 *
 * @author LINDA
 */

import java.util.Scanner;
public class Soal3Pertemuan3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input A, operator, dan B
        int a = scanner.nextInt();
        String operator = scanner.next();
        int b = scanner.nextInt();

        // Melakukan operasi sesuai dengan operator
        int result = 0;
        switch (operator){
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "*":
                result = a*b; 
                break;
            case "/":
                result = a/b;
                break;
            case "%":
                result = a%b;
                break;
            default:
                System.out.println("Operator tidak tersedia");
                System.exit(1);
        }

        // Mencetak hasil operasi
        System.out.println(result);

        scanner.close();
    }
}
