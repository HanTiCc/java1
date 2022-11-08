/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject6;

import java.util.Scanner;

/**
 *
 * @author alver
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        double angka;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka anda = ");
        angka=scan.nextDouble();
        if (angka == 0) {
            System.out.print("OFF");
        } else {
            System.out.print("ON");
        }
    }
}
