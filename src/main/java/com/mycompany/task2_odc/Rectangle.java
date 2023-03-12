/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2_odc;

/**
 *
 * @author mario
 */
public class Rectangle implements Shape{
    double dim1 ; 
    double dim2;

    public Rectangle(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    @Override
    public void Draw() {
        System.out.println("The Rectangle is Drawed");
    }

    @Override
    public double getArea() {
    return dim1*dim2;
    }
    
}
