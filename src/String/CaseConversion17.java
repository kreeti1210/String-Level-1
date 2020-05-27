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
public class CaseConversion17 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
          if(Character.isUpperCase(c))
              t=t+Character.toLowerCase(c);
          else
              t=t+Character.toUpperCase(c);
            
        }
        
         System.out.println(t);
}
}
