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
public class Frequency18 {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("plz enter an string");
      String str;
      str = sc.nextLine().toLowerCase();
      
      char ch;
      int cs;
      for(cs='a';cs<='z';cs++)
      {
          int count = 0;
         for(int i=0;i<str.length();i++)
         {
            ch = str.charAt(i);
            if(ch==cs)
            {
               count++; 
            }
         }
          
         if(count>0)
         {
             System.out.println("The Frequency of letters is" + " " + (char) cs + " " + count);
         }
      }
    }
    
}
