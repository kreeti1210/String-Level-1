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
public class Activity4 {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("plz enter an string");
      String s;
      s = sc.nextLine().toLowerCase();
      
      char ch, cs;
      for(cs='a';cs<='z';cs++)
      {
          int c = 0;
         for(int i=0;i<s.length();i++)
         {
            ch = s.charAt(i);
            if(ch==cs)
            {
               c++; 
            }
         }
          
         if(c>0)
         {
             System.out.println("The Frequency of letter " + " " +  cs + " is  " + c);
         }
      }
    }
    
}

    

