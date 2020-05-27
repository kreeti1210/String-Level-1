/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class FullShort2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First name:");
        String s1=sc.nextLine();
        System.out.println("Enter the Middle name:");
        String s2=sc.nextLine();
        System.out.println("Enter the Last name:");
        String s3=sc.nextLine();
        System.out.println("The Full name: "+s1+" "+s2+" " +s3);
        System.out.println("The Full name: "+s1.charAt(0)+" "+s2.charAt(0)+" "+s3.charAt(0));
        
        
    }
    
}
