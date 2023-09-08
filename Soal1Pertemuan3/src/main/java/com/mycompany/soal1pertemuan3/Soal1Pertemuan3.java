/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal1pertemuan3;

/**
 *
 * @author LINDA
 */
import java.util.Scanner;
import java.util.regex.Matcher;  //Matcher digunakan untuk mencari, mencocokkan, dan mengambil substring yang sesuai dengan pola dari string input
import java.util.regex.Pattern; //Pattern digunakan untuk mendefinisikan ekspresi reguler (pola)

public class Soal1Pertemuan3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // Pola ekspresi reguler untuk menemukan token
        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(input);

        // Menghitung jumlah token
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        // Mencetak jumlah total token
        System.out.println(count);

        // Mencetak setiap token
        matcher.reset(); // Reset matcher ke awal
        while (matcher.find()) {
            String token = matcher.group();
            System.out.println(token);
        }
    }
}
