package com.latihanMethod;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner inputUser = new Scanner (System.in);
        System.out.print("Masukan Nilai Panjang: ");
        int inputPanjang = inputUser.nextInt();
        System.out.print("Masukan Nilai Lebar: ");
        int inputLebar = inputUser.nextInt();
        gambar(inputPanjang, inputLebar);
        tampil(inputPanjang, inputLebar);
    }
    public static void tampil(int panjang, int lebar){
        System.out.println("Luas = " + luas(panjang, lebar));
        System.out.println("Luas = " + keliling(panjang, lebar));
    }
    public static int keliling (int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }
    public static int luas (int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }
    
    public static void gambar (int panjang, int lebar){
        for (int i = 0; i<lebar; i++){
            for (int j = 0; j<panjang; j++){
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }
}
