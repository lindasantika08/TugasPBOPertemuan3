/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal5pertemuan3;

/**
 *
 * @author LINDA
 */
import java.util.Scanner;

public class Soal5Pertemuan3 {

    public static void main(String[] args) {
        // Membaca plat nomor 4 mobil sebagai input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan plat nomor 4 mobil (pisahkan dengan spasi): ");
        String[] platNomor = input.nextLine().split(" ");

        // Menggabungkan angka-angka dari 4 plat nomor mobil
        String gabunganAngka = "";
        for (String nomor : platNomor) {
            gabunganAngka += nomor;
        }

        // Menghitung sisa bagi setelah mengurangkan 999999
        long angka = Long.parseLong(gabunganAngka);
        long sisaBagi = (angka - 999999) % 5;

        // Menentukan apakah mobil harus berhenti atau tidak
        if (sisaBagi != 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}
