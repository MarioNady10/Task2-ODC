/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.task2_odc;

import java.util.Scanner;


/**
 *
 * @author mario
 */
public class Task2_ODC {

    static int getSum(int N) {
        int sum = 0;
        if (N != 0) {
            sum = N + getSum(N - 1);
            return sum;
        } else {
            return N;
        }
    }
    static double sumAreas(Shape s1,Shape s2 , Shape s3){
        return s1.getArea()+s2.getArea()+s3.getArea();
    }

    public static void main(String[] args) {
        System.out.println("Enter THe Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum Of Numbwers is = " + getSum(n));
        System.out.println("====================================================================================");
        Triangle T1 = new Triangle(10, 5);
        T1.Draw();
        System.out.println("The Area of the T1 = " + T1.getArea());
        System.out.println("====================================================================================");
        Circle c1 = new Circle(14);
        c1.Draw();
        System.out.println("The Area of the c1 = " + c1.getArea());
        System.out.println("====================================================================================");
        Rectangle R1 = new Rectangle(10, 5);
        R1.Draw();
        System.out.println("The Area of the R1 = " + R1.getArea());
        System.out.println("====================================================================================");
        System.out.println("The sum of Three Areas = " + sumAreas(T1, c1, R1));
    }
}
