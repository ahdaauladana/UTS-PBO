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
public class uts {
    public static void main(String[] args) {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    
         System.out.println("uts 20 mei 20204 oleh:\n"
                 +  "Nama : Ahda Auladana Atalla\n"
                 +  "NIM  : 23201089"); 
        
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
        String panggilan;
        // menentukan panggilan 
        switch (jenis_kelamin) {
           case 1: 
              panggilan = "Mas";
              break;
           case 2:
               panggilan = "mbak"; 
               break;
            default:
               panggilan = "pastikan pilihan jenis kelamin anda benar";
               break;             
                
        } 
        System.out.println("selamat datang:\n" + panggilan + "" + nama); 
         
        }
}
