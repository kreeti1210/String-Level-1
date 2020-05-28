/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String.assignment1;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Activity3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1=sc.nextLine();
          System.out.println("Enter the second string:");
        String s2=sc.nextLine();
        String t=s1.concat(s2);
        System.out.println("Result:     "+t);
    }
    
}
