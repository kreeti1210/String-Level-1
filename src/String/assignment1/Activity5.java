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
public class Activity5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1=sc.nextLine();
          System.out.println("Enter the second string:");
        String s2=sc.nextLine();
        String t="";
        for(int i=s2.length()-1;i>=0;i--)
        {
            char c=s2.charAt(i);
           t=t+c;
            
        }
        System.out.println(s1.concat(t));
        
    }
}
