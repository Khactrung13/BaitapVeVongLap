/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapVeVongLap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3 {
    public static void main(String[] args) {
        //tong nghich dao
        Scanner sc = new Scanner(System.in);
        double Sum = 0;
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {            
                Sum += (double)1/i;           
        }
        System.out.println("Sum= "+ Sum);
    }
    
}
