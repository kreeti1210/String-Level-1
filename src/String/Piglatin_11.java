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
public class Piglatin_11 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
      System.out.println("plz enter any String");
      String s=(sc.nextLine()).toLowerCase();
      int i=0;
      for( i=0;i<s.length();i++)
      {
          
        char c = s.charAt(i);
        if(c == 'a' || c == 'e' || c == 'i' || c== 'o' || c == 'u')
        {
            break;
        }
      }
        System.out.println("the piglatin word="+"  "+s.substring(i)+s.substring(0,i)+"ay");
          
      }
    
              }

