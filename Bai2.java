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
public class Bai2 {
    public static void main(String[] args) {
        //Tong cac so le
        Scanner sc = new Scanner(System.in);
        int Sum = 0;
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i+=2) {
                Sum += i;
        }
        System.out.println("Sum= "+ Sum);
    }
    
}
