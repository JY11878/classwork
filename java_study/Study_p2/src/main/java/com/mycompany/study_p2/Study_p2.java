/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.study_p2;
import java.util.Scanner;
/**
 *
 * @author Augustuss1
 */
public class Study_p2 {

    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;
        double num4;
        double num5;
        
        Scanner typing = new Scanner(System.in);
        System.out.println("type the initial value 1/5");
        num1 = typing.nextDouble();
        System.out.println("plus a value 2/5");
        num2 = typing.nextDouble();
        System.out.println("minus a value 3/5");
        num3 = typing.nextDouble();
        System.out.println("multiply by a value 4/5");
        num4 = typing.nextDouble();
        System.out.println("divide by a value 5/5");
        num5 = typing.nextDouble();
            //assign to numbers
        double solution;
        solution = ((num1+num2)-num3)*num4/num5;
        System.out.println("solution="+solution);
    }
}
