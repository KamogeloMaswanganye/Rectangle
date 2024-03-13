/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;

/**
 *
 * @author 111ma
 */
public class Rectangle {
    // Attributes
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate and return the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate and return the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        // Example usage
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.calculatePerimeter());
    }
}

