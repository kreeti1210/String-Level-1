/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;

public class Gender_12 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine().toLowerCase();
       
        if(s.startsWith("mr "))
        {
            System.out.println("Male");
        }
        else if(s.startsWith("miss "))
        {
            System.out.println("Female");
        }
        else if(s.startsWith("mrs"))
        {
            System.out.println("Married Female");
        }
        else if(s.startsWith("kumari "))
        {
            System.out.println("Un-Married Female");
        }
        else
        {
            System.out.println("Cannot-determine");
        }
    }

     
    }

