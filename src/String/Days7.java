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
public class Days7 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        if(s.equalsIgnoreCase("monday"))
              System.out.println("1");
         else if(s.equalsIgnoreCase("tuesday"))
              System.out.println("2");
          else  if(s.equalsIgnoreCase("wednesday"))
              System.out.println("3");
          else    if(s.equalsIgnoreCase("thursday"))
              System.out.println("4");
            else    if(s.equalsIgnoreCase("friday"))
              System.out.println("5");
            else      if(s.equalsIgnoreCase("saturday"))
              System.out.println("6");
               else
                
              System.out.println("7");
    
}
}
