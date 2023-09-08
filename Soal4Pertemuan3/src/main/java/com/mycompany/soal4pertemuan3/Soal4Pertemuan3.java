/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal4pertemuan3;

/**
 *
 * @author LINDA
 */
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Soal4Pertemuan3 {

    public static void main(String[] args) {
        // Membaca jumlah penjualan bulan ini dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah penjualan bulan ini: ");
        int jumlahPenjualan = input.nextInt();

        // Gaji pokok
        double gajiPokok = 500000;

        // Harga per item
        double hargaPerItem = 50000;

        // Bonus penjualan per item
        double bonusPerItem = 0.10 * hargaPerItem;

        // Jumlah penjualan minimal untuk mendapatkan bonus 25%
        int penjualanMinimal25 = 40;

        // Jumlah penjualan minimal untuk mendapatkan bonus 35%
        int penjualanMinimal35 = 80;

        // Hitung total penjualan
        double totalPenjualan = jumlahPenjualan * hargaPerItem;

        // Hitung bonus berdasarkan jumlah penjualan
        double bonus;
        if (jumlahPenjualan >= penjualanMinimal35) {
            bonus = 0.35 * totalPenjualan;
        } else if (jumlahPenjualan >= penjualanMinimal25) {
            bonus = 0.25 * totalPenjualan;
        } else {
            bonus = bonusPerItem * jumlahPenjualan;
        }

        // Hitung gaji total
        double gajiTotal = gajiPokok + bonus;

        // Format output menjadi mata uang Rupiah
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setGroupingSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("Rp #,##0", symbols);
        String formattedGajiTotal = decimalFormat.format(gajiTotal);

        // Output gaji yang diterima
        System.out.println("Gaji yang diterima: " + formattedGajiTotal);
    }
}
