/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2_odc;

/**
 *
 * @author mario
 */
public class Triangle implements Shape {
    double Base;
    double Height;

    public Triangle(double Base, double Height) {
        this.Base = Base;
        this.Height = Height;
    }
    
    @Override
    public void Draw() {
        System.out.println("this triangle is Drawed");
    }

    @Override
    public double getArea (){
       return 0.5*Base*Height;
    }
    
}
