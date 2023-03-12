/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2_odc;

/**
 *
 * @author mario
 */
public class Circle implements Shape{
    double Radius;
    double pi = 3.14;

    public Circle(double Radius) {
        this.Radius = Radius;
    }

    @Override
    public void Draw() {
        System.out.println("The Circle is Drawed");
    }

    @Override
    public double getArea() {
        return pi*Radius*Radius;
    }
    
}
