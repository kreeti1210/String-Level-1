/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;


public class Palindrome_word_9 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1=sc.nextLine();
        String t="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            char c=s1.charAt(i);
           t=t+c;
            
        }
        if(t.equalsIgnoreCase(s1))
             System.out.println("Palindrome string");
        else
      System.out.println("not Palindrome string");
     }
}
