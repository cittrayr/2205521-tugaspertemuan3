/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.pkg2.petemuan.pkg3;

/**
 *
 * @author ctray
 */

import java.util.Scanner;

public class Soal2Petemuan3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input tiga sisi
        System.out.println("Masukkan panjang sisi A:");
        int sisiA = scanner.nextInt();

        System.out.println("Masukkan panjang sisi B:");
        int sisiB = scanner.nextInt();

        System.out.println("Masukkan panjang sisi C:");
        int sisiC = scanner.nextInt();

        // Memeriksa apakah semua sisi sama
        if (sisiA == sisiB && sisiB == sisiC) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}