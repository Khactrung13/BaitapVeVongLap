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
public class Bai4 {
    public static void main(String[] args) {
        //Tich so chan
        Scanner sc = new Scanner(System.in);
        int P = 1;
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        for (int i = 2; i <= (2*n); i+=2) {
                P*= i;
        }
        System.out.println("Tich= "+ P);
    }
}
