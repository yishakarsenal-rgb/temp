/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temp;

/**
 *
 * @author HP
 */
import java.util.Scanner;   
public class Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter f value");
        double f = input.nextDouble();
        double c = (f - 32) * 9 / 5;
        System.out.println(c);
    }
}
