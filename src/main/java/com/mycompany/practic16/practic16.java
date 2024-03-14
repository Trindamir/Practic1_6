/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic16;


import static com.mycompany.practic16.Autoservice.modify;
import java.util.Scanner;


 public class practic16{
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Brands name");
        String brand = scanner.nextLine();
        
        Car car = new Car();
        car.setBrand(brand);
        modify(car);
        
        System.out.println("Original brand: " + brand + "; "+"Modified brand: " + car.getBrand());
    }
 }
