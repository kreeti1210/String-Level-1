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
public class Lexico13 {
    
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("plz enter any string");
       int r;
       String name,name1;
       name = sc.nextLine();
       name1 = sc.nextLine();
       r = name.compareToIgnoreCase(name1);
       if(r == 0)
       {
           System.out.println("Same string");
       }
       else if(r>0)
       {
           System.out.println(name  + "Comes later");  
       }
       else
       {
           System.out.println(name1 + "comesssss");
       }
        
    }

}
