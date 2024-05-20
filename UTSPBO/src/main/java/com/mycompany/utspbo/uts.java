/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utspbo;

import java.util.Scanner;

/**
 *
 * @author A-18
 */
import java.util.Scanner;

public class uts {
    public static void main(String[] args) {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        System.out.println("uts 20 mei 2024 oleh:\n"
                + "Nama : Ahda Auladana Atalla\n"
                + "NIM  : 23201089");

        //batas bawah 
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        // inputan 
        Scanner scanner = new Scanner(System.in);

        String nama;

        System.out.println("masukkan nama: ");
        nama = scanner.nextLine();

        System.out.println("nama: " + nama);
        // memilih jenis kelamin 
        System.out.println("pilih jenis kelamin anda: ");
        System.out.println("1. laki - laki ");
        System.out.println("2. perempuan");
        System.out.println("masukkan pilihan anda (1 dan 2): ");
        int jenis_kelamin = scanner.nextInt();

        //var panggilan 
        String panggilan = "";
        // menentukan panggilan 
        switch (jenis_kelamin) {
            case 1:
                panggilan = "Mas";
                break;
            case 2:
                panggilan = "Mbak";
                break;
            default:
                panggilan = "Pastikan pilihan jenis kelamin anda benar";
                break;
        }
        System.out.println("selamat datang:\n" + panggilan + " " + nama);

        //kalkulator
        double angka1;
        double angka2;
        char operator;


        System.out.println("kalkulator");
        System.out.println("masukkan angka pertama");
        angka1 = scanner.nextDouble();
        System.out.println("masukkan operator (+,-,*,/): ");
        operator = scanner.next().charAt(0);// mengambil karakter dari string 
        System.out.println("masukkan angka kedua: ");
        angka2 = scanner.nextDouble();

        //menghitung hasil 
        double hasil = 0;
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 == 0) {
                    System.out.println("Pembagian dengan 0 tidak diizinkan! ");
                    return;
                }
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Operator tidak benar ");
                return;
        }

        //menampilkan hasil 
        System.out.println("Hasil: " + hasil);
        System.out.println("Terima kasih telah menggunakan kalkulator");
    }
}
